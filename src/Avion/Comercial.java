package Avion;

import Persona.Persona;

public class Comercial extends Avion{

	private int numPasajeros;

	public Comercial(double capCarga, double combustMin, double combustMax, String modelo, Persona piloto,
			Persona copiloto, int numPasajeros) {
		super(capCarga, combustMin, combustMax, modelo, piloto, copiloto);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	

}
