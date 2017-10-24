package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar; 

public class Funciones {
	
	public static boolean esBisiesto(int anio) {
		boolean bisiesto;
		if(anio%4==0  && (anio%100!=0 || anio%400==0)) {
			
			bisiesto = true;
		}
		else {
			bisiesto=false;
		}
		
		return bisiesto;
	}
	
	public static int traerAnio(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.YEAR);
	}
	
	public static int traerMes(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.MONTH)+1;
	}
	
	public static int traerDia(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	
	public static boolean esFechaValida(int anio,int mes,int dia) {
		
		boolean fechavalida=true;
	    
		switch (mes) {
		
		case 1:if(dia>31) fechavalida=false;break;
		case 2:if(dia>28 && !esBisiesto(anio))fechavalida=false;break;
		case 3:if(dia>31)fechavalida=false; break;
		case 4:if(dia>30)fechavalida=false; break;
		case 5:if(dia>31)fechavalida=false; break;
		case 6:if(dia>30)fechavalida=false; break;
		case 7:if(dia>31)fechavalida=false; break;
		case 8:if(dia>31)fechavalida=false; break;
		case 9:if(dia>30)fechavalida=false; break;
		case 10:if(dia>31)fechavalida=false; break;
		case 11:if(dia>30)fechavalida=false; break;
		case 12:if(dia>31)fechavalida=false; break;
		default :fechavalida=false;
		}
		return fechavalida;
	}
	
	
	public static GregorianCalendar traerFecha(int anio,int mes,int dia) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		resultado.set(anio, mes-1, dia);
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		
		return(resultado);
		
	}
public static GregorianCalendar traerFecha(int anio,int mes,int dia,int horas,int minutos,int segundos) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		resultado.set(anio, mes-1, dia,horas,minutos,segundos);
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		
		return(resultado);
		
	}
	
	public static GregorianCalendar traerFecha(String fecha) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(fecha.length()==10) {
		String dia= fecha.substring(0,2);
		String mes = fecha.substring(3,5);
		String anio=fecha.substring(6,10);
			
		
		resultado.set(Integer.parseInt(anio),Integer.parseInt(mes)-1,Integer.parseInt(dia));  // paso de string a int
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		return resultado;
	}
	
	public static String traerFechaCorta(GregorianCalendar fecha) {
		String resultado = new String();
		if(fecha!=null) {
			
			String dia=String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
			String mes=String.valueOf(fecha.get(Calendar.MONTH)+1);
			String anio = String.valueOf(fecha.get(Calendar.YEAR));
					
					
			
			resultado = (dia+ "/" +mes + "/" + anio);
		}
		else {
			resultado=null;
		}
		return resultado;
		
	}
	
	public static String traerFechaCortaHora(GregorianCalendar fecha) {
		
		String resultado = new String();
		if(fecha!=null) {
			
			String dia=String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
			String mes=String.valueOf(fecha.get(Calendar.MONTH)+1);
			String anio = String.valueOf(fecha.get(Calendar.YEAR));
			String hora = String.valueOf(fecha.get(Calendar.HOUR_OF_DAY));
			String minutos=String.valueOf(fecha.get(Calendar.MINUTE));
			String segundos=String.valueOf(fecha.get(Calendar.SECOND));
					
					
			
			resultado = (dia+ "/" +mes + "/" + anio + " " + hora+":"+minutos+":"+segundos);
		}
		else {
			resultado=null;
		}
		return resultado;
	}
	
	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha,int cantdias) {
		
		
		GregorianCalendar resultado = (GregorianCalendar) fecha.clone();
		resultado.add(GregorianCalendar.DAY_OF_YEAR, cantdias);
		resultado.setTime(resultado.getTime());
		return resultado;
		
		
		
	}
	
	public static boolean esDiaHabil(GregorianCalendar fecha) {
	boolean resultado=true;	
	switch(fecha.get(Calendar.DAY_OF_MONTH)){
	case 1:resultado=false;
	case 7:resultado=false;
	}
	return resultado;
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		
		String resultado = new String();
		int dia= fecha.get(Calendar.DAY_OF_WEEK);
		switch(dia) {
		
		case 1:resultado="Domingo"; break;
		case 2:resultado="Lunes";break;
		case 3:resultado="Martes";break;
		case 4:resultado="Miercoles";break;
		case 5:resultado="Jueves";break;
		case 6:resultado="Viernes";break;
		case 7:resultado="Sabado";break;
		
		}
		
		return resultado;
	}
	
	public static String traerMesEnLetras(GregorianCalendar fecha) {
		String resultado=new String();
		int mes=fecha.get(Calendar.MONTH);
		switch(mes) {
		
		case 0:resultado="Enero";break;
		case 1:resultado="Febrero";break;
		case 2:resultado="Marzo";break;
		case 3:resultado="Abril";break;
		case 4:resultado="Mayo";break;
		case 5:resultado="Junio";break;
		case 6:resultado="Julio";break;
		case 7:resultado="Agosto";break;
		case 8:resultado="Septiempre";break;
		case 9:resultado="Octubre";break;
		case 10:resultado="Noviembre";break;
		case 11:resultado="Diciembre";break;
		}
		
		return resultado;
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha) {
		
		String resultado = new String();
		resultado=traerDiaDeLaSemana(fecha)+" " + String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)+" de "+ traerMesEnLetras(fecha)+" del "+String.valueOf(fecha.get(Calendar.YEAR)));
		return resultado;
	}
	
	public static boolean sonFechasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
		
		boolean resultado=false;
		
		if (fecha.get(Calendar.DAY_OF_MONTH)== fecha1.get(Calendar.DAY_OF_MONTH)) {
			if(fecha.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH)) {
				if(fecha.get(Calendar.YEAR)==fecha1.get(Calendar.YEAR)) {
					resultado=true;
				}
			}
			
		}
		return resultado;
	}
	
