package test;
import modelo.*;
import java.util.GregorianCalendar;
public class TestAgregarItem {

	public static void main(String[] args) {
		try {
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15.90F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(new GregorianCalendar(), s.traerCliente(1));
			
			
			
			System.out.println(s.traerCarrito(1).agregarItem(s.traerProducto(1), 10));
			System.out.println(s.traerCarrito(1).agregarItem(s.traerProducto(2),1));
			
			System.out.println(s);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
