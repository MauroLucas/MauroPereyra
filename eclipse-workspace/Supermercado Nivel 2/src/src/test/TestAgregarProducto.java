package test;
import modelo.*;
public class TestAgregarProducto {

	public static void main(String[] args) {
      Supermercado s = new Supermercado();
      try {
    	  System.out.println("Escenario 1->agregarProducto");
    	  s.agregarProducto("Patatas",10);
    	  s.agregarProducto("patatas", 10);
    	  
      }
      catch(Exception e) {
    	  System.out.println(e.getMessage());
      }
      
      finally {
    	  System.out.println(s.toString());
      }
	}

}
