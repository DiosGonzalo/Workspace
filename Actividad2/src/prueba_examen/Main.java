package prueba_examen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Menú de Gestión de Trasteros ===");
            System.out.println("1. Agregar un trastero");
            System.out.println("2. Buscar trasteros por precio");
            System.out.println("3. Buscar trastero por ID");
            System.out.println("4. Encontrar trasteros más caros");
            System.out.println("5. Borrar trastero por ID");
            System.out.println("6. Modificar precio de un trastero");
            System.out.println("7. Mostrar trasteros ocupados");
            System.out.println("8. Ordenar trasteros por ID y precio");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Agregar un trastero
                    System.out.print("Introduce la capacidad en m² del trastero: ");
                    double capacidadAgregar = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Introduce la dirección del trastero: ");
                    String direccionAgregar = scanner.nextLine();
                    System.out.print("Introduce el ID del trastero: ");
                    int idAgregar = scanner.nextInt();
                    System.out.print("Introduce el precio del trastero: ");
                    double precioAgregar = scanner.nextDouble();
                    System.out.print("¿Está ocupado? (true/false): ");
                    boolean ocupadoAgregar = scanner.nextBoolean();
                    Trastero nuevoTrastero = new Trastero(capacidadAgregar, direccionAgregar, idAgregar, precioAgregar, ocupadoAgregar);
                    if (oficina.agregar(nuevoTrastero)) {
                        System.out.println("Trastero agregado con éxito.");
                    } else {
                        System.out.println("Error al agregar el trastero.");
                    }
                    break;

                case 2: // Buscar trasteros por precio
                    System.out.print("Introduce el precio a buscar: ");
                    double precioBuscar = scanner.nextDouble();
                    ArrayList<Trastero> resultadoPrecio = oficina.buscar(precioBuscar);
                    if (!resultadoPrecio.isEmpty()) {
                        System.out.println("Trasteros encontrados: " + resultadoPrecio);
                    } else {
                        System.out.println("No se encontraron trasteros con ese precio.");
                    }
                    break;

                case 3: // Buscar trastero por ID
                    System.out.print("Introduce el ID a buscar: ");
                    int idBuscar = scanner.nextInt();
                    Trastero encontrado = oficina.buscarPorId(idBuscar);
                    if (encontrado != null) {
                        System.out.println("Trastero encontrado: " + encontrado);
                    } else {
                        System.out.println("No se encontró un trastero con ese ID.");
                    }
                    break;

                case 4: // Encontrar trasteros más caros
                    ArrayList<Trastero> masCaros = oficina.masCaro();
                    if (!masCaros.isEmpty()) {
                        System.out.println("Trasteros más caros: " + masCaros);
                    } else {
                        System.out.println("No hay trasteros o no se encontraron los más caros.");
                    }
                    break;

                case 5: // Borrar trastero por ID
                    System.out.print("Introduce el ID del trastero a borrar: ");
                    int idBorrar = scanner.nextInt();
                    if (oficina.borrar(idBorrar)) {
                        System.out.println("Trastero borrado con éxito.");
                    } else {
                        System.out.println("No se pudo borrar el trastero.");
                    }
                    break;

                case 6: // Modificar precio de un trastero
                    System.out.print("Introduce el ID del trastero a modificar: ");
                    int idModificar = scanner.nextInt();
                    System.out.print("Introduce el nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    Trastero modificado = oficina.modificar(idModificar, nuevoPrecio);
                    if (modificado != null) {
                        System.out.println("Trastero modificado: " + modificado);
                    } else {
                        System.out.println("No se encontró el trastero para modificar.");
                    }
                    break;

                case 7: // Mostrar trasteros ocupados
                    System.out.println("Trasteros ocupados:");
                    oficina.ocupados();
                    break;

                case 8: // Ordenar trasteros por ID y precio
                    oficina.ordenar();
                    System.out.println("Trasteros ordenados por ID y precio: " + oficina.ordenar());
                    break;

                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}