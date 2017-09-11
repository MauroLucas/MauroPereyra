package test;

import modelo.Numero;
public class Test3 {

	public static void main(String[] args) {
		Numero num = new Numero(20);
		Numero aux = new Numero();
		for(int i=1;i<num.getNumero();i++) {
			
			aux.setNumero(i);
			System.out.println("Numero:"+aux.getNumero()+"esPrimo?:"+aux.esPrimo());
		}

	}

}
