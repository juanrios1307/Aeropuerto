package Aeropuerto;

import java.util.Date;
import 	Mecanico.Mecanico;

public class Aeropuerto {
	
	public Aeropuerto(Vuelo vueloLlegada, Vuelo vueloSalida) {
		super();
		this.vueloLlegada = vueloLlegada;
		this.vueloSalida = vueloSalida;
	}

	Vuelo vueloLlegada, vueloSalida;
	
	public double impuestosAeropuertarios(Date tiempoAeropuerto) {
		long diferencia = vueloLlegada.getHoraLlegada().getTime() - vueloSalida.getHoraSalida().getTime();
		long hours = diferencia / (60 * 60 * 1000) % 24;
		return hours*2000000;
	}
	
	public double cobroGasolina() {
		Mecanico mecanico = new Mecanico(vueloSalida);
		return mecanico.pesoCombustible()*1620/0.804;
	}
	
}
