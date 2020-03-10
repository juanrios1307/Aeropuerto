package Aeropuerto;

import 	Mecanico.Mecanico;

public class Aeropuerto {
	
	public Aeropuerto(Vuelo[] vueloLlegada, Vuelo[] vueloSalida) {
		super();
		this.vueloLlegada = vueloLlegada;
		this.vueloSalida = vueloSalida;
	}

	public Aeropuerto() {
		super();
	}

	Vuelo[] vueloLlegada;
	Vuelo[] vueloSalida;
	int codigoEstadia;
	
	public Vuelo buscarVuelo(int cod) {
		
		for (int i = 0; i < vueloLlegada.length; i++) {
			if(cod==vueloLlegada[i].getCodAeroptLlegada())
				return vueloLlegada[i];
		}
		
		for (int i = 0; i < vueloSalida.length; i++) {
			if(cod==vueloSalida[i].getCodAeroptLlegada())
				return vueloSalida[i];
		}
		
		return null;
	}
	
	public double impuestosAeropuertuarios() {
		long diferencia = vueloLlegada[getCodigoEstadia()].getHoraLlegada().getTime() - vueloSalida[getCodigoEstadia()].getHoraSalida().getTime();
		long hours = diferencia / (60 * 60 * 1000) % 24;
		return hours*2000000;
	}
	
	public double cobroGasolina() {
		Mecanico mecanico = new Mecanico(vueloSalida[getCodigoEstadia()]);
		return mecanico.pesoCombustible()*1620/0.804;
	}

	public int getCodigoEstadia() {
		return codigoEstadia;
	}
	public void setCodigoEstadia(int codigoEstadia) {
		this.codigoEstadia = codigoEstadia;
	}
	
}
