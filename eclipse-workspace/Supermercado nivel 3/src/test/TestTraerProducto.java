package test;
import modelo.*;
public class TestTraerProducto {

	public static void main(String[] args) {
		Supermercado s = new Supermercado();
		try {
		     System.out.println("Escenario 1-> traerProducto");
			 s.agregarProducto("Patata", 10);
		     System.out.println(s.traerProducto(1));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
		     System.out.println("Escenario 2-> traerProducto");
			
		     System.out.println(s.traerProducto(2));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
