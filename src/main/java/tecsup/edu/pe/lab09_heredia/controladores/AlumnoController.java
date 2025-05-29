package tecsup.edu.pe.lab09_heredia.controladores;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import tecsup.edu.pe.lab09_heredia.modelo.entidades.Alumno;
import tecsup.edu.pe.lab09_heredia.servicios.AlumnoService;

import java.util.Map;

@Controller
@SessionAttributes("alumno")
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService servicio;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de Alumnos");
        model.addAttribute("alumnos", servicio.listar());
        return "listarAlumnoView";
    }

    @GetMapping("/form")
    public String crear(Map<String, Object> model) {
        Alumno alumno = new Alumno();
        model.put("alumno", alumno);
        model.put("titulo", "Formulario de Alumno");
        return "formAlumnoView";
    }

    @GetMapping("/form/{codigo}")
    public String editar(@PathVariable String codigo, Map<String, Object> model) {
        Alumno alumno = servicio.buscar(codigo);
        if (alumno == null) {
            return "redirect:/alumnos/listar";
        }
        model.put("alumno", alumno);
        model.put("titulo", "Editar Alumno");
        return "formAlumnoView";
    }

    @PostMapping("/form")
    public String guardar(@Valid Alumno alumno, BindingResult result, Model model, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de Alumno");
            return "formAlumnoView";
        }
        servicio.grabar(alumno);
        status.setComplete();
        return "redirect:/alumnos/listar";
    }

    @GetMapping("/eliminar/{codigo}")
    public String eliminar(@PathVariable String codigo) {
        servicio.eliminar(codigo);
        return "redirect:/alumnos/listar";
    }
}
