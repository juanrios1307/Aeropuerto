package Aeropuerto;

public class salud {
Coronavirus corona=new Coronavirus();
Vuelo vuelo;
boolean o=corona.buscarenfermo();
public String salud() {
	if(o) {
		return "ALERTA avión en cuarentena, posible contagio masivo ";
	}
	else { return " acceso común ningún pasajero contagiado";
				
		
	}

		
	}
	
	
	
}

