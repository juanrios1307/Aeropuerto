package Aeropuerto;

public class Salud {
Coronavirus corona=new Coronavirus();
Vuelo vuelo;
boolean o=corona.buscarenfermo();
public String salud() {
	if(o) {
		return "ALERTA avi�n en cuarentena, posible contagio masivo ";
	}
	else { return " acceso com�n ning�n pasajero contagiado";
				
		
	}

		
	}
	
	
	
}

