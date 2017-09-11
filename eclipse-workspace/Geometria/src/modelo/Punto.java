package modelo;

public class Punto {

	private double x;
	private double y;
	
	public Punto() {}
	public Punto(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public boolean equals(Punto p) {
		
		return  x==p.getX() && y==p.getY();
	}
	public String toString() {
		return("x:"+x+","+"y:"+y);
	}
	public double calcularDistancia(Punto p) {
		
		//d^2={ [(x-x1)^2] + [(y-y1)^2]}
		double resultado;
		
		  resultado=Math.pow(x-p.getX(),2)   +  Math.pow(y-p.getY(), 2);
		  resultado=Math.sqrt(resultado);
		
		return(resultado);
		
	}
	 
	public void mover(double desplazamientoX,double desplazamientoY) {
		
		x=x+desplazamientoX;
		y=y+desplazamientoY;		
	}
}
