package actividad_2;

public class Socio implements Comparable<Socio>{
    private String nombre;
    private int edad;
    private String dni;
    private int id;
    

 

    public Socio(String nombre, int edad, String dni, int id) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Socio o) {
		// TODO Auto-generated method stub
		if(this.id>o.id) {
			return 1;
		}else {
			if(this.id<o.id) {
				return -1;
			}
		return 0;
	}
}
}