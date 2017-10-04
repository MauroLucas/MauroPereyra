package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
public class Supermercado {
	
      private List<Producto> gondola;
      private List<Carrito> lstCarrito;
    
      
      public Supermercado() {
    	  gondola = new ArrayList<Producto>();
    	  lstCarrito = new ArrayList<Carrito>();
    	 
      }
      
  	////Metodos para carrito///////////////////
  	public boolean agregarCarrito(GregorianCalendar fechahora)throws Exception {
  		boolean resultado=false;
  		
  	    if(lstCarrito.size()==0) {
  	    	lstCarrito.add(new Carrito(1,fechahora));
  	    }
  	    else {
  	    	int lastId=lstCarrito.get(lstCarrito.size()-1).getIdCarrito();
  	    	lstCarrito.add(new Carrito(lastId,fechahora));
  	    }
  		
  		return resultado;
  	}
  	
  	public boolean eliminarCarrito(int idCarrito) {
  		boolean resultado=false;
  		
  		
  		
  		return resultado;
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
  		}
  		return carrito;
  		
  	}
  	
  	///////////////////////////
  	
      
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
    	 if(encontrado)throw new Exception("El producto existe en una gondola");
    	 else {
    		 gondola.remove(p);
    	 }
    	 
    	 
         return resultado;
      }
      public List<Producto> getGondola() {
		return gondola;
	}

	public void setGondola(List<Producto> gondola) {
		this.gondola = gondola;
	}

	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public void setLstCarrito(List<Carrito> lstCarrito) {
		this.lstCarrito = lstCarrito;
	}

	public boolean modificarProducto(int idProducto,String producto,double precio)throws Exception {
    	  boolean resultado=true;
    	  Producto p= traerProducto(idProducto);
    	  if(p==null)throw new Exception("Producto Inexistente:"+" id:"+idProducto);
    	  p.setProducto(producto);
    	  
    	  p.setPrecio((float)precio);
    	  return resultado;
      }
      
      
	
	
	
	
	
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
      
      public String toString() {
    	  String resultado = new String();
    	  for(Producto p:gondola) {
    		  resultado +=  p.toString() + "\n";
    	  }
    	  return resultado;
      }
      
}
