import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Persona> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion = 0;

        do {
            try {
                System.out.println("\n--- MENU ---");
                System.out.println("1. Registrar persona");
                System.out.println("2. Mostrar registros");
                System.out.println("3. Actualizar registro");
                System.out.println("4. Eliminar registro");
                System.out.println("5. Salir");
                System.out.print("Seleccione: ");

                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: registrar(); break;
                    case 2: mostrar(); break;
                    case 3: actualizar(); break;
                    case 4: eliminar(); break;
                    case 5: System.out.println("Saliendo..."); break;
                    default: System.out.println("Error: opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("Error: debe ingresar solo numeros.");
            }
        } while (opcion != 5);
    }

    public static void registrar() {
        try {
            System.out.println("1. Estudiante");
            System.out.println("2. Docente");
            int tipo = Integer.parseInt(sc.nextLine());

            System.out.print("Cedula: ");
            String cedula = sc.nextLine();
            if (cedula.isEmpty()) throw new Exception("Campo obligatorio.");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            if (nombre.isEmpty()) throw new Exception("Campo obligatorio.");

            System.out.print("Edad: ");
            int edad = Integer.parseInt(sc.nextLine());

            if (tipo == 1) {
                System.out.print("Carrera: ");
                String carrera = sc.nextLine();
                if (carrera.isEmpty()) throw new Exception("Campo obligatorio.");

                lista.add(new Estudiante(cedula, nombre, edad, carrera));

            } else if (tipo == 2) {
                System.out.print("Asignatura: ");
                String asignatura = sc.nextLine();
                if (asignatura.isEmpty()) throw new Exception("Campo obligatorio.");

                lista.add(new Docente(cedula, nombre, edad, asignatura));

            } else {
                System.out.println("Error: opcion invalida.");
                return;
            }

            System.out.println("Registro agregado correctamente.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("No hay registros.");
            return;
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("\nRegistro #" + i);
            lista.get(i).mostrarDatos();
        }
    }

    public static void actualizar() {
        try {
            mostrar();
            System.out.print("Ingrese indice a actualizar: ");
            int index = Integer.parseInt(sc.nextLine());

            if (index < 0 || index >= lista.size()) {
                System.out.println("Registro no encontrado.");
                return;
            }

            Persona p = lista.get(index);

            System.out.print("Nuevo nombre: ");
            String nombre = sc.nextLine();
            if (!nombre.isEmpty()) p.setNombre(nombre);

            System.out.print("Nueva edad: ");
            String edadStr = sc.nextLine();
            if (!edadStr.isEmpty()) p.setEdad(Integer.parseInt(edadStr));

            if (p instanceof Estudiante) {
                System.out.print("Nueva carrera: ");
                String carrera = sc.nextLine();
                if (!carrera.isEmpty()) {
                    ((Estudiante) p).setCarrera(carrera);
                }
            } else if (p instanceof Docente) {
                System.out.print("Nueva asignatura: ");
                String asignatura = sc.nextLine();
                if (!asignatura.isEmpty()) {
                    ((Docente) p).setAsignatura(asignatura);
                }
            }

            System.out.println("Registro actualizado.");

        } catch (Exception e) {
            System.out.println("Error: entrada invalida.");
        }
    }

    public static void eliminar() {
        try {
            mostrar();
            System.out.print("Ingrese indice a eliminar: ");
            int index = Integer.parseInt(sc.nextLine());

            if (index < 0 || index >= lista.size()) {
                System.out.println("Registro no encontrado.");
                return;
            }

            lista.remove(index);
            System.out.println("Registro eliminado.");

        } catch (Exception e) {
            System.out.println("Error: entrada invalida.");
        }
    }
}
