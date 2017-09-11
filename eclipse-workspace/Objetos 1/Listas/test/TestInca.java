package test;
import java.util.ArrayList;
import java.util.List;

import modelo.Inca;
import modelo.Pelicula;
public class TestInca {

	public static void main(String[] args) {
		
		Pelicula reyleon=new Pelicula(1,"Rey leon");
		Pelicula ochomillas=new Pelicula(2,"8 millas");
		Pelicula siperman=new Pelicula(3,"Spider man");
		
		
		List<Pelicula> catalogo =new ArrayList<Pelicula>();
	    
		catalogo.add(reyleon);
		catalogo.add(ochomillas);
		catalogo.add(siperman);
		
		Inca inca=new Inca(catalogo);
		System.out.println(inca.traerPelicula(1));
		imprimirInca(inca);
		
		

	}
	public static void imprimirInca(Inca inca) {
        for(Pelicula peli: inca.getCatalogo()) {
			
			System.out.println(peli);
		}
	}

}