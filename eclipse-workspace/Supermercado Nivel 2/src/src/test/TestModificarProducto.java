package test;
import modelo.*;
public class TestModificarProducto {

	public static void main(String[] args) {
		
		try {
			Supermercado s = new Supermercado();
			System.out.println("Escenatio 1-> modifico pataras por lechugas");
			s.agregarProducto("patatas",10);
			s.modificarProducto(1,"lechucas",20);
			System.out.println(s.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenatio 2-> modifico un producto que no existe");
			Supermercado s = new Supermercado();
			s.modificarProducto(1,"lechucas",20);
			System.out.println(s.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
