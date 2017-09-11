package modelo;

import java.util.Arrays;

public class ArregloUnidimensional {
//Atrivutos//
	private int vector[];
    
	public ArregloUnidimensional() {}
	public ArregloUnidimensional( int vector[]) {
		
		this.vector=vector;
	}
	public int[] getVector() {
		return vector;
	}
	

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	public int traerElMenor() {
		
		int menor=vector[0];
		
		for(int i=0;i<vector.length;i++) {
			if(vector[i]<menor) {
				menor=vector[i];
			}
		}
		
		return (menor);
	}
	public int traerElMayor() {
         int mayor=vector[0];
		
		for(int i=0;i<vector.length;i++) {
			if(vector[i]>mayor) {
				mayor=vector[i];
			}
		}
		
		return (mayor);
	}
	public double calcularPromedio() {
		int promedio=0;
		for(int i=0;i<vector.length;i++) {
			
			promedio=promedio + vector[i];
		}
		promedio=promedio/vector.length;
		return((Double.parseDouble(String.valueOf(promedio))));
		
	}
	
	
	@Override
	public String toString() {
		return "ArregloUnidimensional [vector=" + Arrays.toString(vector) + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArregloUnidimensional other = (ArregloUnidimensional) obj;
		if (!Arrays.equals(vector, other.vector))
			return false;
		return true;
	}
	public double traerFrecuencia(int numero) {
		double frecuencia=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]==numero) {
				frecuencia++;
			}
		}
	    frecuencia=frecuencia/vector.length;
		return(frecuencia);
			
	}
	
	public int traerModa() { //Retorna el numero con mayor frecuencia//
		
		ArregloUnidimensional arreglo = new ArregloUnidimensional();
	    arreglo.setVector(vector);
	    int moda=0;
	    double mayorFrecuencia=arreglo.traerFrecuencia(vector[0]);//Toma al primer elemento del arreglo como la mayor frecuencia.
		moda=arreglo.getVector()[0];//Moda primer elemento del arreglo
	    for(int i=1;i<vector.length;i++) {
			
			if(arreglo.traerFrecuencia(vector[i])>mayorFrecuencia) {
				moda=arreglo.getVector()[i];
			}
		}
		
	
		return moda;
	}
	
	
	public int[] ordenarDescendente() {
		
		int[] arreglo = new int[vector.length];
		arreglo=vector.clone();
		
		for(int i=0;i<arreglo.length;i++) {
			for(int j=0;j<(arreglo.length)-1;j++) {
				
				if(arreglo[j]<arreglo[j+1]) {
					int aux = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
				}
			}
			
		}
		
		return(arreglo);
		
	}
public int[] ordenarAscendente() {
		
		int[] arreglo = new int[vector.length];
		arreglo=vector.clone();
		
		for(int i=0;i<arreglo.length;i++) {
			for(int j=0;j<(arreglo.length)-1;j++) {
				
				if(arreglo[j]>arreglo[j+1]) {
					int aux = arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
				}
			}
			
		}
		
		return(arreglo);
		
	}
	
	
	
	
	
}
