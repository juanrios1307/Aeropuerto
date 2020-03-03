
package Avion;

import Persona.Persona;

public abstract class Avion {
	
	private double capCarga,combustMin,combustMax;
	private String modelo;
	Persona piloto, copiloto;
	
	public Avion(double capCarga, double combustMin, double combustMax, String modelo, Persona piloto,
			Persona copiloto) {
		this.capCarga = capCarga;
		this.combustMin = combustMin;
		this.combustMax = combustMax;
		this.modelo = modelo;
		this.piloto = piloto;
		this.copiloto = copiloto;
	}

	public double getCapCarga() {
		return capCarga;
	}

	public void setCapCarga(double capCarga) {
		this.capCarga = capCarga;
	}

	public double getCombustMin() {
		return combustMin;
	}

	public void setCombustMin(double combustMin) {
		this.combustMin = combustMin;
	}

	public double getCombustMax() {
		return combustMax;
	}

	public void setCombustMax(double combustMax) {
		this.combustMax = combustMax;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Persona getPiloto() {
		return piloto;
	}

	public void setPiloto(Persona piloto) {
		this.piloto = piloto;
	}

	public Persona getCopiloto() {
		return copiloto;
	}

	public void setCopiloto(Persona copiloto) {
		this.copiloto = copiloto;
	}
	
	
	
	
}
