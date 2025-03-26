package ejemplo_simple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Metodos {

	
	//Creas una interfaz
	interface IFiltro{
		public boolean filtrar(String s);// le añades un metodo abstracto
	}
	
	
	IFiltro  i= new IFiltro(){//Creas una clase anonima, es decir, que no tiene nombre 

		@Override  //Reescribes el método
		public boolean filtrar(String s) {
			boolean longitud=false;
			if(s.length() >5 && s.length() <=15) {
				longitud = true;
			}
			return longitud;
		}
		
	};//Cierras la clase anonima
	
	//CON LAMBDAS
//USAS PREDICATE, QUE ES UNA INTERFAZ YA CREADA POR JAVA CON UN MÉTODO AL QUE LE PASAS UN PARAMETRO Y DECUELVE UN BOOLEANO
//palabra es el nombre que se le da al parametro y lo que hay a la derecha de la flecha es la condicion que devolvera un booleano
	Predicate <String> ct= palabra -> palabra.length() >5 && palabra.length() <=15;


	
	public List<String> comparar1(List<String> s){
		List<String> aux=new ArrayList<String>();
		for (String string : s) {
			if(i.filtrar(string)) {
				aux.add(string);
			}
			
		}
		return aux;
	}
	public List<String> comparar2(List<String> s){
		List<String> aux=new ArrayList<String>();
		for (String string : s) {
			if(ct.test(string)) {
				aux.add(string);
			}
			
		}
		return aux;
	}
	
	
	
	public void mostrarListaMultiplicada(List<Integer> s) {
		for (Integer i : s) {
			System.out.println(i*2);
		}
		
		s.forEach(i->System.out.println(i*2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

