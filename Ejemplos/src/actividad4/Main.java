package actividad4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a= new Agenda();
		
		Contacto c1= new Contacto(1, "Juan", "777-888-999");
		Contacto c2= new Contacto(75, "pepe", "7234-348-299");
		Contacto c3= new Contacto(23, "Enrique", "737-999-889");
		Contacto c4= new Contacto(43, "Adrian", "247-438-964");
		
		a.agregar(c4);

		a.agregar(c3);

		a.agregar(c2);
		
		
		System.out.println(a.ordenarPorClave());
		
		a.buscar(3);
		
	}

}
