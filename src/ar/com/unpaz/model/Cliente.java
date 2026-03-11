package ar.com.unpaz.model;

import java.util.List;

public class Cliente {

	private int numeroCliente;
	private List<Cuenta> cuenta;
	private Contacto contacto;
	
	public int getNumeroCliente(){
		return this.numeroCliente;
	}
	
	public void setNumeroCliente(int numCliente) {
		this.numeroCliente = numCliente;
	}
	
	public List<Cuenta> getCuenta() {
		return this.cuenta;
	}
	
	public void setCuenta(List<Cuenta> cuentaNueva) {
		this.cuenta = cuentaNueva;
	}
	
	public Contacto getContacto() {
		return this.contacto;
	}
	
	public void setContacto(Contacto contactoNuevo) {
		this.contacto = contactoNuevo;
	}
	
}
