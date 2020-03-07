package Mecanico;
	
	import Persona.Persona;
	import Aeropuerto.Vuelo;
	import Avion.Avion;
	
public class Mecanico {

	public Mecanico() {
		super();
	}
	Persona persona;
	Vuelo vuelo;
	Avion avion;
	
	public boolean validacion() {
		return (aceite()&&pesoBalance());
	}
	
	public boolean aceite(double aceite) {
		if ((aceite<=avion.getNivAceite()*1.1)&&(aceite>=avion.getNivAceite()*0.9)) {
			return true;
		}
		return false;
	}
	
	public double pesoCombustible() {
		long diferencia = vuelo.getHoraLlegada().getTime() - vuelo.getHoraSalida().getTime();
		long hours = diferencia / (60 * 60 * 1000) % 24;
		return avion.getConsumo()*hours;
	}
	
	public boolean pesoBalance(boolean pesoBalance) {
		return pesoBalance;
	}
	public boolean brujula(boolean brujula) {
		return brujula;
	}
	public boolean altimetro(boolean altimetro) {
		return altimetro;
	}
	public boolean extintores(boolean extintores) {
		return extintores;
	}
	public boolean equipoOxigeno(boolean equipoOxigeno) {
		return equipoOxigeno;
	}
	public boolean equipoEmergencia(boolean equipoEmergencia) {
		return equipoEmergencia;
	}
	
	
	
	
	
}
