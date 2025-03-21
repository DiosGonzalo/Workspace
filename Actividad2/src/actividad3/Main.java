package actividad3;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Creamos algunos alumnos iniciales
        Alumno alumno1 = new Alumno(1, "Juan", 20, 6.5);
        Alumno alumno2 = new Alumno(2, "Ana", 22, 4.2);
        Alumno alumno3 = new Alumno(3, "Luis", 19, 8.3);
        
        // Creamos el CrudAlumno
        CrudAlumno crud = new CrudAlumno(new HashSet<Alumno>());
        
        // Agregar los alumnos iniciales
        crud.agregar(alumno1);
        crud.agregar(alumno2);
        crud.agregar(alumno3);
        
        int opcion;
        do {
            // Menú interactivo
            System.out.println("\n*** Menú de opciones ***");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Buscar alumno por ID");
            System.out.println("4. Modificar edad de alumno");
            System.out.println("5. Eliminar alumno");
            System.out.println("6. Calcular media de las notas");
            System.out.println("7. Ver número de suspensos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Agregar alumno
                    System.out.println("Ingrese los datos del alumno:");
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Para consumir el salto de línea
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Nota media: ");
                    double notaMedia = scanner.nextDouble();
                    Alumno nuevoAlumno = new Alumno(id, nombre, edad, notaMedia);
                    if (crud.agregar(nuevoAlumno)) {
                        System.out.println("Alumno agregado correctamente.");
                    } else {
                        System.out.println("No se pudo agregar el alumno.");
                    }
                    break;
                case 2:
                    // Mostrar todos los alumnos
                    System.out.println("\nLista de alumnos:");
                    crud.mostrar();
                    break;
                case 3:
                    // Buscar alumno por ID
                    System.out.print("Ingrese el ID del alumno a buscar: ");
                    int buscarId = scanner.nextInt();
                    Alumno alumnoEncontrado = crud.findById(buscarId);
                    if (alumnoEncontrado != null) {
                        System.out.println("Alumno encontrado: " + alumnoEncontrado);
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 4:
                    // Modificar edad de un alumno
                    System.out.print("Ingrese el ID del alumno a modificar: ");
                    int modificarId = scanner.nextInt();
                    System.out.print("Ingrese la nueva edad: ");
                    int nuevaEdad = scanner.nextInt();
                    crud.modifyName(modificarId, nuevaEdad);
                    break;
                case 5:
                    // Eliminar alumno
                    System.out.print("Ingrese el ID del alumno a eliminar: ");
                    int eliminarId = scanner.nextInt();
                    if (crud.deleteObjects(eliminarId)) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 6:
                    // Calcular la media de las notas
                    double media = crud.calcularMedia();
                    System.out.println("La media de las notas es: " + media);
                    break;
                case 7:
                    // Ver número de suspensos
                    int suspensos = crud.suspensos();
                    System.out.println("Número de suspensos: " + suspensos);
                    break;
                case 0:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
