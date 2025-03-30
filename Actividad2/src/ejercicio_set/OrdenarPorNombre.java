package ejercicio_set;

import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Instrumento>{

	@Override
	public int compare(Instrumento o1, Instrumento o2) {
		String a= o1.getNombre();
		String b=o1.getNombre();
		return a.compareToIgnoreCase(b);
	}

}
