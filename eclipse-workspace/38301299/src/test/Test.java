package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		SistemaYPF ypf = new SistemaYPF();
		
		try {
			System.out.println("1)");
			System.out.println("Escenario 1");
			ypf.agregarCliente("Micaela", "Hidalgo", "mhidalgo@gmail.com", 11111111);
			ypf.agregarCliente("Juan", "Lopez", "jlopez@gmail.com", 22222222);
			ypf.agregarCliente("Daniela", "Rojas", "drojas@gmail.com", 33333333);
			ypf.agregarCliente("Lucas", "Suarez", "Isuarez@gmail.com", 44444444);
			System.out.println(ypf.listaClientes());
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("Escenario 2");
			
			ypf.agregarCliente("Juan", "Lopez", "jlopez@gmail.com", 22222222);
			
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			
			System.out.println("2)");
			System.out.println("Escenario 1");
			
			ypf.agregarProducto("NAFTA SÚPER", 12.0,"litros",6.0);
			ypf.agregarProducto("NAFTA INFINIA", 15.0, "litros", 3.0);
			ypf.agregarProducto("INFINIA DIESEL", 15.5, "litros", 3.0);
			ypf.agregarProducto("GNC", 10.0, "litros", 1.0);
			
			System.out.println(ypf.listaProductos());
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("Escenario 2");
			
			ypf.agregarProducto("NAFTA INFINIA", 15.0, "litros", 3.0);
			
			
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("3)");
			System.out.println("Escenario 1");
			
			ypf.agregarTarjeta(ypf.traerCliente(1));
			ypf.agregarTarjeta(ypf.traerCliente(2));
			ypf.agregarTarjeta(ypf.traerCliente(3));
			ypf.agregarTarjeta(ypf.traerCliente(4));
			
			System.out.println(ypf.listaTarjetas());
			
			
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		try {
			System.out.println("Escenario 2");
			
			ypf.agregarTarjeta(ypf.traerCliente(1));
			
			
			
			
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("4)");
			System.out.println("Escenario 1");
			

                 ypf.agregarCompra(ypf.traerCliente(1), ypf.traerProducto(1), Funciones.traerFecha(2017, 10, 17, 10, 00, 00), 10.0);
                 ypf.agregarCompra(ypf.traerCliente(3), ypf.traerProducto(3), Funciones.traerFecha(2017, 10, 17, 10, 30, 00), 10.5);
                 ypf.agregarCompra(ypf.traerCliente(2), ypf.traerProducto(2), Funciones.traerFecha(2017, 10, 17, 11, 00, 00), 12.0);
                 ypf.agregarCompra(ypf.traerCliente(1), ypf.traerProducto(1), Funciones.traerFecha(2017, 10, 17, 11, 15, 00), 10.0);
                 ypf.agregarCompra(ypf.traerCliente(1), ypf.traerProducto(1), Funciones.traerFecha(2017, 10, 18, 10, 00, 00), 5.0);
                 ypf.agregarCompra(ypf.traerCliente(3), ypf.traerProducto(3), Funciones.traerFecha(2017, 10, 18, 10, 30, 00), 7.5);
                 ypf.agregarCompra(ypf.traerCliente(1), ypf.traerProducto(1), Funciones.traerFecha(2017, 10, 19, 10, 00, 00), 8.0);
                 ypf.agregarCompra(ypf.traerCliente(3), ypf.traerProducto(3), Funciones.traerFecha(2017, 10, 19, 10, 30, 00), 22.0);
                 ypf.agregarCompra(ypf.traerCliente(2), ypf.traerProducto(2), Funciones.traerFecha(2017, 10, 20, 10, 00, 00), 25.0);
                 ypf.agregarCompra(ypf.traerCliente(2), ypf.traerProducto(2), Funciones.traerFecha(2017, 10, 20, 10, 15, 00), 20.5);
                 
                 System.out.println(ypf.listaTarjetas());
                 
			
			
			
		
		}
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		try {
			System.out.println("5)");
			
			System.out.println(ypf.listaCompras(ypf.traerCompras(ypf.traerCliente(3))));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("6)");
			
			System.out.println(ypf.listaCompras(ypf.traerCompras(Funciones.traerFecha(2017, 10, 18, 10, 15, 00),Funciones.traerFecha(2017,10,20,00,00,00) )));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("7)");
			
			System.out.println(ypf.listaCompras(ypf.traerCompras(ypf.traerCliente(3),Funciones.traerFecha(2017, 10, 18, 10, 15, 00),Funciones.traerFecha(2017,10,20,00,00,00)) ));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("8)");
			
			System.out.println(ypf.listaCompras(ypf.traerCompras(ypf.traerProducto(3))));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("9)");
			
			System.out.println(ypf.listaCompras(ypf.traerCompras(ypf.traerProducto(3),Funciones.traerFecha(2017,10,18,00,00,00),Funciones.traerFecha(2017,10,20,00,00,00))));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("10)");
			
			System.out.println("Cantidad vendida " +  ypf.traerCantidadVendida(ypf.traerProducto(3)));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		try {
			System.out.println("11)");
			
			System.out.println("Total vendidadas: " + ypf.traerCantidadDeVentas(ypf.traerProducto(3)));

                
         }
		catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

	}

}
