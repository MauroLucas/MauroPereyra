package test;

import java.util.GregorianCalendar;

import modelo.Carrito;
import modelo.Supermercado;
import modelo.*;
public class TestTotal {

	public static void main(String[] args) {
		try {
	    	   Supermercado s=new Supermercado();
	    	   Carrito carrito = new Carrito(1,new GregorianCalendar());
	    	   
	    	   
	    	   s.agregarProducto("patatas", 10);
	    	   s.agregarProducto("remolacha", 50);
	    	   
	    	   carrito.agregarItem(s.traerProducto(1), 10);
	    	   carrito.agregarItem(s.traerProducto(2), 1);
	    	   
	    	 
	    	   
	    	   System.out.println(carrito);
	       }
	       catch(Exception e) {
	    	   System.out.println(e.getMessage());
	       }


	}

}
