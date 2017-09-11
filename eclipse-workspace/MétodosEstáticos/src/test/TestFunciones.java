package test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelo.Funciones;
public class TestFunciones {

	public static void main(String[] args) {
		GregorianCalendar fecha = new GregorianCalendar();
		
		System.out.println(Funciones.traerAnio(fecha));
		System.out.println(Funciones.traerMes(fecha));
		System.out.println(Funciones.traerDia(fecha));
		System.out.println(Funciones.esBisiesto(1994));
		System.out.println(Funciones.esFechaValida(Funciones.traerAnio(fecha),Funciones.traerMes(fecha),Funciones.traerDia(fecha)));
		System.out.println(Funciones.esFechaValida(1994,05,31));
		
		System.out.println(Funciones.traerFecha(1994, 05, 31));
		
		System.out.println(Funciones.traerFecha("22/05/1994"));
		
		System.out.println("Fecha Corta: " +Funciones.traerFechaCorta(Funciones.traerFecha("22/05/1994")));
		System.out.println("Fecha Corta: " +Funciones.traerFechaCorta(fecha));


		System.out.println("Fecha Corta Y hora "+Funciones.traerFechaCortaHora(fecha));
	    
		System.out.println("Fecha Proxima:"+(Funciones.traerFechaCorta(Funciones.traerFechaProximo(fecha,27))));
		System.out.println("Fecha Proxima:"+(Funciones.traerFechaCorta(Funciones.traerFechaProximo(Funciones.traerFecha("22/05/1994"),7))));
		System.out.println("Dia habil?:"+Funciones.esDiaHabil(fecha)+Funciones.traerFechaCorta(fecha));
		System.out.println("Dia de la semana:"+Funciones.traerDiaDeLaSemana(fecha));
		System.out.println("Mes:"+Funciones.traerMesEnLetras(fecha));
		System.out.println("Fecha larga:"+Funciones.traerFechaLarga(fecha));
		System.out.println("Fecha larga:"+Funciones.traerFechaLarga(Funciones.traerFecha("04/09/2017")));
        System.out.println("Son iguales?:" + Funciones.sonFechasIguales(fecha,Funciones.traerFecha("04/09/2017")));
        
        System.out.println("Son fehca hora iguales?:" + Funciones.sonFechasHorasIguales(fecha, fecha));
        
        System.out.println("cantidad de dias de fecha:" + Funciones.traerCantDiasDeUnMes(1996, 2));
        double numero=3.4444;
        System.out.println("Valor"+numero+" Redondeado: "+Funciones.aproximar2Decimal(numero));
        
        System.out.println("Es numero?:"+Funciones.esNumero('2'));
        System.out.println("Es letra?:"+Funciones.esLetra('a'));
        System.out.println("Es cadena de numero?:"+Funciones.esCadenaNros(new String("123a567")));
        System.out.println("Es cadena de letras?:"+Funciones.esCadenaLetras(new String("holamundo")));
        
	}

	

}
