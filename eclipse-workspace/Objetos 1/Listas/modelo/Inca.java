package modelo;
 import java.util.List;
public class Inca {

	private List<Pelicula> catalogo;
	
	public Inca() {}
	public Inca(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	public boolean agregarPelicula(String pelicula) {
		boolean resultado=false;
		for(Pelicula peli: catalogo) {
			if(pelicula.equals(peli.getPelicula()))
				resultado=true;
		}
		return resultado;
	}
	
	public Pelicula traerPelicula (int idPelicula) {
		Pelicula resultado=null;
		for(Pelicula peli:catalogo) {
			if(peli.getIdPelicula() == idPelicula) {
				Pelicula aux = new Pelicula();
				aux.setIdPelicula(peli.getIdPelicula());
				aux.setPelicula(peli.getPelicula());
				resultado=aux;
			}
		}
		return resultado;
	}
	public Pelicula traerPelicula (String pelicula) {
		Pelicula resultado=null;
		for(Pelicula peli:catalogo) {
			if(pelicula.equals(peli.getPelicula())) {
				Pelicula aux = new Pelicula();
				aux.setIdPelicula(peli.getIdPelicula());
				aux.setPelicula(peli.getPelicula());
				resultado=aux;
			}
		}
		return resultado;
	}

	
	
	
	
	
	
	
}
