package modelo;
import java.util.GregorianCalendar;
public class Compra {
	
	private Producto producto;
	private GregorianCalendar fechaHora;
	private double cantidad;
	public Compra(Producto producto, GregorianCalendar fechaHora, double cantidad) {
		super();
		this.producto = producto;
		this.fechaHora = fechaHora;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public int calcularKms() {
	  int kilometros=0;
	  double total= cantidad*producto.getPrecio();
	  kilometros = (int)(total / producto.getPesosPorKms());
	  return kilometros;
	}
	@Override
	public String toString() {
		return "Compra [producto=" + producto + ", fechaHora=" + Funciones.traerFechaCorta(fechaHora) + ", cantidad=" + cantidad + "]";
	}

}
