package test;
import java.util.GregorianCalendar;

import modelo.*;
public class TestEliminarCliente {

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
			
			
			s.eliminarCliente(1);
		
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
