package test;
import modelo.*;
public class TestAgregarProducto {

	public static void main(String[] args) {
		
		try {
			System.out.println("Escenario 1 ->agregar agregarProducto");
			Supermercado s = new Supermercado();
			s.agregarProducto("Banana", 10);
			s.agregarProducto("Banana", 10);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("Escenario 2 ->agregar agregarProducto");
			Supermercado s = new Supermercado();
			s.agregarProducto("Banana", 10);
			s.agregarProducto("Patata", 10);
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
