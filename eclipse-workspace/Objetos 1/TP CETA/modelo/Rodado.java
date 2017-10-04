package modelo;

public class Rodado {
	private int idRodado;
    private String dominio;
    private int modelo;
    private String marca;
    
    public Rodado() {}
    
    public Rodado(int idRodado, String dominio, int modelo, String marca)throws Exception {
		super();
		this.idRodado = idRodado;
		this.setDominio(dominio);
		this.modelo = modelo;
		this.marca = marca;
	}
    
	@Override
	public String toString() {
		return "Rodado [idRodado=" + idRodado + ", dominio=" + dominio + ", modelo=" + modelo + ", marca=" + marca
				+ "]";
	}

	public int getIdRodado() {
		return idRodado;
	}

	public void setIdRodado(int idRodado) {
		this.idRodado = idRodado;
	}

	public String getDominio() {
		return dominio;
	}

	public void setDominio(String dominio)throws Exception {
		if(!this.validarDominio(dominio)) throw new Exception("Error:Dominio Invalido "
				+dominio + " Ingrese un domio correcto.Ej:ABC123 o AB123CD");
		this.dominio = dominio;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public boolean validarDominio(String dominio) {
		//Dominio viejo:AAA123
		//Dominio nuevo:AB 123 CD
		boolean resultado=false;
		//VALIDAR DOMINIO VIEJO
		if(dominio.length()==6) {
			String letras=dominio.substring(0,3);
			String numeros=dominio.substring(3,6);
			if(Funciones.esCadenaNros(numeros) && Funciones.esCadenaLetras(letras)) {
				resultado=true;
			}
		}
		//VALIDAR DOMINIO NUEVO
		if(dominio.length()==7 && resultado==false) {
			String letras1=dominio.substring(0,2);
			String numeros=dominio.substring(2,5);
			String letras2=dominio.substring(5,7);
			if(Funciones.esCadenaLetras(letras1) && Funciones.esCadenaNros(numeros) && Funciones.esCadenaLetras(letras2)) {
				resultado=true;
			}
		}
		
		
		
		return resultado;
	}

	
    
}
