package Act_2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
		    public static void main(String[] args) {
		        Club club = new Club();
		        Scanner scanner = new Scanner(System.in);
		        int opcion;

		        // Agregar algunos socios iniciales para probar
		        club.guardar(new Socio("Ana", 25, "123A", 2));
		        club.guardar(new Socio("Luis", 30, "456B",3));

		        do {
		            // Menú simple
		            System.out.println("\n=== Menú de Prueba ===");
		            System.out.println("1. Mostrar socios");
		            System.out.println("2. Buscar socio (DNI: 123A)");
		            System.out.println("3. Cambiar nombre (DNI: 123A a 'Sofia')");
		            System.out.println("4. Cambiar edad (DNI: 456B a 35)");
		            System.out.println("5. Borrar socio (DNI: 456B)");
		            System.out.println("6. Salir");
		            System.out.print("Elige una opción: ");
		            opcion = scanner.nextInt();

		            switch (opcion) {
		                case 1: // Mostrar socios
		                    club.mostrar();
		                    break;

		                case 2: // Buscar socio
		                    Socio socio = club.buscar("123A");
		                    System.out.println(socio != null ? socio : "No encontrado");
		                    break;

		                case 3: // Cambiar nombre
		                    club.cambiarNombre("123A", "Sofia");
		                    System.out.println("Nombre cambiado. Lista actual:");
		                    club.mostrar();
		                    break;

		                case 4: // Cambiar edad
		                    club.cambiarEdad("456B", 35);
		                    System.out.println("Edad cambiada. Lista actual:");
		                    club.mostrar();
		                    break;

		                case 5: // Borrar socio
		                    club.borrar("456B");
		                    System.out.println("Socio borrado. Lista actual:");
		                    club.mostrar();
		                    break;

		                case 6: // Salir
		                    System.out.println("Saliendo...");
		                    break;
		                    
		                case 7: // Salir
		                   club.mostrarOrdenadoId();
		                	
		                	
		                    break;
		                case 8: // Salir
		                	club.mostrarOrdenadoNombre();
		                	
		                	
		                    break;
		                default:
		                    System.out.println("Opción no válida.");
		                    break;
		            }
		        } while (opcion != 6);

		        scanner.close();
		    }
		}
	


