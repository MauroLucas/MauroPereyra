package modelo;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;
public class Carrito {

	private int idCarrito;
	private GregorianCalendar fechaHora;
	private List<ItemCarrito> lstItem;
	private Cliente cliente;
	public Carrito(int idCarrito, GregorianCalendar fechaHora,Cliente cliente) {
		
		this.idCarrito = idCarrito;
		this.fechaHora = fechaHora;
		this.cliente=cliente;
		lstItem = new ArrayList<ItemCarrito>();
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public float calcularTotal() {
		float total=0;
		for(ItemCarrito item:lstItem) {
			total +=item.calcularSubTotal();
		}
		return total;
	}
	public boolean agregarItem(Producto producto,int cantidad)throws Exception {
		if(producto==null)throw new Exception("Producto inexistente");
		boolean resultado=false;
		boolean encontrado=false;
		int i=0;
		while(i<lstItem.size() && encontrado==false) {
			if(producto.equals(lstItem.get(i).getProducto())) {
			    lstItem.get(i).incrementar(cantidad);
				encontrado=true;	
			}
		i++;
		}
		if(!encontrado) {
			resultado=true;
			if(lstItem.size()==0) {
				lstItem.add(new ItemCarrito(1,producto,cantidad));
			}
			else {
				lstItem.add(new ItemCarrito(lstItem.get(lstItem.size()-1).getIdItem()+1,producto,cantidad));
			}
		}
		
		return resultado;
	}
	//que deberia retornar//
	public boolean eliminarItem(Producto producto,int cantidad)throws Exception {
		if(producto==null)throw new Exception("Producto inexistente");
		boolean resultado=false;
		boolean encontrado=false;
		ItemCarrito item=new ItemCarrito();
		int i=0;
		while(i<lstItem.size() && encontrado==false) {
			if(producto.equals(lstItem.get(i).getProducto())) {
			    
				item = lstItem.get(i);
				encontrado=true;	
			}
		i++;
		}
		if(encontrado) {
			
			resultado=true;
			if(item.getCantidad()==cantidad) {
				lstItem.remove(item);
				
			}
			else if(item.getCantidad()>cantidad) {
				item.decrementar(cantidad);
			}
			
		}
		else {
			throw new Exception("Producto no encontrado en el carrito");
		}
		
		
		return resultado;
	}
	
	public ItemCarrito traerItem(int idItem) {
		boolean encontrado=false;
		int i=0;
		ItemCarrito item = null;
		while(i<lstItem.size() && encontrado==false) {
			if(idItem==lstItem.get(i).getIdItem()) {
			    item=lstItem.get(i);
				
				encontrado=true;	
			}
		i++;
		}
		return item;
	}
	
	public int getIdCarrito() {
		return idCarrito;
	}
	public void setIdCarrito(int idCarrito) {
		this.idCarrito = idCarrito;
	}
	
	public List<ItemCarrito> getListaCarrito() {
		return lstItem;
	}
	
	public String toString() {
		String resultado=new String("Carrito:");
		resultado=resultado+ " id:"+idCarrito+" " + Funciones.traerFechaCortaHora(this.fechaHora)+" "+this.cliente.toString() +"\n";
		resultado += "Items:" + "\n";
		for(ItemCarrito i : lstItem) {
			resultado= resultado + i.toString()+ "\n";
		}
		
		resultado += "total:"+ this.calcularTotal() + "\n";
		return resultado;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}
	
	
	
	
}
