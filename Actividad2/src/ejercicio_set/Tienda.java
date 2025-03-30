package ejercicio_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Tienda {

	
	
	private Set <Instrumento> s=new HashSet<Instrumento>();
	
	//MEtodos
	public boolean agregar(Instrumento i) {
		
		return s.add(i);
	}
	
	
	public Set<Instrumento> budcarTipo(String tipo) {
		Set<Instrumento> aux=new HashSet<Instrumento>();
		for (Instrumento I1 : s) {
			if(I1.getTipo().equalsIgnoreCase(tipo)){
				aux.add(I1);
			}
		}
		return aux;
	}
	
	public Instrumento buscarCod(int codigo) {
		for (Instrumento instrumento : s) {
			if(instrumento.getCodigo()==codigo) {
				return instrumento;
			}
		}
		return null;
	}
	
	
	public Set<Instrumento> masBaratos(){
		Set<Instrumento> aux=new HashSet<Instrumento>();
		Iterator<Instrumento> i= s.iterator();
		double minimo=0;
		while(i.hasNext()) {
			
			Instrumento i1=i.next();
			if(i1.getPrecio()<=minimo) {
				minimo=i1.getPrecio();
			}
		}
		while (i.hasNext()) {
			Instrumento i2=i.next();
			if(i2.getPrecio()==minimo) {
				aux.add(i2);
			}
		}
		return aux;
	}
	
	public boolean borrar(int codigo) {
		return s.remove(buscarCod(codigo));
	}
	
	public void modificarPrecio(int cod, double precio) {
		buscarCod(cod).setPrecio(precio);
		
	}
	
	public void mostrar() {
		Iterator<Instrumento> i= s.iterator();
		while(i.hasNext()) {
			Instrumento l= i.next();
			System.out.println(l);
		}
	}
	
	
	public void ordenNatural(){
		Set<Instrumento> aux = new TreeSet<>(s);
		Iterator <Instrumento> i= aux.iterator();
		
		while(i.hasNext()) {
			Instrumento i1=i.next();
			System.out.println(i1);
		}
		
		
		
	}
	public void ordenNoNatural(){
		Set<Instrumento> aux= new TreeSet<Instrumento>(new OrdenarPorNombre());
		aux.addAll(s);
		Iterator <Instrumento> i= aux.iterator();
		
		while(i.hasNext()) {
			Instrumento i1=i.next();
			System.out.println(i1);
		}
		
	}
	
	
	
	
	
	
}
