package Aeropuerto;

	import Persona.Persona;
	import Mecanico.Mecanico;

public class TorreDeControl {

	Persona controlador;
	Mecanico mecanico;
	Vuelo vuelo;
	
	private boolean notam;
	
	public void asignarNotamVuelo(boolean notam) {
		vuelo.setNotam(notam);
	}
	
	public boolean estadoVuelo() {
		
		if(vuelo.isMetar()&&vuelo.isPlanDeVuelo()&&notam&&mecanico.validacion()) {
			return true;
		}
		return true;
	}
}
