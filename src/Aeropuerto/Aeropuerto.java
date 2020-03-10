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
	
	public Vuelo buscarVueloSalida(String cod) {
		
		for (int i = 0; i < vueloSalida.length; i++) {
			if(cod.equals(vueloSalida[i].getVuelo())) {
				return vueloSalida[i];
			}
		}
		
		return null;
	}
	
	public Vuelo buscarVueloLlegada(String cod) {
		
		for (int i = 0; i < vueloLlegada.length; i++) {
			if(cod.equals(vueloLlegada[i].getVuelo())) {
				return vueloLlegada[i];
			}
				
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

	public Vuelo[] getVueloLlegada() {
		return vueloLlegada;
	}

	public void setVueloLlegada(Vuelo[] vueloLlegada) {
		this.vueloLlegada = vueloLlegada;
	}

	public Vuelo[] getVueloSalida() {
		return vueloSalida;
	}

	public void setVueloSalida(Vuelo[] vueloSalida) {
		this.vueloSalida = vueloSalida;
	}
	
	
}
