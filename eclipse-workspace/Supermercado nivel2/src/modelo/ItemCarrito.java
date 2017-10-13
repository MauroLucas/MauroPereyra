package modelo;

public class ItemCarrito {
	
	private int idItem;
	private Producto producto;
	private int cantidad;
	public ItemCarrito() {}
	public ItemCarrito(int idItem, Producto producto, int cantidad) {
		
		this.idItem = idItem;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void incrementar(int cantidad) {
		this.cantidad +=cantidad;
	}
	
	public void decrementar(int cantidad) {
		this.cantidad -=cantidad;
	}
	
	public float calcularSubTotal() {
		float subtotal=0;
		subtotal = this.cantidad*this.producto.getPrecio();
		return subtotal;
	}
	@Override
	public String toString() {
		return "ItemCarrito [idItem=" + idItem + ", producto=" + producto + ", cantidad=" + cantidad +" total:"+this.calcularSubTotal() +"]";
	}
	
	

}
