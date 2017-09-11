package test;
import modelo.Numero;
public class TestNumero {

	public static void main(String[] args) {
		Numero numero1=new Numero(3);
		int num=3;
		System.out.println("Numero:"+numero1.getNumero());
		System.out.println("Numero:"+numero1.getNumero() +"+" +num+"="+numero1.sumar(num));
		System.out.println("Numero:"+numero1.getNumero() +"*" +num+"="+numero1.multiplicar(num));
		if(numero1.esPar()==true) {System.out.println("Es Par");}
		else {System.out.println("Es Impar");}
		if(numero1.esPrimo()==true) {System.out.println("Es Primo");}
		else{System.out.println("No es primo");}	
		System.out.println("Numero:" + numero1.getNumero() + " String:" + numero1.convertirAString());
		System.out.println("Numero:" + numero1.getNumero() + " Double:" + numero1.convertirADouble());
		System.out.println("Numero:" + numero1.getNumero() + "^" + num +"="+numero1.calcularPotencia(num));
		System.out.println("Numero:"+numero1.getNumero()+" Base2:" + numero1.Base2());
		System.out.println("Factorial:"+numero1.calcularFactorial());
		System.out.println("Numero:"+numero1.getNumero()+" C"+numero1.getNumero()+";"+num+"="+numero1.numeroCombinatorio(num));
		
	}

}
