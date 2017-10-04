package test;
import modelo.*;
public class TestModificarPelicula {

	public static void main(String[] args) {
		
		try {
		     
			Inca inca = new Inca();   
			System.out.println("Escenario 1->Modficar");
			   
			   inca.agregarGenero("Comedia");
			   inca.agregarGenero("Terror");
			   inca.agregarGenero("Accion"); 
			   inca.agregarGenero("Drama");
			   inca.agregarPelicula("it", inca.traerGenero(2));
			   inca.modificarPelicula(1, "it 2", inca.traerGenero("drama"));
			   System.out.println(inca);
			   
			  
		       }
		   
			      catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}

	}

}
