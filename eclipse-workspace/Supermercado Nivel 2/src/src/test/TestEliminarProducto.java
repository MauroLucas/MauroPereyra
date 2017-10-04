package test;
import modelo.*;
public class TestEliminarProducto {

	public static void main(String[] args) {
		try {
			System.out.println("Escenario 1->eliminarProducto()");
			Supermercado s=new Supermercado();
			s.agregarProducto("Patatas", 50);
			s.agregarProducto("champu", 10);
			
			s.eliminarProducto(1);
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
