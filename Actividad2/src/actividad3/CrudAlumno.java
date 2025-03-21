package actividad3;

import java.util.HashSet;
import java.util.Iterator;

public class CrudAlumno {
	
	HashSet<Alumno> s= new HashSet<Alumno>();

	public HashSet<Alumno> getS() {
		return s;
	}

	public void setS(HashSet<Alumno> s) {
		this.s = s;
	}

	public CrudAlumno(HashSet<Alumno> s) {
		super();
		this.s = s;
	}

	@Override
	public String toString() {
		return "CrudAlumno [s=" + s + "]";
	}
	
	//Metodos
	
	public boolean agregar(Alumno n) {
		boolean agregado=false;
		if(s.add(n)) {
			agregado=true;
			return agregado;
		}else {
			return agregado;
		}
	}
	
	
	
	public void mostrar() {
		Iterator<Alumno> it= s.iterator();
		while(it.hasNext()) {
			System.out.println(s);
		}
		
	}
	
	
	public Alumno findById(int id) {
		for (Alumno alumno : s) {
		if(alumno.getId()==id) {	
		return alumno;
		}
	}
		return null;
	}
	
	public void modifyName(int id, int nuevaEdad) {
		
		findById(id).setEdad(nuevaEdad);
		mostrar();
	}
	
	public boolean deleteObjects(int id) {
		return s.remove(findById(id));
	}
	
	public void mostrarUno(int id) {
		System.out.println(findById(id));
	}
	
	
	
	public double calcularMedia() {
		double suma=0;
		for (Alumno alumno : s) {
			suma += alumno.getNotaMedia();
		}
		return suma;
	}
	
	
	public int suspensos() {
		int suspensos=0;
		for (Alumno alumno : s) {
			if(alumno.getNotaMedia()<0) {
				suspensos++;
			}
		}
		return suspensos;
	}
	
	
}
