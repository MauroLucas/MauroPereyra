package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
public class SistemaYPF {
	
	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Tarjeta> tarjetas;
	
	public SistemaYPF() {
		clientes = new ArrayList<Cliente>();
		productos = new ArrayList<Producto>();
		tarjetas = new ArrayList<Tarjeta>();
	}
	
	//ABM Cliente//
	public boolean agregarCliente(String nombre,String apellido,String email,long dni)throws Exception {
		Cliente cliente = traerCliente(dni);
		if(cliente!=null)throw new Exception("Dni existente");
		
		if(clientes.size()==0) {
			cliente = new Cliente(1,nombre,apellido,email,dni);
		}
		else {
			cliente = new Cliente(ultimoCliente().getIdCliente()+1,nombre,apellido,email,dni);
		}
		
		
		return clientes.add(cliente);
		
		
	}
	
	public Cliente traerCliente(long dni) {
		Cliente cliente=null;
		boolean encontrado=false;
		int i=0;
		while(i<clientes.size() && encontrado==false) {
			if(clientes.get(i).getDni()==dni) {
				cliente = clientes.get(i);
				encontrado = true;
			}
			
			i++;
		}
		return cliente;
	}
	
	public Cliente traerCliente(int idCliente) {
		Cliente cliente=null;
		boolean encontrado=false;
		int i=0;
		while(i<clientes.size() && encontrado==false) {
			if(clientes.get(i).getIdCliente()==idCliente) {
				cliente = clientes.get(i);
				encontrado = true;
			}
			
			i++;
		}
		return cliente;
	}
	
	public Cliente ultimoCliente() {
		return clientes.get(clientes.size()-1);
	}
	
	//
	
	//ABM producto//
	
	
	public boolean agregarProducto(String nombre,double precio,String unidadMedida,double pesosPorKms)throws Exception {
		Producto producto = traerProducto(nombre);
		if(producto!=null) throw new Exception("Producto existente");
		
		if(productos.size()==0) {
			producto = new Producto(1,nombre,precio,unidadMedida,pesosPorKms);
		}
		else {
			producto = new Producto(ultimoProducto().getIdProducto()+1,nombre,precio,unidadMedida,pesosPorKms);
		}
		
		
		return productos.add(producto);
	}
	
	public Producto traerProducto(int idProducto) {
		Producto producto=null;
		boolean encontrado=false;
		int i=0;
		while(i<productos.size() && encontrado==false) {
			if(productos.get(i).getIdProducto()==idProducto) {
				producto=productos.get(i);
				encontrado=true;
			}
			i++;
		}
		return producto;
	}
	
	public Producto traerProducto(String nombre) {
		Producto producto = null;
		boolean encontrado = false;
		int i=0;
		while(i<productos.size() && encontrado==false) {
			
			if(productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				producto = productos.get(i);
				encontrado = true;
			}
			
			i++;	
		}
		return producto;
	}
	
	public Producto ultimoProducto() {
		return productos.get(productos.size()-1);
	}
	//
	
	//ABM Tarjetas//
	
	
	//El cliente no puedo poseer mas de una tarjeta//
	public boolean poseeTarjeta(Cliente cliente) {
		boolean encontrado=false;
		int i=0;
		while(i<tarjetas.size() && encontrado==false) {
			if(tarjetas.get(i).getCliente().equals(cliente)) {
				encontrado=true;
			}
			i++;
		}
		
		return encontrado;
	}
	
	public boolean agregarTarjeta(Cliente cliente)throws Exception {
		Tarjeta tarjeta = null;
		if(cliente==null)throw new Exception("Cliente inexistente");
		if(poseeTarjeta(cliente))throw new Exception("El cliente posee una tarjeta");
		
		if(tarjetas.size()==0) {
			tarjeta = new Tarjeta(1,0,cliente);
		}
		else {
			tarjeta = new Tarjeta(ultimaTarjeta().getIdTarjeta()+1,0,cliente);
		}
		
		return tarjetas.add(tarjeta);
	}
	
	public Tarjeta traerTarjeta(Cliente cliente) {
		Tarjeta tarjeta = null;
		boolean encontrado=false;
		int i=0;
		while(i<tarjetas.size() && encontrado==false) {
			if(tarjetas.get(i).getCliente().equals(cliente)) {
				tarjeta = tarjetas.get(i);
				encontrado=true;
			}
			
			i++;
		}
		return tarjeta;
		
	}
	
