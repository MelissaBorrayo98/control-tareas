# Práctica de Laboratorio: Sistema de Control de Tareas

## 1. Datos del Estudiante
* **Nombre completo:** Melissa Betzabeh Borrayo Mejía
* **Carné / Número de estudiante:** 9941-25-28099
* **Curso:** Programación II
* **Universidad:** Universidad Mariano Gálvez de Guatemala

---

## 2. Descripción del Problema
Esta aplicación desarrollada en Java permite la gestión de una lista de tareas pendientes utilizando estructuras de datos en memoria (`ArrayList`). El proyecto tiene como objetivo aplicar conceptos fundamentales de Programación Orientada a Objetos (POO), automatización de construcción de proyectos con **Apache Maven**, control de versiones con **Git/GitHub**, y el diseño de arquitectura básica para servicios y **APIs REST** basados en el protocolo HTTP y formato JSON.

---

## 3. Tecnologías Utilizadas
* **Lenguaje de programación:** Java 17
* **Herramienta de gestión y construcción:** Apache Maven
* **Entorno de Desarrollo (IDE):** IntelliJ IDEA
* **Control de versiones:** Git y GitHub

---

## 4. Datos del Proyecto Maven
* **`groupId`:** `com.estudiante`
* **`artifactId`:** `control-tareas`
* **`version`:** `1.0-SNAPSHOT`

### Explicación de los Parámetros de Maven:
* **`groupId`:** Identifica de forma única a la organización, dominio o paquete principal del proyecto a nivel global (por convención se utiliza el dominio en orden inverso, ej. `com.estudiante`).
* **`artifactId`:** Nombre del proyecto o módulo individual, el cual también se utiliza como nombre base para generar el archivo comprimido ejecutable (`.jar`).
* **`version`:** Indica la versión actual de desarrollo del proyecto. La etiqueta `-SNAPSHOT` indica que el proyecto está en una fase activa de desarrollo y aún no es una versión final de producción.

---

## 5. Instrucciones para Compilar y Ejecutar el Proyecto

### Desde el panel gráfico de IntelliJ IDEA:
1. Abrir el panel de **Maven** ubicado en el lateral derecho.
2. Desplegar la carpeta **`control-tareas > Lifecycle`**.
3. Ejecutar en orden con doble clic:
    * **`clean`**: Limpia los archivos creados en compilaciones anteriores.
    * **`compile`**: Compila el código fuente Java.
    * **`test`**: Ejecuta las pruebas unitarias.
    * **`package`**: Empaqueta el proyecto compilado y genera el archivo ejecutable `.jar` dentro de la carpeta `target/`.

### Desde la terminal de comandos:
```bash
mvn clean
mvn compile
mvn test
mvn package
## Parte 5: Diseño de la API REST

| Operación | Método HTTP | Endpoint | Respuesta esperada |
| :--- | :---: | :--- | :---: |
| Consultar todas las tareas | GET | /api/tareas | 200 OK |
| Consultar una tarea | GET | /api/tareas/{id} | 200 OK |
| Registrar una tarea | POST | /api/tareas | 201 Created |
| Modificar una tarea | PUT | /api/tareas/{id} | 200 OK |
| Eliminar una tarea | DELETE | /api/tareas/{id} | 204 No Content |
| Consultar una tarea inexistente | GET | /api/tareas/{id} | 404 Not Found |

## 7. Representación JSON (Parte 6)

### Ejemplo de Estructura JSON:
```json
{
  "id": 1,
  "titulo": "Estudiar Programación II",
  "descripcion": "Repasar POO y diseño de APIs REST",
  "prioridad": "ALTA",
  "completada": false
}
