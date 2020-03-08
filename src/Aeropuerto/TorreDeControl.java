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
	
	public String estadoVuelo() {
		final String estados[]={"En pista","Proximo a aterrizar","En sala","Proximo a despegar","Retrasado","Cancelado"};
		if(vuelo!=null) {
			if(vuelo.isPlanDeVuelo()&&vuelo.isMetar()&&mecanico.validacion()) {
				if(notam) {
					return estados[0];
				}
				return estados[3];
			}
				return estados[2];
		}
		return estados[5];
	}
   
}
