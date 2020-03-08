package Avion;


public class Comercial extends Avion{

	private int numPasajeros;

	public Comercial(double capCarga, double combustMax, double consumo, int horasVuelo, String modelo,
			String aerolinea, boolean planVuelo, boolean metar, boolean notam, boolean pesoBalance, boolean brujula,
			boolean altimetro, boolean extintores, boolean equipoOxigeno, boolean equipoEmergencia, double nivAceite,
			int numPasajeros) {
		super(capCarga, combustMax, consumo, horasVuelo, modelo, aerolinea, planVuelo, metar, notam, pesoBalance,
				brujula, altimetro, extintores, equipoOxigeno, equipoEmergencia, nivAceite);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}




	

}
