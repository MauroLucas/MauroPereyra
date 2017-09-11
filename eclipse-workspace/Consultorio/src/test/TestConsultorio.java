package test;
import consultorio.Paciente;
public class TestConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Paciente paciente1= new Paciente("Mauro","Pereyra",1.80F,23);
       System.out.println(paciente1.getNombreCompleto());
	}

}
