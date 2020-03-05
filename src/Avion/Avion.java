
package Avion;

import Persona.Persona;

public abstract class Avion {
	
	private double capCarga,combustMax,consumo;
	private String modelo;
	Persona piloto, copiloto;
	
	public Avion(double capCarga, double combustMax,double consumo, String modelo, Persona piloto,
			Persona copiloto) {
		this.capCarga = capCarga;
		this.combustMax = combustMax;
		this.modelo = modelo;
		this.piloto = piloto;
		this.copiloto = copiloto;
		this.consumo = consumo;
	}

	public double getCapCarga() {
		return capCarga;
	}

	public void setCapCarga(double capCarga) {
		this.capCarga = capCarga;
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
