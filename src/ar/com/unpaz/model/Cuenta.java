package ar.com.unpaz.model;

public class Cuenta {
	private double numeroCuenta;
	private String titular;
	private double saldo;
	
	public double getNumeroCuenta() {
		return this.numeroCuenta;
		
	}
	
	public void setNumeroCuenta(double numeroCuenta) {
		
		this.numeroCuenta = numeroCuenta;
	}
	//Titular nuevo
	public String getTitular() {
		return this.titular;
		
	}
	
	public void setTitular(String titular) {
		
		this.titular = titular;
	}
	//saldo
		public double getSaldo() {
			return this.saldo;
			
		}
		
		public void setSaldo(double saldo) {
			
			this.saldo = saldo;
		}
}

