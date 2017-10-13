package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
public class Supermercado {
	
      private List<Producto> gondola;
      private List<Carrito> lstCarrito;
      private List<Cliente> lstCliente;
    
      
      public Supermercado() {
    	  gondola = new ArrayList<Producto>();
    	  lstCarrito = new ArrayList<Carrito>();
    	  lstCliente = new ArrayList<Cliente>();
    	 
      }
      
      public float calcularTotal(int mes,int anio,int dniCliente)throws Exception {
    	  float total=0;
    	  Cliente cliente=traerCliente((long)dniCliente);
    	  if(cliente==null)throw new Exception("Cliente inexistente");
    	  for(Carrito carrito : lstCarrito) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  if(Funciones.traerAnio(carrito.getFechaHora())==anio) {
    				  if(Funciones.traerMes(carrito.getFechaHora())==mes) {
    					  total += carrito.calcularTotal();
    				  }
    			  }
    		  }
    	  }
    	  return total;
      }
      
      public float calcularTotal(int mes, int anio,Cliente cliente)throws Exception {
    	  float total=0;
    	  if(mes>12 || mes<1)throw new Exception("Mes incorrecto");
    	  if(cliente==null)throw new Exception ("Cliente inexistente");
    	  
    	  for(Carrito carrito : lstCarrito) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  if(Funciones.traerAnio(carrito.getFechaHora())==anio) {
    				  if(Funciones.traerMes(carrito.getFechaHora())==mes) {
    					  total += carrito.calcularTotal();
    				  }
    			  }
    		  }
    	  }
    	  
    	  return total;
      }
       
      public float calcularTotal(GregorianCalendar fecha,Cliente cliente) throws Exception {
   	   float total=0;
   	   if(cliente==null)throw new Exception("Cliente no encontrado");
   	   
   	   for(Carrito carrito : lstCarrito) {
   		   if(carrito.getCliente().equals(cliente)) {
   			   if(Funciones.sonFechasIguales(fecha, carrito.getFechaHora())) {
   				   total += carrito.calcularTotal();
   			   }
   		   }
   	   }
   	   return total;
      }
       
      public float calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechaFin,Cliente cliente)throws Exception {
    	   if(cliente==null)throw new Exception("Cliente no encontrado"); 
    	   float resultado=0;
      	   int fechainicio= Funciones.traerAnio(fechaInicio) + Funciones.traerMes(fechaInicio) + Funciones.traerDia(fechaInicio);
  	       int fechafin =  Funciones.traerAnio(fechaFin) + Funciones.traerMes(fechaFin) + Funciones.traerDia(fechaFin);
      	   for(Carrito carrito:lstCarrito) {
      		 int fechaCarrito=Funciones.traerAnio(carrito.getFechaHora()) + Funciones.traerMes(carrito.getFechaHora()) + Funciones.traerDia(carrito.getFechaHora());
      		if(fechaCarrito>=fechainicio && fechaCarrito<=fechafin) {
      			if(carrito.getCliente().equals(cliente)) {
      				resultado += carrito.calcularTotal();
      			}
      		}
      		   
      	   }
      	   
      	   return resultado;
      	   
         } 
      public float calcularTotal(int mes,int anio) {
   	   float resultado=0;
   	   for(Carrito carrito : lstCarrito) {
   		   if(Funciones.traerAnio(carrito.getFechaHora())==anio) {
   			   if(Funciones.traerMes(carrito.getFechaHora())==mes) {
   				   resultado += carrito.calcularTotal();
   			   }
   		   }
   	   }
   	   
   	   return resultado;
   	   
      } 
       
      public float calcularTotal(GregorianCalendar fecha) {
    	   float resultado=0;
    	   
    	   for(Carrito carrito : lstCarrito) {
    		   if(Funciones.sonFechasIguales(fecha, carrito.getFechaHora())) {
    			  resultado += carrito.calcularTotal(); 
    		   }
    	   }
    	   
    	   return resultado;
    	   
       }
       public float calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechaFin) {
    	   float total=0;
    	   int fechainicio= Funciones.traerAnio(fechaInicio) + Funciones.traerMes(fechaInicio) + Funciones.traerDia(fechaInicio);
    	   int fechafin =  Funciones.traerAnio(fechaFin) + Funciones.traerMes(fechaFin) + Funciones.traerDia(fechaFin);
    	   
    	   for(Carrito carrito : lstCarrito) {
    		   int fechaCarrito=Funciones.traerAnio(carrito.getFechaHora()) + Funciones.traerMes(carrito.getFechaHora()) + Funciones.traerDia(carrito.getFechaHora());
    		   if(fechaCarrito>=fechainicio && fechaCarrito<=fechafin) {
    			   total += carrito.calcularTotal();
    		   }
    	   }
    	   
    	   
    	   return total;
       }
      
      
   	
   	public float calcularTotal(int idCliente)throws Exception {
   		float total=0;
   		Cliente c=traerCliente(idCliente);
   		if(c==null)throw new Exception("Cliente no encontrado");
   		for(Carrito carrito : lstCarrito) {
   			if(c.equals(carrito.getCliente())) {
   				total += carrito.calcularTotal();
   			}
   		}
   		return total;
   		
   		
   	}
   	
 public float calcularTotal(Cliente cliente)throws Exception {
   		
   		float total=0;
   		Cliente c = traerCliente(cliente.getIdCliente());
   		if(c==null)throw new Exception("Cliente no encontrado");
   		for(Carrito carrito : lstCarrito) {
   			if(c.equals(carrito.getCliente())) {
   				total += carrito.calcularTotal();
   			}
   		}
   		return total;
   		
   	}
      
      ///ABM gondola////
      public boolean agregarProducto(String producto,float precio)throws Exception {
    	  boolean resultado=false;
    	  Producto p = traerProducto(producto);
    	  if(p!=null)throw new Exception("Producto existente:"+producto);
    	  if(gondola.size()==0) {
    		  gondola.add(new Producto(1,producto,precio));
    		  resultado=true;
    	  }
    	  else {
    		  
    		  gondola.add(new Producto(gondola.get(gondola.size()-1).getIdProducto()+1,producto,precio));
    		  resultado=true;
    	  }
    	  return resultado;
      }
      
      public Producto traerProducto(int idProducto) {
    	  Producto resultado = null;
    	  int i=0;
    	  boolean encontrado=false;
    	  while(i<gondola.size()&&encontrado==false) {
    		  if(idProducto==gondola.get(i).getIdProducto()) {
    			  resultado=gondola.get(i);
    			  encontrado=true;
    			  
    		  }
    		  i++;
    	  }
    	  
    	  
    	  return resultado;
      }
      
      public Producto traerProducto(String producto) {
    	  Producto resultado = null;
    	  int i=0;
    	  boolean encontrado=false;
    	  while(i<gondola.size()&&encontrado==false) {
    		  if(producto.equalsIgnoreCase(gondola.get(i).getProducto())) {
    			  resultado=gondola.get(i);
    			  encontrado=true;
    			  
    		  }
    	  i++;
    	  }
    	  
    	  return resultado;
      }
      
      //Precondicion: El producto no debe existir en un Carrito//
      public boolean eliminarProducto(int idProducto)throws Exception {
    	 boolean resultado=false; 
    	 
    	 Producto p=traerProducto(idProducto);
    	 if(p==null)throw new Exception("El producto no existe"+"id:" + idProducto);
    	 boolean encontrado=false;
    	 for(Carrito c:lstCarrito) {
    		 for(ItemCarrito ItemCarrito:c.getListaCarrito()) {
    			 if(p.equals(ItemCarrito.getProducto())) {
    				 encontrado=true;
    			 }
    		 }
    	 }
    	 if(encontrado)throw new Exception("El producto existe en un carrito");
    	 else {
    		 gondola.remove(p);
    		 resultado=true;
    	 }
    	 
    	 
         return resultado;
      }
      
	
      
	public boolean modificarProducto(int idProducto,String producto,double precio)throws Exception {
    	  boolean resultado=true;
    	  Producto p= traerProducto(idProducto);
    	  if(p==null)throw new Exception("Producto Inexistente:"+" id:"+idProducto);
    	  p.setProducto(producto);
    	  
    	  p.setPrecio((float)precio);
    	  return resultado;
      }
      /////////////
      
	////ABM Carrito///////////////////
	//Pre Condicion: Si el cliente es el mismo la fechahora debe ser distinta
	public boolean agregarCarrito(GregorianCalendar fechahora,Cliente cliente)throws Exception {
		boolean resultado=false;
		if(cliente==null)throw new Exception("Cliente no encontrado");
		if(fechahora==null)throw new Exception("Fecha incorrecta");
		if(this.traerCarrito(fechahora)!=null)throw new Exception("Error:carrito existente");
	    if(lstCarrito.size()==0) {
	    	lstCarrito.add(new Carrito(1,fechahora,cliente));
	    	resultado=true;
	    }
	    else {
	    	int lastId=lstCarrito.get(lstCarrito.size()-1).getIdCarrito();
	    	lstCarrito.add(new Carrito(lastId+1,fechahora,cliente));
	    	resultado=true;
	    }
		
		return resultado;
	}
	
	public boolean eliminarCarrito(int idCarrito)throws Exception {
		
		Carrito c=traerCarrito(idCarrito);
		if(c==null)throw new Exception("Carrito inexistente");
		return lstCarrito.remove(c);
	}
	
	public Carrito traerCarrito(int idCarrito) {
		Carrito carrito = null;
		boolean encontrado=false;
		int i=0;
		while(i<lstCarrito.size() && encontrado==false) {
			if(lstCarrito.get(i).getIdCarrito()==idCarrito) {
				carrito=lstCarrito.get(i);
				encontrado=true;
			}
			i++;
		}
		return carrito;
		
	}
	
	public Carrito traerCarrito(GregorianCalendar fechahora) {
		
		Carrito carrito=null;
		boolean encontrado=false;
		int i=0;
		while(i<lstCarrito.size() && encontrado==false) {
			if(Funciones.sonFechasHorasIguales(fechahora, lstCarrito.get(i).getFechaHora())){
				carrito=lstCarrito.get(i);
				encontrado=true;
			}
			i++;
		}
	return carrito;
	}
	
	
	//////////////////////////
	
	////ABM Cliente//////////////////
	public boolean agregarCliente(String cliente,long dni,String direccion)throws Exception {
		boolean resultado=false;
		Cliente c = traerCliente(dni);
		if(c!=null)throw new Exception("Cliente existente");
		if(lstCliente.size()==0) {
			lstCliente.add(new Cliente (1,cliente,dni,direccion));
			resultado=true;
		}
		else {
			int lastId=lstCliente.get(lstCliente.size()-1).getIdCliente();
			lstCliente.add(new Cliente(lastId+1,cliente,dni,direccion));
			resultado=true;
		}
		
		
		return resultado;
		
	}
	
	//Pre Condicion: El cliente no debe tener carritos asignados//
	public boolean eliminarCliente(int idCliente)throws Exception {
		Cliente c=traerCliente(idCliente);
		if(c==null)throw new Exception("Cliente inexistente");
		boolean encontrado=false;
		int i=0;
		while(i<lstCarrito.size() && encontrado==false) {
			if(lstCarrito.get(i).getCliente().equals(c)) {
				encontrado=true;
				
			}
		}
		if(encontrado) throw new Exception("El cliente posee carritos");
		
		
		return lstCliente.remove(c);
			
		
		
	}
	
	
	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		int i=0;
		boolean encontrado=false;
		while(i<lstCliente.size() && encontrado==false) {
			if(dni==lstCliente.get(i).getDni()) {
				cliente = lstCliente.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		int i =0;
		boolean encontrado=false;
		while(i<lstCliente.size() && encontrado==false) {
			if(idCliente==lstCliente.get(i).getIdCliente()) {
				cliente=lstCliente.get(i);
				encontrado=true;
			}
			i++;
		}
		return cliente;
	}
	
	
	
	
	
	
	/////////////////////////////
	
	
      
      public String toString() {
    	  String resultado = "Gondola:" + "\n";
    	  for(Producto p:gondola) {
    		  resultado +=  p.toString() + "\n";
    	  }
    	  
    	  resultado = resultado + "Clientes:" +"\n" ;
    	  
    	  for(Cliente c: lstCliente) {
    		  
    		  resultado += c.toString() + "\n";
    	  }
    	  
    	  
    	  resultado = resultado + "Carritos:" + "\n";
    	  for(Carrito c:lstCarrito) {
    		  resultado += c.toString() + "\n";
    	  }
    	  
    	  
    	  return resultado;
      }
      
}
