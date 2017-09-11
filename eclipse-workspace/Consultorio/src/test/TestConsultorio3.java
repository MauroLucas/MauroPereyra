package test;
import consultorio.Paciente;
public class TestConsultorio3 {

	public static void main(String[] args) {
		 Paciente paciente1= new Paciente("Mauro","Pereyra",1.80F,23);
		 Paciente paciente2= new Paciente("Mauro","Pereyra",1.80F,23);
           
		 if(paciente1==paciente2)
		 {
			 System.out.println("Tienen el mismo nombre");
		 }
		 else {
			 System.out.println("No son iguales");
		 }
	}

}
