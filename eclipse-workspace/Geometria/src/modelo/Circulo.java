package modelo;

public class Circulo {

	

	private Punto origen;
	private double radio;
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;
	}
	
	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	public void setRadio(Punto radio) {
		this.radio = radio.calcularDistancia(this.origen);
	}
	public boolean equals(Circulo c) {
		
		return (origen==c.getOrigen() && this.radio==c.getRadio());
	}
	public String toString() {
		
		return("Origen:"+origen.toString() + "Radio:"+radio );
	}
	
	public double calcularPerimetro() {
		
		return (2*radio*Math.PI);
	}
	public double calcularArea() {
		
		return (Math.PI*radio*radio);
	}
	public double calcularDistancia(Circulo c) {
		
		return(this.origen.calcularDistancia(c.getOrigen()));
		
	}
 
	public void mover(double desplazamientoX,double desplazamientoY) {
		
		Punto nuevoOrigen=new Punto(origen.getX(),origen.getY());
		origen=nuevoOrigen;
		
		origen.mover(desplazamientoX, desplazamientoY);
	}
}
