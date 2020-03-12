package Aeropuerto;

import Persona.Persona;
import tiquetes.Tiquete;

public class Coronavirus {
	String direccion;
	Vuelo vuelo;
	Tiquete[] personas=vuelo.getTiquetes();
	
	
	
	public Coronavirus(Vuelo vuelo) {
		super();
		this.vuelo = vuelo;
	}

	public boolean buscarenfermo() {
		for (int i=0;i<personas.length;i++) {
			if( personas[i].getPersona().isEnfermo()) {
				return true; 
			}
		}
		return false;
	}
	
	public String getDireccion() {
		return direccion;
	}
    
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
		
}