public static boolean sonFechasHorasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
		
		boolean resultado=false;
		
		if (fecha.get(Calendar.DAY_OF_MONTH)== fecha1.get(Calendar.DAY_OF_MONTH)) {
			if(fecha.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH)) {
				if(fecha.get(Calendar.YEAR)==fecha1.get(Calendar.YEAR)) {
					if(fecha.get(Calendar.HOUR)==fecha1.get(Calendar.HOUR)) {
						if(fecha.get(Calendar.MINUTE)==fecha1.get(Calendar.MINUTE)) {
							if(fecha.get(Calendar.SECOND)==fecha1.get(Calendar.SECOND)) {
								resultado=true;
							}
						}
					}
				}
			}
			
		}
		return resultado;
	}
	
	public static int traerCantDiasDeUnMes(int anio,int mes) {
		int resultado=0;
		switch(mes) {
		
		case 1:resultado=31;
		case 2:if(esBisiesto(anio))resultado=29;else resultado=28;break;
		case 3:resultado=31;
		case 4:resultado=30;
		case 5:resultado=31;
		case 6:resultado=30;
		case 7:resultado=31;
		case 8:resultado=31;
		case 9:resultado=30;
		case 10:resultado=31;
		case 11:resultado=30;
		case 12:resultado=31;
		}
		
		return resultado;
	}
	
	public static double aproximar2Decimal(double valor) {
		
		 return Math.rint(valor*100)/100;
	}
	
	public static boolean esNumero(char c) {
		
		return (Character.isDigit(c));
	}
	
	public static boolean esLetra(char c) {
		return (Character.isLetter(c));
	}
	
	public static boolean esCadenaNros(String cadena) {
		boolean resultado=true;
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isDigit(c)) {
				resultado=false;
			}
		}
		return resultado;
	}
	
	public static boolean esCadenaLetras(String cadena) {
		boolean resultado=true;
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isLetter(c)) {
				resultado=false;
			}
		}
		return resultado;
	}

	public static double convertirADouble(int n) {
		
		return ((double) n);
	}
	
	

	

	
	
	
	
	
	
	

}
