package test;

import modelo.Numero;
public class Test4 {

	public static void main(String[] args) {
		
		Numero num = new Numero(10);
		Numero aux = new Numero();
		for(int i=1;i<num.getNumero();i++) {
			
			aux.setNumero(i);
			System.out.println("Numero:"+aux.getNumero()+"esMellizo:"+aux.esPrimoMellizo());
		}

	}

}
