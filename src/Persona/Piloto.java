package Persona;

public class Piloto extends Persona{

	private boolean licencia;
	public Piloto(String nombre, String documento, String nacionalidad, int edad,boolean enfermo,Maleta[] maletas, boolean licencia) {
	super(nombre,documento, nacionalidad, edad,enfermo, maletas);
	this.licencia=licencia;
	}
	public boolean isLicencia() {
		return licencia;
	}
	

}	

