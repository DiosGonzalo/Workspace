package ejercicio_examen;

import java.util.Comparator;

public class CompararPorNombre implements Comparator<Trastero>{

	@Override
	public int compare(Trastero o1, Trastero o2) {
		
		
		return Double.compare(o1.getPrecio(), o2.getPrecio());
	}

}
