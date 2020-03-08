package Mecanico;
	
	import Persona.Persona;
	import Aeropuerto.Vuelo;
	import Avion.Avion;
	
public class Mecanico {

	Persona persona;
	Vuelo vuelo;
	Avion avion;
	private boolean pesoBalance, brujula, altimetro, extintores, equipoOxigeno, equipoEmergencia;
	private double aceite;
	
	public Mecanico(boolean pesoBalance, boolean brujula, boolean altimetro, boolean extintores, boolean equipoOxigeno,
			boolean equipoEmergencia, double aceite) {
		this.pesoBalance = pesoBalance;
		this.brujula = brujula;
		this.altimetro = altimetro;
		this.extintores = extintores;
		this.equipoOxigeno = equipoOxigeno;
		this.equipoEmergencia = equipoEmergencia;
		this.aceite = aceite;
	}
	public Mecanico(Vuelo vuelo) {
		super();
		this.vuelo = vuelo;
	}
	

	public boolean validacion() {
		return (pesoBalance&&brujula&&altimetro&&extintores&&equipoOxigeno&&equipoEmergencia&&aceite(aceite)&&pesoAdecuado());
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

	public boolean pesoAdecuado() {
		if((pesoCombustible()<=avion.getCombustMax())&&(pesoCombustible()+1)<=(avion.getCapCarga()+avion.getCombustMax())) {
			return true;
		}
		return false;
	}
	
	public boolean isPesoBalance() {
		return pesoBalance;
	}
	public void setPesoBalance(boolean pesoBalance) {
		this.pesoBalance = pesoBalance;
	}
	public boolean isBrujula() {
		return brujula;
	}
	public void setBrujula(boolean brujula) {
		this.brujula = brujula;
	}
	public boolean isAltimetro() {
		return altimetro;
	}
	public void setAltimetro(boolean altimetro) {
		this.altimetro = altimetro;
	}
	public boolean isExtintores() {
		return extintores;
	}
	public void setExtintores(boolean extintores) {
		this.extintores = extintores;
	}
	public boolean isEquipoOxigeno() {
		return equipoOxigeno;
	}
	public void setEquipoOxigeno(boolean equipoOxigeno) {
		this.equipoOxigeno = equipoOxigeno;
	}
	public boolean isEquipoEmergencia() {
		return equipoEmergencia;
	}
	public void setEquipoEmergencia(boolean equipoEmergencia) {
		this.equipoEmergencia = equipoEmergencia;
	}
	public double getAceite() {
		return aceite;
	}
	public void setAceite(double aceite) {
		this.aceite = aceite;
	}
		
}
