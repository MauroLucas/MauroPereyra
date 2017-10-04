package modelo;

public class Pelicula {
	
	private int idPelicula;
	private String pelicula;
	private Genero genero;
	
	public Pelicula() {}
	public Pelicula(int idPelicula, String pelicula,Genero genero)throws Exception {
		super();
		this.idPelicula = idPelicula;
		this.setPelicula(pelicula);
		this.genero=genero;
	}
	
	
	@Override
	public String toString() {
		return " Nombre:"+pelicula+"  Id:" + idPelicula + " Genero:"+genero.getGenero() + " IdGenero:" +genero.getIdGenero();
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getPelicula() {
		return pelicula;
	}
	public void setPelicula(String pelicula)throws Exception {
		if(pelicula.length()==0)throw new Exception("El nombre esta vacio");
		this.pelicula = pelicula;
	}
	public boolean equals(Pelicula pelicula) {
		boolean resultado=false;
		if(idPelicula==pelicula.getIdPelicula())resultado=true;
		return resultado;
	}
	
	public void setGenero(Genero genero) {
		this.genero=genero;
	}
	

}
