package modelo;
import java.util.ArrayList;
import java.util.List;
public class Inca {

	private List<Pelicula> catalogo;
	private List<Genero> generos;
	
	public Inca()  {
		super();
		this.catalogo = new ArrayList<Pelicula>();
		this.generos = new ArrayList<Genero>();
		
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}
    
	//Metodo nivel 2
	public List<Pelicula> traerPelicula(Genero genero)throws Exception{
		
		List<Pelicula> aux = new ArrayList<Pelicula>();
		for(Pelicula p:catalogo) {
			if(p.getGenero().equals(genero)) {
				aux.add(p);
			}
		}
		return aux;
	}
	
	public boolean agregarGenero(String genero)throws Exception{
		boolean resultado=false,encontrado=false;
		 Genero gen=this.traerGenero(genero);
		 if(gen!=null)throw new Exception("Genero ya ingresado");
		
		else {
			if(generos.size()==0) {
				generos.add(new Genero(1,genero));
			}
			else {
				generos.add(new Genero(generos.get(generos.size()-1).getIdGenero()+1,genero));
			}
			resultado=true;
		}
		
		return resultado;
	}
	
	
	public void modificarGenero(int idGenero,String genero)throws Exception {
		
		Genero gen = this.traerGenero(idGenero);
		if(gen==null)throw new Exception("Error: Genero no encontrado");
		for(Pelicula peli: catalogo) {
			if(peli.getGenero().equals(gen)) throw new Exception("Error: El genero esta utilizado");
		}
		gen.setGenero(genero);
	}
	
	public boolean eliminarGenero(int idGenero)throws Exception {
		
		Genero gen = this.traerGenero(idGenero);
		if(gen==null)throw new Exception("Error: Genero no encontrado");
		for(Pelicula peli: catalogo) {
			if(peli.getGenero().equals(gen)) throw new Exception("Error: El genero esta utilizado");
		}
		
		
		
		return generos.remove(gen);
	}
	
	
	public Genero traerGenero(int idGenero) {
		Genero gen = null;
		boolean encontrado=false;
		int i=0;
		while(i<generos.size() && encontrado==false) {
			if(idGenero==generos.get(i).getIdGenero()) {
				gen=generos.get(i);
				encontrado=true;
			}
			i++;
		}
		return gen;
	}
	
	public Genero traerGenero(String genero) {
		Genero gen = null;
		boolean encontrado=false;
		int i=0;
		while(i<generos.size() && encontrado==false) {
			if(genero.equalsIgnoreCase(generos.get(i).getGenero())) {
				gen=generos.get(i);
				encontrado=true;
			}
			i++;
		}
		return gen;
	}
	
	
	
	
	//Pre:Verifica si la pelicula ya existe
	
	//Post: Retorna true si la pelicula fue agregada exitosamente y false en caso contrario. 
  public boolean agregarPelicula(String pelicula,Genero genero)throws Exception {
		boolean resultado=false,encontrado=false;
		
		List<Pelicula> aux= new ArrayList(this.traerPelicula(pelicula));
		for(Pelicula p: aux) {
			if(pelicula.equals(p.getPelicula())) {
				encontrado=true;
			}
		}
		
		
		
		if(genero==null)throw new Exception("Error:Genero Inexistente");
		
		
		if (encontrado) throw new Exception("Error:Pelicula existente");
		else {
			
		 	if(catalogo.size()==0) {
		 		catalogo.add(new Pelicula(1,pelicula,genero));
		 	}
		 	else {
		 		
		 	
			Pelicula ultima= new Pelicula(catalogo.get(catalogo.size()-1).getIdPelicula()+1,pelicula,genero);
			
		 	catalogo.add(ultima);
			
		 	}
		 	
		 	resultado=true;
		}
		return resultado;
	}
	
	
	public Pelicula traerPelicula (int idPelicula) {
		Pelicula resultado=null;
		int i=0;
		boolean encontrado=false;
		while(i<catalogo.size() && !encontrado) {
			if(catalogo.get(i).getIdPelicula()==idPelicula) {
				resultado=catalogo.get(i);
				encontrado=true;
			}
			i++;
		}
		return resultado;
	}
	public List<Pelicula> traerPelicula (String partePelicula)throws Exception {
		
		List<Pelicula> resultado = new ArrayList();
		for(Pelicula peli:catalogo) {
			if(peli.getPelicula().contains(partePelicula)) {
				Pelicula aux = new Pelicula(peli.getIdPelicula(),peli.getPelicula(),peli.getGenero());
				resultado.add(aux);
			}
		}
		return resultado;
		
	}
	
	public void modificarPelicula(int idPelicula,String pelicula,Genero genero)throws Exception {
		
		Pelicula peli=this.traerPelicula(idPelicula);
		if(peli==null)throw new Exception("Pelicula incorrecta");
		peli.setPelicula(pelicula);
		peli.setGenero(genero);
		
		
		
		
	}
	
	public boolean eliminarPelicula(int idPelicula)throws Exception {
		Pelicula resultado=traerPelicula(idPelicula);
	    if(resultado==null)throw new Exception("No existe la pelicula");
		return catalogo.remove(resultado);
		
		
	}
	
	

	
	public String toString() {
		
		String resultado = "Peliculas: " +  " \n";
		
		for(Pelicula peli : catalogo) {
			resultado=resultado+ "Pelicula:"+ peli.toString() +"\n";
		}
		
	  resultado = resultado+ "Generos:"+ "\n";
	  for(Genero g : generos) {
		  resultado=resultado + "Genero: " + g.toString() + "\n";
	  }
		return resultado;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
