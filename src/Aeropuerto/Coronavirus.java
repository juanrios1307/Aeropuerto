package Aeropuerto;

import Persona.Persona;
import tiquetes.Tiquete;

public class Coronavirus {
	String direcci�n;
	Vuelo Vuelo;
	Tiquete[] personas=Vuelo.getTiquetes();
  public boolean buscarenfermo() {
		for (int i=0;i<personas.length;i++) {
		 if( personas[i].getPersona().isEnfermo()) {
			 return true; }}
		return false;
			  }
public String getDirecci�n() {
	return direcci�n;
}
public void setDirecci�n(String direcci�n) {
	this.direcci�n = direcci�n;
}
		
		
		
		
	}


