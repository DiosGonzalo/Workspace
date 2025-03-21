package actividad_2;

public class Socio {
    private String nombre;
    private int edad;
    private String dni;

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

    public Socio(String nombre, int edad, String dni) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Socio [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
    }
}