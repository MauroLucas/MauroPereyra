package modelo;

public class Contribuyente {
	private int idContribuyente;
	private String apellido;
	private String nombre;
	private long dni;
	private char sexo;
	private String cuil;
	
	public Contribuyente() {}

	public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil)throws Exception {
		super();
		this.idContribuyente = idContribuyente;
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.setSexo(sexo);
		this.setCuil(cuil);
	}

	@Override
	public String toString() {
		return "Contribuyente [idContribuyente=" + idContribuyente + ", apellido=" + apellido + ", nombre=" + nombre
				+ ", dni=" + dni + ", sexo=" + sexo + ", cuil=" + cuil + "]";
	}

	

	
	public boolean equals(Contribuyente obj) {
	    boolean resultado=false;
		
		
		if (this.dni == obj.getDni())
			return true;
		
		return resultado;
	}

	public int getIdContribuyente() {
		return idContribuyente;
	}

	public void setIdContribuyente(int idContribuyente) {
		this.idContribuyente = idContribuyente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil)throws Exception {
		if(!this.validarCuil(cuil))throw new Exception("Error: cuil incorrecto "+"("+cuil+")" +"Ejemplo:20 38301299 17");
		this.cuil = cuil;
	}
	
    public void setSexo(char sexo)throws Exception  {
		
		if(!this.validarSexo(sexo)) throw new Exception("Error:SEXO incorrecto: "+sexo+" Ingrese un sexo correcto. EJ: m o f");
		if(sexo=='m')sexo='M';
		if(sexo=='f')sexo='F';
		this.sexo = sexo;
	}
    
    public boolean validarSexo(char sexo) {
    	boolean resultado=true;
    	if(sexo!='m' && sexo!='f' && sexo!='M' && sexo!='F')resultado=false;
    	return resultado;
    	
    }
    
    public boolean validarCuil(String cuil)throws Exception {
    	
    	//EJ: cuil 20 17254359 7
    	//27:Femenino
    	//20:Masculino
    	boolean resultado=true;
    	
    	String sexo=cuil.substring(0,2);
    	String dni=cuil.substring(2,10);
    	String codVerificacion=cuil.substring(10,11);
    	int pos0,pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9;
    	pos0=Integer.parseInt(cuil.substring(0,1));
    	pos1=Integer.parseInt(cuil.substring(1,2));
    	pos2=Integer.parseInt(cuil.substring(2,3));
    	pos3=Integer.parseInt(cuil.substring(3,4));
    	pos4=Integer.parseInt(cuil.substring(4,5));
    	pos5=Integer.parseInt(cuil.substring(5,6));
    	pos6=Integer.parseInt(cuil.substring(6,7));
    	pos7=Integer.parseInt(cuil.substring(7,8));
    	pos8=Integer.parseInt(cuil.substring(8,9));
    	pos9=Integer.parseInt(cuil.substring(9,10));
    	
    	pos0=pos0*5;
    	pos1=pos1*4;
    	pos2=pos2*3;
    	pos3=pos3*2;
    	pos4=pos4*7;
    	pos5=pos5*6;
    	pos6=pos6*5;
    	pos7=pos7*4;
    	pos8=pos8*3;
    	pos9=pos9*2;
    	
    	int v1=pos0+pos1+pos2+pos3+pos4+pos5+pos6+pos7+pos8+pos9;
    	int v2= v1 % 11;
    	int v3= 11-v2;
    	
    	switch(v3) {
    	case 11:v3=0;break;
    	case 10:v3=9;break;
    	}
    	
    	//validaciones
    	if(this.sexo=='m' && !sexo.equals("20")) {
    		resultado=false;
    		
    	}
    	if(this.sexo=='f' && !sexo.equals("27")) {
    		resultado=false;
    		
    	}
    	if(!dni.equals(String.valueOf(this.dni))) {
    		resultado=false;
    		
    	}
    	if(!codVerificacion.equals(String.valueOf(v3))) {
    		resultado=false;
    		
    	}
    	
    	return resultado;
    }

}
