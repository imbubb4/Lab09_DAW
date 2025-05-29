package tecsup.edu.pe.lab09_heredia.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tecsup.edu.pe.lab09_heredia.modelo.daos.AlumnoRepository;
import tecsup.edu.pe.lab09_heredia.modelo.entidades.Alumno;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository repo;

    @Override
    public List<Alumno> listar() {
        return repo.findAll();
    }

    @Override
    public Alumno buscar(String codigo) {
        Optional<Alumno> opt = repo.findById(codigo);
        return opt.orElse(null);
    }

    @Override
    public void grabar(Alumno alumno) {
        repo.save(alumno);
    }

    @Override
    public void eliminar(String codigo) {
        repo.deleteById(codigo);
    }
}
