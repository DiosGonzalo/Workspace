package ejercicio_set;

public class Instrumento {
	private String nombre;
	private String tipo;
	private int codigo;
	private double precio;
	private boolean stock;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isStock() {
		return stock;
	}
	public void setStock(boolean stock) {
		this.stock = stock;
	}
	public Instrumento(String nombre, String tipo, int codigo, double precio, boolean stock) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", codigo=" + codigo + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	
	
	
	
	
	
	
	
}
