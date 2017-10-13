package test;
import modelo.*;
public class TestEliminarProducto {

	public static void main(String[] args) {
		try {
			Supermercado s = new Supermercado();
			s.agregarProducto("Batata", 10);
			
			System.out.println(s.eliminarProducto(1));
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
