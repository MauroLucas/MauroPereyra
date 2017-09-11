package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class TestLista {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();
		
		String elemento=" ";
		 
		 while(!((elemento.equalsIgnoreCase("stop")))) {
			 System.out.println("Para finalizar tipear stop");
			 elemento=teclado.next();
			 if(!elemento.equals("stop"))
              lista.add(elemento);
		 }
		 for(String s : lista) {
			 System.out.println(s);
		 }

	}

}
