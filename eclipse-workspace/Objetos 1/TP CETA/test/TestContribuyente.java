package test;

import modelo.Contribuyente;

public class TestContribuyente {

	public static void main(String[] args) {
		try {
			Contribuyente mauro = new Contribuyente();
			mauro.setSexo('A');
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		
		try {
			Contribuyente mauro = new Contribuyente();
			mauro.setSexo('m');
			mauro.setDni(38301299);
			mauro.setCuil("2038301299A");
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
	}

}
