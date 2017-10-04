package test;

import modelo.Rodado;

public class TestRodado {

	public static void main(String[] args) {
		//Excepciones rodado
				try {
					Rodado isuzu =new Rodado();
					isuzu.setDominio("1AA123CD");
					System.out.println(isuzu);
				}
				catch(Exception e){
					System.out.println("Excepcion: " + e.getMessage());
					
				}

	}

}
