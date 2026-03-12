package ar.com.unpaz.model;

import java.util.List;
import java.util.ArrayList;

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
	
	public Cliente() {
		this.cuenta = new ArrayList<>();
	    }
	
	
	public void addCuenta(Cuenta cuentaNueva) {
		this.cuenta.add(cuentaNueva);//Este metodo solo agrega cuentas (de a 1)
	}
	
	public Contacto getContacto() {
		return this.contacto;
	}
	
	public void setContacto(Contacto contactoNuevo) {
		this.contacto = contactoNuevo;
	}
	
}
