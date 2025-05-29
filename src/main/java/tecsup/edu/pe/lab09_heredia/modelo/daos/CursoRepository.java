package tecsup.edu.pe.lab09_heredia.modelo.daos;

import tecsup.edu.pe.lab09_heredia.modelo.entidades.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
}