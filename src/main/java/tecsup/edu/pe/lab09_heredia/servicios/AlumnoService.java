package tecsup.edu.pe.lab09_heredia.servicios;

import tecsup.edu.pe.lab09_heredia.modelo.entidades.Alumno;

import java.util.List;

public interface AlumnoService {
    List<Alumno> listar();
    Alumno buscar(String codigo);
    void grabar(Alumno alumno);
    void eliminar(String codigo);
}
