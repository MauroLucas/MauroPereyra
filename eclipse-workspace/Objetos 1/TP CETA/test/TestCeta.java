package test;
import modelo.Ceta; 
import modelo.Funciones;
import modelo.Contribuyente;
import modelo.Rodado;
import java.util.GregorianCalendar; 

public class TestCeta {

	public static void main(String[] args) {
		
		
		
		
		//Excepciones Ceta mismo vendedor y comprador
		try {
			
			 Ceta ejempl1 =new Ceta();
			 Contribuyente mauro = new Contribuyente();
			 ejempl1.setVendedor(mauro);
			 ejempl1.setComprador(mauro);
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		//la Fecha es posterior a la actual
		try {
			
			 Ceta ejempl1 =new Ceta();
			 GregorianCalendar fecha = new GregorianCalendar();
			 fecha=Funciones.traerFecha(2017, 9,13 );
			 ejempl1.setFecha(fecha);
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		
		
		

	}

}
