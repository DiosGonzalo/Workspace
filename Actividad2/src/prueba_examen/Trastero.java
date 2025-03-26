package prueba_examen;

public class Trastero implements Comparable <Trastero>{

	
	private double capacidadM2;
	private String direccion;
	private int id;
	private double precio;
	private boolean ocupado;
	public Trastero(double capacidadM2, String direccion, int id, double precio, boolean ocupado) {
		super();
		this.capacidadM2 = capacidadM2;
		this.direccion = direccion;
		this.id = id;
		this.precio = precio;
		this.ocupado = ocupado;
	}
	public double getCapacidadM2() {
		return capacidadM2;
	}
	public void setCapacidadM2(double capacidadM2) {
		this.capacidadM2 = capacidadM2;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	@Override
	public String toString() {
		return "Trastero [capacidadM2=" + capacidadM2 + ", direccion=" + direccion + ", id=" + id + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}
	@Override
	public int compareTo(Trastero o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	
	
	
	
	
	
	
}