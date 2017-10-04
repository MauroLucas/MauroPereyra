package test;

public class Test {

	public static void main(String[] args) {
		int contador=0;
		int contador2=0;
		boolean hola=true;
		int[][] a = new int[6][6];
		int[][] b = new int[6][6];
		for(int i=1;i<7;i++) {
			for(int j=1;j<7;j++) {
				 
				if ((i+j)%2==0){
				
				
					System.out.print("("+i+","+j+")");
					contador=contador+1;
				  
				}
				
				
				
				
			}
		}
		System.out.println(contador);
		
		
		

	}

}
