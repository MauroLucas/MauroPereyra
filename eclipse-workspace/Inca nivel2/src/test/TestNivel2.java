package test;
import modelo.Inca;
import modelo.Pelicula;
import modelo.Genero;
public class TestNivel2 {

	public static void main(String[] args) {
		Inca inca = new Inca();
		try {
		     
			   System.out.println("Escenario 1->agregarGenero()");
			   
			   inca.agregarGenero("Comedia");
			   inca.agregarGenero("Terror");
			   inca.agregarGenero("Accion"); 
			   inca.agregarGenero("Drama");
			  
			  
		       }
		   
			      catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}
	
		
		try {
		       System.out.println("Escenario 2-> agregarPelicula()");
			   inca.agregarPelicula("It", inca.traerGenero(2));
			   inca.agregarPelicula("El babadook", inca.traerGenero(2));
			   inca.agregarPelicula("Mama", inca.traerGenero(2));
			   
			  
		
			   
			   
			  
		       }
		   
			      catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}
		try {
		       System.out.println("Escenario 3-> modificarGenero()");
			   inca.modificarGenero(2,"Terror bien chingon");
			   
			  
		
			   
			   
			  
		       }
		   
			      catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}
		try {
		       System.out.println("Escenario 4-> eliminarGenero()");
			   inca.eliminarGenero(2);
			  
			   
			  
		
			   
			   
			  
		       }
		   
			      catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}
		
		try {
			System.out.println("Escenario 5-> traer Peliculas por genero terror");
			
			System.out.println(inca.traerPelicula(inca.traerGenero(2)));
		}
		catch(Exception e){
			System.out.println("Excepcion: " + e.getMessage());
			
		}
		
		
		
		
		
		finally{
			     System.out.println(inca);
			}

	}

}
