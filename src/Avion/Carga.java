package Avion;

import Persona.Mercancia;

public class Carga extends Avion{

	Mercancia mercancias[];

	public Carga(double capCarga, double combustMax, double consumo, int horasVuelo, String modelo, String aerolinea,
			double nivAceite, Mercancia[] mercancias) {
		super(capCarga, combustMax, consumo, horasVuelo, modelo, aerolinea, nivAceite);
		this.mercancias = mercancias;
	}
	
	

}
