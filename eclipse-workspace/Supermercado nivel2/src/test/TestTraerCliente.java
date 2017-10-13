package test;
import modelo.*;
public class TestTraerCliente {

	public static void main(String[] args) {
		try {
			Supermercado s = new Supermercado();
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			System.out.println(s.traerCliente(1));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}

	}

}
