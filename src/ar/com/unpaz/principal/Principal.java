package ar.com.unpaz.principal;

import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.model.Contacto;
import ar.com.unpaz.model.Cuenta;

public class Principal {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setNumeroCuenta(6856);
		
//		System.out.println("Numero De Cuenta:" + cuenta1.getNumeroCuenta());
		cuenta1.setTitular("Ruben");
//		System.out.println("El titular de la cuenta es:" + cuenta1.getTitular());
		cuenta1.setSaldo(0);
//		System.out.println("El saldo de la cuenta es" + cuenta1.getSaldo());
		
		
		// TODO Austo-generated method stub
		
		Contacto contacto1 = new Contacto();
		contacto1.setCodigoPostal(1563);
		contacto1.setFechaDeNacimiento("14/06/2003");
		contacto1.setEmail("rdelviso@austrl");
		contacto1.setNombre("Ruben Del Viso");
		contacto1.setDocumento(45150352);
		
		//Ya una vez creado el contacto lo guardo como atributo de cliente
		

		
//		
//
//		
		Cliente cliente1 = new Cliente();
		cliente1.setNumeroCliente(1000);
		
		System.out.println(cliente1);
		
		cliente1.addCuenta(cuenta1);
		
		cliente1.setContacto(contacto1);
		
	}

}
