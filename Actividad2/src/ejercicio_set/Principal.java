package ejercicio_set;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
        Tienda o;

        Instrumento i1 = new Instrumento("Violin", "Cuerda", 1, 150.5, true);
        Instrumento i2 = new Instrumento("Trompeta", "Viento", 4, 21000.5, false);
        Instrumento i3 = new Instrumento("Bateria", "Percusion", 2, 21000.5, false);
        Instrumento i4 = new Instrumento("Flauta", "Viento", 3, 1250.5, true);

        o = new Tienda();
        o.agregar(i1);
        o.agregar(i2);
        o.agregar(i3);
        o.agregar(i4);

        int seleccion, codigo=4;
        String tipos = "Cuerda, Viento, Percusión";
do {
        System.out.println("Hola, bienvenido a la tienda de instrumentos");
        System.out.println("¿Qué desea hacer?");
        System.out.println("Pulse 1.   Para agregar un nuevo instrumento");
        System.out.println("Pulse 2.   Para buscar instrumentos por tipo");
        System.out.println("Pulse 3.   Para Modificar precio");
        System.out.println("Pulse 4.   Para ordenar");
        System.out.println("Pulse 5.   Para [completar]");
        System.out.println("Pulse 6.   Para [completar]");
        System.out.print("Seleccione una opción: ");
        seleccion = src.nextInt();
        src.nextLine(); // Consumir el salto de línea después de nextInt()

        switch (seleccion) {
            case 1:
                String nombre, tipo;
                double precio;
                int stockaux;
                boolean stock;
                codigo++;
                System.out.println("Diga el nombre:");
                nombre = src.nextLine();
                System.out.println("Diga el tipo (" + tipos + "):");
                tipo = src.nextLine();
                System.out.println("Diga el precio:");
                precio = src.nextDouble();
                System.out.println("¿Está en stock? 1. Sí / 2. No");
                stockaux = src.nextInt();
                stock = (stockaux == 1); // Simplificación del if-else
                o.agregar(new Instrumento(nombre, tipo,codigo, precio, stock)); 
                break;
            case 2:
                String buscar;
                System.out.println("Diga qué tipo quiere buscar: " + tipos);
                buscar = src.nextLine();
                System.out.println(  o.budcarTipo(buscar)); 
                break;
            case 3:
            	int elegido;
            	double nuevoPrecio;
                System.out.println("Diga el codigo del Instrumento que quiere modificar: ");
                o.mostrar();
                elegido=src.nextInt();
                System.out.println("Diga su nuevo precio");
                nuevoPrecio=src.nextDouble();
                o.modificarPrecio(elegido, nuevoPrecio);
                o.mostrar();
                break;
            case 4:
            	System.out.println("Ordenada por orden natural, es decir, codigo");
            	o.ordenNatural();
            	System.out.println("Orden no natural, esdecir nombre");
            	o.ordenNoNatural();
            	
            	break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        // Cerrar el Scanner
        
        
        
        
        
        
        
		}while(seleccion!=0);
src.close();
    }
}