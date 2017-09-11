package modelo;

import java.util.Arrays;

public class ArregloBiderecional {
	
	//Atributos//
	private double matriz[][];
    //Metodos//
	public ArregloBiderecional() {}
	public ArregloBiderecional(double[][] matriz) {
		super();
		this.matriz = matriz;
	}
	
	public double[][] getMatriz() {
		return matriz;
	}
	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}
	@Override
	public String toString() {
		return "ArregloBiderecional [matriz=" + Arrays.deepToString(matriz) + "]";
	}
	
	public double[][] sumar(double[][] matrizB){
		
	    double[][] resultado =new double[matriz.length][matrizB[0].length];
		
	    if((matriz.length != matrizB.length) || (matriz[0].length != matrizB[0].length)) {
	    	resultado=null;
	    }
	    else {
	    	
	    	for(int i=0;i<resultado.length;i++) {
	    		 
	    		for(int j=0;j<resultado[0].length;j++) {
	    			
	    			resultado[i][j]=matriz[i][j] + matrizB[i][j];
	    			
	    		}
	    		
	    	}
	    	
	   }
		
		
		return (resultado);
	}
public double[][] restar(double[][] matrizB){
		
	    double[][] resultado =new double[matriz.length][matrizB[0].length];
		
	    if((matriz.length != matrizB.length) || (matriz[0].length != matrizB[0].length)) {
	    	resultado=null;
	    }
	    else {
	    	
	    	for(int i=0;i<resultado.length;i++) {
	    		 
	    		for(int j=0;j<resultado[0].length;j++) {
	    			
	    			resultado[i][j]=matriz[i][j] - matrizB[i][j];
	    			
	    		}
	    		
	    	}
	    	
	   }
		
		
		return (resultado);
	}
	
    public double[][] transpuesta(){
    	
    	double[][] transpuesta =new double[matriz[0].length][matriz.length];
        for(int i=0;i<matriz[0].length;i++) {
        	
        	for(int j=0;j<matriz.length;j++) {
        		transpuesta[i][j]=matriz[j][i];
        	}
        }
    	
    	return (transpuesta);
    }
    
    public double[][] multiplicar(double escalar) {
    	double[][] resultado =new double[matriz.length][matriz[0].length];
    	
    	for(int i=0;i<resultado.length;i++) {
    		
    		for(int j=0;j<resultado[0].length;j++) {
    			
    			resultado[i][j] = matriz[i][j]*escalar;
    		}
    	}
    	
    	
    	return (resultado);
    }
    
    public double [][] multiplicar(double[][] matrizB){
    	
        double [][] matrizM = new double [matriz.length][matrizB[0].length];
		double acumulador = 0;
		
		if (matriz[0].length == matrizB.length){
			for (int filasMA = 0; filasMA < matriz.length; filasMA++){
				for (int i=0; i < matrizB[0].length; i++){
					for (int j = 0; j < matriz.length; j++){
						acumulador += matriz[filasMA][j] * matrizB[j][i];
					}
					matrizM[filasMA][i] = acumulador;
					acumulador = 0;
				}
			}
		}
		else{
			matrizM = null;
		}
		return matrizM;
    	
    }
	
	
	
}
