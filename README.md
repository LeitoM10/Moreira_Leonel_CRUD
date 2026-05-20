# Sistema CRUD con Herencia en Java

##  Descripción del proyecto
Este proyecto consiste en el desarrollo de una aplicación en Java por consola que permite gestionar personas dentro de una institución educativa. Se implementa un sistema CRUD (Crear, Leer, Actualizar y Eliminar) utilizando Programación Orientada a Objetos (POO), herencia, ArrayList y manejo de excepciones.

El sistema permite registrar dos tipos de personas:
- Estudiantes
- Docentes
  
## Conceptos aplicados

### Herencia
Se implementa una clase padre llamada `Persona` que contiene atributos generales como:
- cédula
- nombre
- edad

A partir de esta clase se derivan dos subclases:
- `Estudiante` (añade el atributo carrera)
- `Docente` (añade el atributo asignatura)

Esto permite reutilizar código y aplicar el principio de jerarquía en POO.

Además, se utiliza sobrescritura de métodos (`@Override`) para personalizar la forma en que se muestran los datos.

### ArrayList
Se utiliza un `ArrayList<Persona>` para almacenar los registros dinámicamente.

Esto permite:
- Agregar nuevos elementos (`add`)
- Recorrer la lista (`for`)
- Acceder a elementos (`get`)
- Actualizar registros (`set`)
- Eliminar elementos (`remove`)

El uso de ArrayList es importante porque permite manejar colecciones dinámicas en lugar de arreglos fijos.

### CRUD
El sistema implementa las cuatro operaciones básicas:

- **CREATE:** Registrar estudiantes o docentes
- **READ:** Mostrar todos los registros almacenados
- **UPDATE:** Modificar datos de un registro existente
- **DELETE:** Eliminar un registro seleccionado

Estas operaciones son controladas mediante un menú interactivo en consola.

### Manejo de excepciones (try-catch)
Se utiliza `try-catch` para evitar que el programa se detenga por errores del usuario.

Se controlan situaciones como:
- Ingreso de letras en lugar de números
- Opciones inválidas en el menú
- Índices inexistentes
- Campos vacíos

Esto permite que el sistema sea más robusto y continúe ejecutándose correctamente.

## Funcionamiento del sistema

El programa presenta un menú interactivo con las siguientes opciones:

1. Registrar persona  
2. Mostrar registros  
3. Actualizar registro  
4. Eliminar registro  
5. Salir  

El usuario puede interactuar con el sistema hasta que decida salir.

## Estructura del proyecto

- `Persona.java` → Clase base
- `Estudiante.java` → Clase hija
- `Docente.java` → Clase hija
- `Main.java` → Lógica del sistema y menú

## Requisitos cumplidos

✔ Uso de herencia  
✔ Uso de ArrayList  
✔ Implementación de CRUD  
✔ Menú interactivo  
✔ Validaciones con try-catch  
✔ Código organizado y modular  

## Ejecución

1. Compilar los archivos:
