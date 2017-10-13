package test;

import java.util.GregorianCalendar;

import modelo.Supermercado;

public class TestAgregarCliente {

	public static void main(String[] args) {
		try {
			Supermercado s = new Supermercado();
			//Clientes//
			System.out.println(s.agregarCliente("Mauro", 38301299, "cordero 540"));
			System.out.println(s.agregarCliente("Mauro", 38301299, "cordero 540"));
			
			
			System.out.println(s);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}


	}

}