	public Tarjeta ultimaTarjeta() {
		return tarjetas.get(tarjetas.size()-1);
	}
	
	////
	
	public boolean agregarCompra(Cliente cliente,Producto producto,GregorianCalendar fechaHora,double cantidad)throws Exception {
		if(cliente==null)throw new Exception("Cliente inexistente");
		if(producto==null)throw new Exception("Producto inexistente");
		return traerTarjeta(cliente).agregarCompra(producto, fechaHora, cantidad);
	}
	
	public List<Compra> traerCompras(Cliente cliente)throws Exception{
		if(cliente==null) throw new Exception("Cliente inexistente");
		
		return traerTarjeta(cliente).getCompras();
	}
	
	public List <Compra> traerCompras(GregorianCalendar desde,GregorianCalendar hasta){
		
		List<Compra> total = new ArrayList<Compra>();
		for(Tarjeta tarjeta : tarjetas) {
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getFechaHora().after(desde) && compra.getFechaHora().before(hasta)) {
					total.add(compra);
				}
			}
		}
		
		return total;
		
	}
	
	public List <Compra> traerCompras(Cliente cliente,GregorianCalendar desde,GregorianCalendar hasta)throws Exception{
		
		if(cliente==null)throw new Exception("Cliente inexistente");
		
		List<Compra> total = new ArrayList<Compra>();
		for(Tarjeta tarjeta : tarjetas) {
			if(tarjeta.getCliente().equals(cliente)) {
				
			
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getFechaHora().after(desde) && compra.getFechaHora().before(hasta)) {
					total.add(compra);
				}
			}
		  } 
		}
		
		return total;
		
	}
	
	public List<Compra> traerCompras(Producto producto)throws Exception{
		
		if(producto==null)throw new Exception("Producto inexistente");
		List<Compra> total = new ArrayList<Compra>();
		for(Tarjeta tarjeta : tarjetas) {
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getProducto().equals(producto)) {
					total.add(compra);
				}
			}
		}
		return total;
	}
	
	public List<Compra> traerCompras(Producto producto,GregorianCalendar desde,GregorianCalendar hasta)throws Exception{
		if(producto==null)throw new Exception("Producto inexistente");
		List<Compra> total = new ArrayList<Compra>();
		for(Tarjeta tarjeta : tarjetas) {
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getProducto().equals(producto)) {
					if(compra.getFechaHora().after(desde) && compra.getFechaHora().before(hasta)) {
						total.add(compra);
					}
				}
			}
		}
		
		return total;
	}
	
	public double traerCantidadVendida(Producto producto)throws Exception  {
		if(producto==null)throw new Exception("Producto inexistente");
		double cantidad=0;
		for(Tarjeta tarjeta : tarjetas) {
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getProducto().equals(producto)) {
					cantidad += compra.getCantidad();
				}
			}
		}
		return cantidad;
	}
	public double traerCantidadDeVentas(Producto producto)throws Exception {
		if(producto==null)throw new Exception("Producto inexistente");
		double ventas=0;
		for(Tarjeta tarjeta : tarjetas) {
			for(Compra compra : tarjeta.getCompras()) {
				if(compra.getProducto().equals(producto)) {
					ventas +=1;
				}
			}
		}
		return ventas;
	}
	
	public String listaClientes() {
		String resultado = ("Clientes: " + "\n");
		for(Cliente cliente : clientes) {
			resultado += " " + cliente.toString() + "\n";
		}
		return resultado;
	}
	
	public String listaProductos() {
		String resultado = ("Productos: " + "\n");
		for(Producto producto : productos) {
			resultado += " " + producto.toString() + "\n";
		}
		return resultado;
	}
	
	public String listaTarjetas() {
		String resultado = "Tarjetas: " +"\n";
		for(Tarjeta tarjeta : tarjetas) {
			resultado += " " + tarjeta.toString() + "\n";
 		}
		return resultado;
	}
	
	public String listaCompras(List<Compra> compras) {
		String resultado=("Compras: " + "\n");{
			for(Compra compra : compras) {
				resultado += " " + compra.toString() + "\n";
			}
		}
		return resultado;
	}
	
	
	
	
	

}
