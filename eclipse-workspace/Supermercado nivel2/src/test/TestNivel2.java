package test;
import modelo.*;
import java.util.GregorianCalendar;
public class TestNivel2 {

	public static void main(String[] args) {
		
		
		Supermercado s = new Supermercado();
		
		try {
			
			
			s.agregarProducto("Papa", 5);
			s.agregarProducto("remolacha", 50);
			
			s.agregarCliente("Mauro", 38301299, "Cordero 540");
			
			s.agregarCarrito(new GregorianCalendar(),s.traerCliente(1));
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println(s);
		}

	}

}
