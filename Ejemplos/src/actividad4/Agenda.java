package actividad4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Agenda {

	private Map <Integer, Contacto> a= new HashMap<Integer,Contacto>();
	private int clave=1;

	public Map<Integer, Contacto> getA() {
		return a;
	}

	public void setA(Map<Integer, Contacto> a) {
		this.a = a;
	}

	public Agenda() {
		super();
		;
	}
	
	
	//Metodos
	
	public boolean agregar(Contacto s) {
		boolean add= false;
		if(a.put(clave, s)==null) {
			add=true;
			clave++;
		}
		return add;
	}
	
	
	public boolean borrar( int id) {
		if(a.remove(id)==null) {
			return true;
		}
		return false;
	}
	
	public void imprimirClave() {
		System.out.println(a.keySet());
	}

	public Map<Integer, Contacto> ordenarPorClave(){
		//Creas otro mapa para no ordenar el atributo que ya tienes
		Map <Integer, Contacto> auxiliar = new TreeMap<Integer, Contacto> (a);
		
		
		return auxiliar;
			
		
	}
	
}
