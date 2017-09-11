package test;
import modelo.Numero;

public class Test1 {

	public static void main(String[] args) {
		
		Numero n1 = new Numero (17);
		Numero n2=new Numero (20);
		System.out.println("Es primo?:"+n1.getNumero()+" "+n1.esPrimo());
		System.out.println("Es primo?:"+n2.getNumero()+" "+n2.esPrimo());
	}

}
