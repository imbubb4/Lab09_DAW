package tecsup.edu.pe.lab09_heredia.servicios;
import tecsup.edu.pe.lab09_heredia.modelo.entidades.Curso;
import java.util.List;

public interface CursoService {
    public List<Curso> listar();
    public void grabar(Curso curso);
    public Curso buscar(Integer id);
    public void eliminar(Integer id);
}

