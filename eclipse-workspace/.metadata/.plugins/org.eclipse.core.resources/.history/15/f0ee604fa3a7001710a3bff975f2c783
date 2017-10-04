package test;
import modelo.*;
import java.util.GregorianCalendar;
public class TestEliminarItem {

	public static void main(String[] args) {
       try {
    	   Supermercado s=new Supermercado();
    	   Carrito carrito = new Carrito(1,new GregorianCalendar());
    	   
    	   
    	   s.agregarProducto("patatas", 10);
    	   s.agregarProducto("remolacha", 50);
    	   
    	   carrito.agregarItem(s.traerProducto(1), 10);
    	   
    	   carrito.eliminarItem(s.traerProducto(3), 10);
    	   System.out.println(carrito);
       }
       catch(Exception e) {
    	   System.out.println(e.getMessage());
       }

	}

}
