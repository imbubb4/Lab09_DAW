# 🧪 Proyecto CRUD con Spring Boot y MySQL

Este proyecto forma parte del laboratorio de la asignatura **Desarrollo de Aplicaciones Web Avanzado** (4C24 - Sección A/B) y tiene como objetivo la implementación de un CRUD completo utilizando **Spring Boot**, **MySQL** y **Thymeleaf**.

## 🚀 Tecnologías usadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Thymeleaf
- Maven

## 🗃️ Estructura del Proyecto
```
PRJ_CRUD_SPRING_BOOT_MYSQL_
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com.example.demo
│ │ │ ├── controller/ # CursoController.java
│ │ │ ├── entity/ # Curso.java
│ │ │ ├── repository/ # CursoRepository.java
│ │ │ ├── service/ # CursoService.java, CursoServiceImpl.java
│ │ │ └── DemoApplication.java
│ │ └── resources/
│ │ ├── templates/ # formView.html, listarView.html
│ │ ├── application.properties
│ │ └── import.sql
│ └── test/
│
├── pom.xml
└── README.md
```
## 📦 Funcionalidades

- Registro de nuevos cursos.
- Visualización en tabla de los cursos existentes.
- Actualización de registros.
- Eliminación de registros.
- Inicialización automática de datos desde `import.sql`.

## ⚙️ Configuración rápida

1. Instala MySQL y crea la base de datos `escuela`.
2. Asegúrate de que `application.properties` tenga las credenciales correctas.
3. Ejecuta la aplicación desde IntelliJ IDEA.
4. Accede a `http://localhost:8080/cursos`.

## 📌 Consideraciones

- Usar `spring.jpa.hibernate.ddl-auto=create-drop` durante el desarrollo. **No recomendable en producción.**
- Cada sentencia SQL en `import.sql` debe estar separada por `;` para evitar errores de carga.
- Revisa bien los `th:href` en Thymeleaf para evitar rutas rotas.

## 🧠 Conclusiones del laboratorio

1. La correcta estructura del archivo `import.sql` es crucial para inicializar los datos.
2. La configuración de Hibernate puede eliminar tablas si no se usa con cuidado.
3. Es fundamental que los nombres de columna coincidan entre JPA y la base de datos.
4. Spring Boot simplifica el desarrollo de CRUDs, pero hay que prestar atención a los detalles.
5. La lectura calmada de logs permite encontrar la raíz de muchos errores sin frustración.

## 📎 Enlace al repositorio

🔗 [https://github.com/imbubb4/Lab09_DAW.git](https://github.com/imbubb4/Lab09_DAW.git)
