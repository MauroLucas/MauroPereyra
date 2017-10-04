package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar; 

public class Ceta {
	
	private int idCeta;
	private GregorianCalendar fecha;
	private Contribuyente vendedor;
	private Contribuyente comprador;
	private double valorDeTranferencia;
	private Rodado rodado;
	public Ceta() {}
	public Ceta(int idCeta, GregorianCalendar fecha, Contribuyente vendedor, Contribuyente comprador,
			double valorDeTranferencia, Rodado rodado) throws Exception {
		super();
		this.idCeta = idCeta;
		this.setFecha(fecha);
		this.setVendedor(vendedor);
		this.setComprador(comprador);
		this.valorDeTranferencia = valorDeTranferencia;
		this.rodado = rodado;
	}
	public int getIdCeta() {
		return idCeta;
	}
	public void setIdCeta(int idCeta) {
		this.idCeta = idCeta;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha)throws Exception {
		
		if(fecha.after(Calendar.getInstance()))throw new Exception ("Error:La fecha es posterior a la fecha actual");
		this.fecha = fecha;
	}
	public Contribuyente getVendedor() {
		return vendedor;
	}
	public void setVendedor(Contribuyente vendedor)throws Exception {
		if(this.comprador!=null)
		if(vendedor.equals(this.comprador)) throw new Exception("Error:El comprador es igual al vendedor: " +"("+vendedor);
		this.vendedor = vendedor;
	}
	public Contribuyente getComprador() {
		return comprador;
	}
	public void setComprador(Contribuyente comprador)throws Exception {
		if(this.vendedor!=null)
		if(comprador.equals(this.vendedor)) throw new Exception("Error:El comprador es igual al vendedor: " +"("+comprador);
		this.comprador = comprador;
	}
	public double getValorDeTranferencia() {
		return valorDeTranferencia;
	}
	public void setValorDeTranferencia(double valorDeTranferencia) {
		this.valorDeTranferencia = valorDeTranferencia;
	}
	public Rodado getRodado() {
		return rodado;
	}
	public void setRodado(Rodado rodado) {
		this.rodado = rodado;
	}
	
	
	
	
	
    
	
	

}
