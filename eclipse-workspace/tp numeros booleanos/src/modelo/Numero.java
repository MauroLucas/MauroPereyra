package modelo;

public class Numero {
  //Atrivutos
	private int n;
  
  //MEtodos
  public Numero() {} //Constructor
  public Numero(int n) { //Contructor
	  this.n=n;
  }
  public void setNumero(int n) { //Asigna un valor a n
	  this.n=n;
  }
  public int getNumero() { // Retorna n
	  return(this.n);
  }
 
 
  private boolean esPrimo(int n1) {
	  boolean primo=false;
	  int contador=0;
	  for(int i=2;i<=n1;i++)
	  {
		  if(n1%i==0) {
			  contador=contador+1;
		  }
	  }
	  if(contador==1) {
		  primo=true;
	  }
	  else {
		  primo=false;
	  }
		  
	  
	  
	  return (primo);
  }
  public boolean esPrimo() {
	  return this.esPrimo(n);
  }
  
  public boolean esPrimoMellizo() {
	  
	  
	  boolean resultado=false;
	  if(this.esPrimo(n) && this.esPrimo(n+2)) {
		  resultado=true;
	  }
	  
	  return resultado;
  }
  
 

  
}

