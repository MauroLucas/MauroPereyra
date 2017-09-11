package test;

import modelo.Fraccion;
public class TestInstanciarFraccion {

	public static void main(String[] args)  {
		try {
			int n=2,d=0;
			System.out.println("-->Escenario 1:new Fraccion("+n+","+d+")");
			Fraccion f1 = new Fraccion(n,d);
		}
		catch (Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	
	
	try {
		int n=3;
		int d=5;
		Fraccion f1=new Fraccion(n,d);
		System.out.println("-->Escenario 1:new Fraccion("+n+","+d+")");
		System.out.println("Objeto Fraccion: "+f1 );
	}
	catch(Exception e) {
		System.out.println("Exception: "+e.getMessage());
	}

   }
}
