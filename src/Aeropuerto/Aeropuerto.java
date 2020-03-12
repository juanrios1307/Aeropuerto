package Aeropuerto;

import java.util.Arrays;

import Avion.Avion;
import 	Mecanico.Mecanico;
import Persona.Piloto;
import tiquetes.Tiquete;

public class Aeropuerto {
	
	public Aeropuerto(Vuelo[] vueloLlegada, Vuelo[] vueloSalida,Avion[] avion,Piloto[] p) {
		super();
		this.vueloLlegada = vueloLlegada;
		this.vueloSalida = vueloSalida;
		this.avion=avion;
		this.piloto=p;
	}

	public Aeropuerto() {
		super();
	}

	Vuelo[] vueloLlegada;
	Vuelo[] vueloSalida;
	Avion[] avion;
	Piloto[] piloto;
	int codigoEstadia;
	
	public void addVuelo(Vuelo v,boolean b) {
		if(b) {
			vueloSalida=Arrays.copyOf(vueloSalida, vueloSalida.length+1);
			
			vueloSalida[vueloSalida.length-1]=v;
		}else {
			vueloLlegada=Arrays.copyOf(vueloLlegada, vueloLlegada.length+1);
			
			vueloLlegada[vueloLlegada.length-1]=v;
		}
		
	}
	
	public void addAvion(Avion a) {	
			try {
				avion=Arrays.copyOf(avion, avion.length+1);
				avion[avion.length-1]=a;
			} catch (Exception e) {
				System.err.println("error"+e.getMessage());
				e.printStackTrace();
			}
			
	}
	
	public void addPiloto(Piloto p) {	
		piloto=Arrays.copyOf(piloto, piloto.length+1);
		piloto[piloto.length-1]=p;
	}

	public Piloto buscarPiloto(String cod) {
		
		for (int i = 0; i < piloto.length; i++) {
			if(cod.equals(piloto[i].getLicencia())) {
				return piloto[i];
			}
		}
		
		return null;
	}
	
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
	
	
	public Avion buscarAvion(String cod) {
		for (int i = 0; i < avion.length; i++) {
			if(cod.equals(avion[i].getMatricula())) {
				return avion[i];
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
