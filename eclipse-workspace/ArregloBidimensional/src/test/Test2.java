package test;
import java.util.Arrays;

import modelo.ArregloBiderecional;
public class Test2 {

	public static void main(String[] args) {
		double[][] matriz1= {{2,3,4,5,4},{1,2,3,4,5,6}};
		System.out.println("Filas:"+matriz1.length+" Columnas:" + matriz1[0].length);
		for(int i =0;i<matriz1.length;i++) {
			
			for(int j=0;j<matriz1[i].length;j++) {
				System.out.print("valor de i:"+i + " ");
				System.out.print(matriz1[i][j] +" ");
			}
			System.out.println();
		}
	}

}
