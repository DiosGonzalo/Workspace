package con_Lambda;

import java.util.function.Predicate;

public class Diccionario {

	
	
	
	
	Predicate <String> ct= palabra -> palabra.length() >5 && palabra.length() <=15;
	
	public int contar(String st) {
		if(ct.test(st)) {
			return st.length();
		}
		return -1;

	
}
}
