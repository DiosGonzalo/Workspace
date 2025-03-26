package usar_Interfaz_FormaLenta;

public class Calculadora implements IFiltro{

	@Override
	public boolean filtrarPalabra( String s) {
		boolean longitud=false;
		if(s.length() <5 && s.length() >=15) {
			longitud = true;
		}
		return longitud;
	}

	
	public Palabras [] s(Palabras s) {
		for (int i = 0; i < array.length; i++) {
			if(s[i].filtrarPalabra) {
				
			}
		}
	}
}
