package ar.com.unpaz.model;

public class Contacto {

	// TODO Auto-generated method stub
	private String fechaDeNacimiento;
	private String Nombre;
	private int CodigoPostal;
	private int Documento;
	private String Email;
	
	
public void setFechaDeNacimiento(String fecha) {
	this.fechaDeNacimiento = fecha;
}
public void setNombre (String nombre) {
	this.Nombre = nombre;
}
public void setCodigoPostal(int CodigoPost) {
	this.CodigoPostal = CodigoPost;
		
}
public void setDocumento(int doc) {this.Documento = doc;}
public void setEmail(String mail) {this.Email = mail;}

//ahora los get

public String getFechaDeNacimiento () {return this.fechaDeNacimiento;}
public String getNombre(){return this.Nombre;}
public int getCodigoPostal(){return this.CodigoPostal;}
public int getDocumento(){return this.Documento;}
public String getEmail() {return this.Email;}



}
