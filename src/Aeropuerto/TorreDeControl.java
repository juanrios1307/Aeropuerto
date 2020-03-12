package Aeropuerto;

	import Persona.Persona;
	import Mecanico.Mecanico;

public class TorreDeControl {

	Persona controlador;
	Mecanico mecanico;
	Vuelo vuelo;
	
	private boolean notam,avionAproximando;
	private boolean planVuelo,metar;
	
	
	
	
	public TorreDeControl(Vuelo vuelo) {
		super();
		this.vuelo = vuelo;
	}

	public boolean isAvionAproximando() {
		return avionAproximando;
	}

	public void setAvionAproximando(boolean avionAproximando) {
		this.avionAproximando = avionAproximando;
	}

	public void setNotam(boolean notam) {
		this.notam = notam;
	}

	public void setPlanVuelo(boolean planVuelo) {
		this.planVuelo = planVuelo;
	}

	public void setMetar(boolean metar) {
		this.metar = metar;
	}

	public boolean isNotam() {
		return notam;
	}

	public boolean isPlanVuelo() {
		return planVuelo;
	}

	public boolean isMetar() {
		return metar;
	}

	public void asignarNotamVuelo(boolean notam) {
		vuelo.setNotam(notam);
	}
	
	public String estadoVuelo() {
		final String estados[]={"En pista","Proximo a aterrizar","En sala","Proximo a despegar","Retrasado","Cancelado"};
		if(vuelo!=null) {
			if(isPlanVuelo()&&isMetar()) {
				if(isNotam()) {
					return estados[0];
				}
				return estados[3];
			}
			return estados[2];
		}
		return estados[5];
	}
	
	public Vuelo estadoVueloLlegada(Vuelo vuelo) {
		if(avionAproximando) {
			return vuelo;
		}
		return null;
	}
   
}
