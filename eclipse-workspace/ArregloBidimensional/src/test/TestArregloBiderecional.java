package test;
import java.util.Arrays;

import modelo.ArregloBiderecional;
public class TestArregloBiderecional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double[][] matriz = {{2,1,0,7},{3,4,2,-1},{1,0,5,8}};
		double[][] matriz1= {{2,3,5,1},{7,2,4,3},{-1,5,0,8}};
		double[][] matriz2= {{1,1},{7,2},{0,-5},{4,0}};
		ArregloBiderecional matrizA = new ArregloBiderecional(matriz1);
		ArregloBiderecional matrizB = new ArregloBiderecional(matriz2);
		ArregloBiderecional suma = new ArregloBiderecional(matrizA.sumar(matrizB.getMatriz()));
		ArregloBiderecional resta = new ArregloBiderecional(matrizA.restar(matrizB.getMatriz()));
		ArregloBiderecional transpuesta = new ArregloBiderecional(matrizA.transpuesta());
		ArregloBiderecional multiplicacion = new ArregloBiderecional(matrizA.multiplicar(2));
		ArregloBiderecional multiplicacionmatrices = new ArregloBiderecional(matrizA.multiplicar(matriz2));
		System.out.println(matrizA);
		System.out.println(matrizB);
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(transpuesta);
		System.out.println(multiplicacion);
		System.out.println(multiplicacionmatrices);
	   
	}

}
