package modelo;

public class Producto {
	
	private int idProducto;
	private String nombre;
	private double precio;
	private String unidadMedia;
	private double pesosPorKms;
	public Producto(int idProducto, String nombre, double precio, String unidadMedia, double pesosPorKms) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
		this.unidadMedia = unidadMedia;
		this.pesosPorKms = pesosPorKms;
	}
	
	public boolean equals(Producto producto) {
		boolean igual=false;
		if(this.idProducto==producto.idProducto) {
			igual =true;
		}
		return igual;
	}
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", unidadMedia="
				+ unidadMedia + ", pesosPorKms=" + pesosPorKms + "]";
	}

	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getUnidadMedia() {
		return unidadMedia;
	}
	public void setUnidadMedia(String unidadMedia) {
		this.unidadMedia = unidadMedia;
	}
	public double getPesosPorKms() {
		return pesosPorKms;
	}
	public void setPesosPorKms(double pesosPorKms) {
		this.pesosPorKms = pesosPorKms;
	}
	
	

}
