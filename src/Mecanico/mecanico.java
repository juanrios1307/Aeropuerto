package Mecanico;
	
	import java.time.Period;
import java.util.Date;

import Persona.Persona;
	
public class mecanico {
	
	Persona persona;
	private int licenciaMecanico;
	
	
	public boolean aceite(boolean aceite) {
		return aceite;
	}
	
	public double pesoCombustible(double consumo, Date horaSalida, Date horaLlegada) {
		Period p = new Period(horaSalida, horaLlegada);
		long hours= p.getHours();
		return 0;
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
