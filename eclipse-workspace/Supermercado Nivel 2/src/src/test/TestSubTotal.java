package test;
import java.util.GregorianCalendar;

import modelo.*;
public class TestSubTotal {

	public static void main(String[] args) {
		try {
	    	   Supermercado s=new Supermercado();
	    	   Carrito carrito = new Carrito(1,new GregorianCalendar());
	    	   
	    	   
	    	   s.agregarProducto("patatas", 10);
	    	   s.agregarProducto("remolacha", 50);
	    	   
	    	   carrito.agregarItem(s.traerProducto(1), 10);
	    	   
	    	   System.out.println(carrito.traerItem(1));
	    	   
	    	   System.out.println();
	       }
	       catch(Exception e) {
	    	   System.out.println(e.getMessage());
	       }

	}

}
