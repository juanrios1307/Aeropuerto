package Avion;

import Persona.Piloto;

public class Comercial extends Avion{

	private int numPasajeros;



	public Comercial(double capCarga, double combustMax, double consumo, String modelo, Piloto piloto, Piloto copiloto,
			String aerolinea, int horasVuelo, int numPasajeros) {
		super(capCarga, combustMax, consumo, modelo, piloto, copiloto, aerolinea, horasVuelo);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	

}
