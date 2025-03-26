package actividad4;

public class Contacto {
	private int id;
	private String nombre;
	private String numero;
	public Contacto(int id, String nombre, String numero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Agenda [id=" + id + ", nombre=" + nombre + ", numero=" + numero + "]";
	}
}
