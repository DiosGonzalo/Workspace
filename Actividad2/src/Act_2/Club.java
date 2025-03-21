package Act_2;

import java.util.ArrayList;
import java.util.Collections;

public class Club {

    ArrayList<Socio> s = new ArrayList<>();

    // Métodos

    public boolean guardar(Socio n) {
    	boolean guardado=false;
    	if(s.add(n)) {
    		guardado=true;
    	}
        return guardado;
    }

    public Socio buscar(String dni) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getDni().equals(dni)) {
                return s.get(i);
            }
        }
        return null;
    }
    
    public void mostrar() {
        s.forEach(socio -> System.out.println(socio));
    }

    public Socio cambiarNombre(String dni, String nombre) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getDni().equals(dni)) {
                s.get(i).setNombre(nombre);
                return s.get(i);
            }
        }
        return null;
    }

    public Socio cambiarEdad(String dni, int edad) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getDni().equals(dni)) {
                s.get(i).setEdad(edad); // Corrección: usa setEdad, no setNombre
                return s.get(i);
            }
        }
        return null;
    }

    public void borrar(String dni) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getDni().equals(dni)) {
                s.remove(i);
                return; // Salimos tras eliminar, asumiendo DNI único
            }
        }
    }
    
    
    public void mostrarOrdenadoId() {
    	Collections.sort(s);
    	for (Socio socio : s) {
			System.out.println(socio);
		}
    }
    
    
    //get by id
    
    public Socio getById(int id) {
    	int index=findById(id);
    	if(index != -1) {
    		return s.get(index);
    	}else {
    		//hasta que no veamos los optional vamos a devolver un null si no lo encuentra
    		return null;
    	}
    }
    
    
    
    public int findById(int Id) {
    	int index = -1;
    	boolean find = false;
    	for(int i=0; i< s.size() && !find; i++) {
    		find =true;
    		index=i;
    	}
    	return index;
    }
    
    
    public void mostrarOrdenadoNombre() {
    	Collections.sort(s, new CompararPorNombre());
    	for (Socio socio : s) {
			System.out.println(socio);
		}
    }
    
}