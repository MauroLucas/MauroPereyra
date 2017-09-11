package test;
import modelo.Circulo;
import modelo.Punto;
public class TestCirculo {

	public static void main(String[] args) {
		
       Punto punto1=new Punto(4,5);
       
       Circulo circulo1=new Circulo(punto1,10);
       Circulo circulo2=new Circulo(punto1,20);
       
       System.out.println("Circulo:Punto:"+circulo1.getOrigen().toString()+ "Radio:"+circulo1.getRadio());
       System.out.println("Circulo:Punto:"+circulo2.getOrigen().toString()+ "Radio:"+circulo2.getRadio());
       
       
      circulo1.mover(5,20);
      
      System.out.println("Circulo:Punto:"+circulo1.getOrigen().toString()+ "Radio:"+circulo1.getRadio());
      System.out.println("Circulo:Punto:"+circulo2.getOrigen().toString()+ "Radio:"+circulo2.getRadio());
	}

}
