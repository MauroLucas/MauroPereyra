package modelo;

public class Genero {
	
	private int idGenero;
    private String genero;
    
    public Genero() {}
    
    
	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", genero=" + genero + "]";
	}


	public boolean equals(Genero genero) {
		boolean resultado=false;
		if(idGenero==genero.getIdGenero())resultado=true;
		return resultado;
	}
	public Genero(int idGenero, String genero) {
		super();
		this.idGenero = idGenero;
		this.genero=genero;
	}


	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
    
}
