package test;
import modelo.*;
import java.util.GregorianCalendar;
public class TestAgregarItem {

	public static void main(String[] args) {
		
		try {
			Supermercado s=new Supermercado();
			s.agregarProducto("patata", 10);
			s.agregarProducto("remolacha",10);
			
			Carrito carrito =new Carrito(1,new GregorianCalendar());
			
			carrito.agregarItem(s.traerProducto(1), 1);
			carrito.agregarItem(s.traerProducto(1),10);
			carrito.agregarItem(s.traerProducto(2), 2);
			
			System.out.println(carrito);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
