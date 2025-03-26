package usoInterfaz_PreJava8;

public class Diccionario {

	
	interface IFiltro{
		public boolean filtrar(String s);
	}
	
	IFiltro  s= new IFiltro() {

		@Override
		public boolean filtrar(String s) {
			boolean longitud=false;
			if(s.length() >5 && s.length() <=15) {
				longitud = true;
			}
			return longitud;
		}
		
	};
	
	public int contar(String st) {
		if(s.filtrar(st)) {
			return st.length();
		}
		return -1;
}
}