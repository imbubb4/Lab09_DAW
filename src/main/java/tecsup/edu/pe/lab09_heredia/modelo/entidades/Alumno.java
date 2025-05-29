package tecsup.edu.pe.lab09_heredia.modelo.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @Column(name = "chr_alu_codigo")
    private String codigo;

    @NotEmpty
    @Column(name = "vch_alu_nombres")
    private String nombres;

    @NotEmpty
    @Column(name = "vch_alu_apellidos")
    private String apellidos;

    @Past
    @Column(name = "dtm_alu_fecha_nac")
    private LocalDate fechaNac;

    @NotNull
    @Pattern(regexp = "M|F", message = "Sexo debe ser 'M' o 'F'")
    @Column(name = "chr_alu_sexo")
    private String sexo;

    // Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
