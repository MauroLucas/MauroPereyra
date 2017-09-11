package test;
import modelo.Ceta; 
import modelo.Funciones;
import modelo.Contribuyente;
import modelo.Rodado;
import java.util.GregorianCalendar; 
import java.util.Calendar;
public class TestCeta {

	public static void main(String[] args) {
		
		
		//Excepciones rodado
		try {
			Rodado isuzu =new Rodado();
			//isuzu.setDominio("1AA123CD");
			//System.out.println(isuzu);
		}
		catch(Exception e){
			System.out.println("Excepcion: " + e.getMessage());
			
		}
		
		//Excepciones Contribuyente Sexo
		try {
		Contribuyente mauro = new Contribuyente();
		//mauro.setSexo('a');
		//System.out.println(mauro);
		}
		catch(Exception e){
			System.out.println("Excepcion: " + e.getMessage());
			
		}
		//Excepciones Contribuyente CUIL
		try {
			Contribuyente mauro = new Contribuyente();
			mauro.setSexo('m');
			mauro.setDni(38301299);
			mauro.setCuil("2038301299A");
			System.out.println(mauro);
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		
		//Excepciones Ceta mismo vendedor y comprador
		try {
			
			 Ceta ejempl1 =new Ceta();
			 Contribuyente mauro = new Contribuyente();
			// ejempl1.setVendedor(mauro);
			 //ejempl1.setComprador(mauro);
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		//la Fecha es posterior a la actual
		try {
			
			 Ceta ejempl1 =new Ceta();
			 GregorianCalendar fecha = new GregorianCalendar();
			// fecha=Funciones.traerFecha(2017, 9, 9);
			 ejempl1.setFecha(fecha);
			
			}
			catch(Exception e){
				System.out.println("Excepcion: " + e.getMessage());
				
			}
		
		
		

	}

}
