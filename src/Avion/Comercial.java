package Avion;


public class Comercial extends Avion{

	private int numPasajeros;



	public Comercial(double capCarga, double combustMax, double consumo, String modelo, String aerolinea,
			int horasVuelo, int numPasajeros) {
		super(capCarga, combustMax, consumo, modelo, aerolinea, horasVuelo);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	
	

}
