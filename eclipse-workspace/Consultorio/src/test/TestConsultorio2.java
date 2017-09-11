package test;
import consultorio.Paciente;
import consultorio.Medico;
public class TestConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Paciente paciente1= new Paciente("Mauro","Pereyra",1.80F,23);
		 Medico medico1=new Medico();
		 
		 System.out.println(medico1.calcularIMC(paciente1));
	}

}
