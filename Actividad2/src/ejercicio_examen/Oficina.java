package ejercicio_examen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Oficina {

	private List <Trastero> o = new ArrayList<Trastero>();
	
	//METODOS
	
	public boolean agregar(Trastero t) {
		boolean add= false;
		if(o.add(t)) {
			add= true;
		}
		return add;
	}// El add returnea un booleano asi que no hace falta el if
	
	
	public ArrayList<Trastero> buscar(double precio){
		ArrayList <Trastero> aux = new ArrayList <Trastero> ();
		for (Trastero t : o) {
			if(t.getPrecio() == precio) {
				aux.add(t);
				
			}
		}
		return aux;
	}
	
	public Trastero buscarPorId(int id) {
		for (Trastero t : o) {
			if(t.getId()==id) {
			return t;
			}
		}
		return null;
	}
	
	public ArrayList<Trastero> masCaro(){
		double caro=o.get(1).getPrecio();
		for (Trastero t1 : o) {
			if(t1.getPrecio()>caro) {
				caro=t1.getPrecio();
				
			}
		}
		return buscar(caro);
	}
	
	public boolean borrar(int id) {
		boolean borrar= false;
		Trastero aBorrar=buscarPorId(id);
			if(aBorrar !=null) {
				o.remove(aBorrar);
				borrar=true;
			}
		
		return borrar;
	}
	
	
	public Trastero modificar(int id, double nuevoPrecio) {
		Trastero aux=null;
		for (Trastero t1 : o) {
			if(t1.getId()==id) {
				t1.setPrecio(nuevoPrecio);
				aux=t1;
			}
		}
		return aux;
	}
	
	
	public void  ocupados(){
		ArrayList <Trastero> aux = new ArrayList<Trastero>();
		for (Trastero t1 : o) {
			if(t1.isOcupado()) {
				aux.add(t1);
			}
		}
		aux.forEach(trastero->System.out.println(trastero));
		
	}
	
	public void ordenarNumero() {	
		ArrayList<Trastero> ordenados=new ArrayList<Trastero>(o);
		Collections.sort(ordenados);
	}
	
	public void ordenarPrecio() {	
		ArrayList<Trastero> ordenados=new ArrayList<Trastero>(o);
		Collections.sort(ordenados, new CompararPorNombre());
	}
	
	   public List<Trastero> ordenar() {
	        ArrayList<Trastero> ordenados = new ArrayList<Trastero>(o); // Copia de la lista original
	        for (int i = 0; i < ordenados.size() - 1; i++) {
	            for (int j = 0; j < ordenados.size() - 1 - i; j++) {
	                Trastero t1 = ordenados.get(j);
	                Trastero t2 = ordenados.get(j + 1);
	                if (t1.getId() > t2.getId() || 
	                    (t1.getId() == t2.getId() && t1.getPrecio() > t2.getPrecio())) {
	                    ordenados.set(j, t2);
	                    ordenados.set(j + 1, t1);
	                }
	            }
	        }
	        return ordenados; // Devuelve la nueva lista ordenada
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
