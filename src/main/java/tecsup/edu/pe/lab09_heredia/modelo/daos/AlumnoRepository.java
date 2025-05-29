package tecsup.edu.pe.lab09_heredia.modelo.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import tecsup.edu.pe.lab09_heredia.modelo.entidades.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, String> {
    // Puedes agregar métodos personalizados si lo necesitas
}
