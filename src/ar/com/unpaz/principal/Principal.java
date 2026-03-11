package ar.com.unpaz.principal;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Contacto;
import ar.com.unpaz.model.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setNumeroCuenta(6856);
		
		System.out.println("Numero De Cuenta:" + cuenta1.getNumeroCuenta());
		cuenta1.setTitular("Ruben");
		System.out.println("El titular de la cuenta es:" + cuenta1.getTitular());
		cuenta1.setSaldo(0);
		System.out.println("El saldo de la cuenta es" + cuenta1.getSaldo());
		
		
		// TODO Austo-generated method stub
		
		Contacto contacto1 = new Contacto();
		contacto1.setCodigoPostal(1563);
		System.out.println("Hacer sets y gets de class contacto");
		
//		
//
//		
//		Cliente cliente1 = new Cliente();
//		cliente1.setNumeroCliente(1000);
//		System.out.println(cliente1);
//		cliente1.setCuenta(cuenta1);
//		System.out.println(cuenta1);
//		cliente1.setContacto(contacto1);
//		System.out.println(contacto1);
	}

}
