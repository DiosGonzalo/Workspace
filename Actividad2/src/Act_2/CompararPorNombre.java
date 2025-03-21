package Act_2;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		String nombre1=o1.getNombre();
		String nombre2=o2.getNombre();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
		

	}

}
