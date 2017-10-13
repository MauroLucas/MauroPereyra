package test;
import java.util.GregorianCalendar;

import modelo.*;
public class TestCalularTotal {

	public static void main(String[] args) {
		try {
			System.out.println("Escenario 1 -> calcularCotal(Cliente cliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15.90F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(new GregorianCalendar(), s.traerCliente(1));
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 5);
			s.traerCarrito(1).agregarItem(s.traerProducto(2), 3);
			
			System.out.println(s.calcularTotal(s.traerCliente(1)));
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(int idCliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15.90F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 05, 22), s.traerCliente(1));
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 5);
			s.traerCarrito(1).agregarItem(s.traerProducto(2), 3);
			
			System.out.println(s.calcularTotal(s.traerCliente(1)));
			System.out.println(s);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(GregorianCalendar)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(new GregorianCalendar(2017,4,10,10,0,0), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,5,25), s.traerCliente(1));
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			GregorianCalendar fecha=Funciones.traerFecha(2017,5,10);
			
			System.out.println("Fecha " + Funciones.traerFechaCorta(fecha));
			System.out.println(s.calcularTotal(fecha));
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(int mes ,int anio)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(new GregorianCalendar(2017,4,10,10,0,0), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,7,25), s.traerCliente(1));
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			int mes=5;
			int anio=2017;
			System.out.println("Mes "+ mes + "Anio " + anio);
			System.out.println(s.calcularTotal(mes,anio));
			
		
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechaFin,Cliente cliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 20), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,5,25), s.traerCliente(1));
			
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			GregorianCalendar fechainicio=Funciones.traerFecha(2017, 5, 1);
			GregorianCalendar fechafin=Funciones.traerFecha(2017,5,10);
			
			System.out.println(Funciones.traerFechaCorta(fechainicio)+" "+Funciones.traerFechaCorta(fechafin));
			System.out.println(s.traerCliente(1));
			System.out.println("Total " + s.calcularTotal(fechainicio,fechafin,s.traerCliente(1)) );
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(GregorianCalendar fecha,Cliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 20), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,5,25), s.traerCliente(1));
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			GregorianCalendar fecha = Funciones.traerFecha(2017,5,20);
			
			System.out.println("Fecha" + Funciones.traerFechaCorta(fecha)+ " Cliente " + s.traerCliente(1));
			System.out.println ("Total: "+s.calcularTotal(fecha, s.traerCliente(1)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(int mes,int anio,Cliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 20), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,5,25), s.traerCliente(1));
			
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			int mes=5;
			int anio=2017;
			
			System.out.println("Año "+anio+" Mes "+mes+ " Cliente " + s.traerCliente(1));
			System.out.println ("Total: "+s.calcularTotal(mes,anio, s.traerCliente(1)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println("Escenario 1 -> calcularTotal(int mes,int anio,dniCliente)");
			Supermercado s = new Supermercado();
			//Clientes//
			s.agregarCliente("Mauro", 38301299, "cordero 540");
			//Productos
			s.agregarProducto("Banana", 15F);
			s.agregarProducto("Lamparita", 89.90F);
			//Carritos
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 10), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017, 5, 20), s.traerCliente(1));
			s.agregarCarrito(Funciones.traerFecha(2017,5,25), s.traerCliente(1));
			
			
			
			//cargar items///
			
			s.traerCarrito(1).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(2).agregarItem(s.traerProducto(1), 1);
			s.traerCarrito(3).agregarItem(s.traerProducto(1), 1);
			
			
			
			System.out.println(s);
			
			int mes=5;
			int anio=2017;
			int dni=38301299;
			System.out.println("Año "+anio+" Mes "+mes+ " Cliente " + s.traerCliente(1));
			System.out.println(dni);
			System.out.println ("Total: "+s.calcularTotal(mes,anio,dni));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

     
     } 
  }

