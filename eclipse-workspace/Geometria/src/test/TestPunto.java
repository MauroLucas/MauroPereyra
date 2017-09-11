package test;
import modelo.Punto;
public class TestPunto {

	public static void main(String[] args) {
		
     Punto punto1=new Punto(3,5);
     Punto punto2=new Punto(4,5);
     Punto punto3=new Punto(1,1);
     Punto punto4=new Punto(1,1);
     System.out.println(punto1.equals(punto2));
     System.out.println(punto3.equals(punto4));
	
	System.out.println("La distancia es" + punto4.calcularDistancia(punto1));
	
	System.out.println(punto1.toString());

}
}
