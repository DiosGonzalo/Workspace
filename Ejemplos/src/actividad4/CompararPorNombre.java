package actividad4;

import java.util.Comparator;


public class CompararPorNombre implements Comparator<Contacto>{

	@Override
	public int compare(Contacto o1, Contacto o2) {
		String nombre1=o1.getNombre();
		String nombre2=o2.getNombre();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
		
	}

}
