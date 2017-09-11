package test;
import java.util.Arrays;

import modelo.ArregloUnidimensional;
public class TestArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 10, 5, 28, 6, 1, 28 };
        
		
      ArregloUnidimensional arreglo = new ArregloUnidimensional(a1);
      ArregloUnidimensional arreglo2 = new ArregloUnidimensional(a1);
      System.out.println("Arreglo"+arreglo.toString());
      System.out.println("Menor:" + arreglo.traerElMenor());
      System.out.println("Mayor:" + arreglo.traerElMayor());
      System.out.println("Promedio:"+arreglo.calcularPromedio());
      System.out.println("Promedio:"+arreglo.calcularPromedio());
     
      System.out.println("Ordenado Descendente:"+ Arrays.toString(arreglo.ordenarDescendente()));
      System.out.println("Ordenado Ascendente:"+ Arrays.toString(arreglo.ordenarAscendente()));
      System.out.println("Frecuencia de 1:" + arreglo.traerFrecuencia(1));
      System.out.println("Frecuencia de 2:" + arreglo.traerFrecuencia(2));
      System.out.println("Frecuencia de 3:" + arreglo.traerFrecuencia(3));
      System.out.println("Frecuencia de 4:" + arreglo.traerFrecuencia(4));
      System.out.println("Frecuencia de 5:" + arreglo.traerFrecuencia(5));
      System.out.println("Moda:"+arreglo.traerModa());
      System.out.println("Arreglo"+arreglo.toString());
      
      System.out.println(arreglo.equals(arreglo2));
	}

}
