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
 
  public int sumar(int n1){ // n=n+n1
  
	return(n1+n);
  }
  public int multiplicar(int n1) { //n=n*n1
  
     return(n*n1); 
  }
  public boolean esPar() { 
  
	boolean par;
	  if((n%2)==1) par=false;
	  else par=true;
		
	return par;	
  }
  private boolean esPrimo(int n1) {
	  boolean primo;
	  int contador=0;
	  for(int i=2;i<=n1;i++)
	  {
		  if(n1%i==0) {
			  contador++;
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
  public String convertirAString() {
	  return(String.valueOf(n));
  }
  public double convertirADouble() {
	  return(Double.parseDouble(String.valueOf(n)));
  }
  public double calcularPotencia(int exp) {
	  
	 return(Math.pow(n,exp));
  }
  public String Base2() {
	  int digito;
	  int numero=n;
	  int exp=0;
	  double binario=0;
      
      while(numero!=0){
              digito = numero % 2;            
              binario = binario + digito * Math.pow(10, exp);   
              exp++;
              numero = numero/2;
      }
	  int x = (int)binario;//Convertir de Double a int//
	  return (String.valueOf(x));
	  
  }
  public int calcularFactorial() {
	  int factorial=1;
	  if(n==0) {
		  factorial=1;
	  }
	  else {
		 for(int i=1;i<=n;i++) {
		  
			  factorial=factorial*i;
		  }
		 
	  }
		 return(factorial);
  }
  public int numeroCombinatorio(int n1) {
	 
	  int resultado;
	  Numero m = new Numero(n);
	  Numero n =new Numero(n1);
	  int numerador;
	  int denominador;
	  numerador=m.calcularFactorial();
	  m.setNumero(m.getNumero()-n.getNumero());// m=m-2//
	  denominador=m.calcularFactorial()*n.calcularFactorial();
	  resultado=(numerador/denominador);
	  
	  
	  return(resultado);
	  
	  
  }
  
 

  
}

