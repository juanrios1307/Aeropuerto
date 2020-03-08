package Avion;

public class Carga extends Avion{

	public Carga(double capCarga, double combustMax, double consumo, int horasVuelo, String modelo, String aerolinea,
			boolean planVuelo, boolean metar, boolean notam, boolean pesoBalance, boolean brujula, boolean altimetro,
			boolean extintores, boolean equipoOxigeno, boolean equipoEmergencia, double nivAceite) {
		super(capCarga, combustMax, consumo, horasVuelo, modelo, aerolinea, planVuelo, metar, notam, pesoBalance, brujula,
				altimetro, extintores, equipoOxigeno, equipoEmergencia, nivAceite/*,Mercancia mercancias[]*/);
		//this.mercancias=mercancias;
	}
	
	

}
