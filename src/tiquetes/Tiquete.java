package tiquetes;

import java.util.Date;

import Aeropuerto.Vuelo;
import Persona.Persona;

public class Tiquete {
	
	private Date fechaCompra;
	private int numSilla;
	private char filaAsiento;
	private int grupoAbordaje;
	private String codigoReserva;
	private Date horaEnSala;
	private String clase;
	private double pesoEquipajePermitido;
	private Vuelo vuelo;
	private Persona persona;

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public Tiquete(Date fechaCompra, int numSilla, char filaAsiento, int grupoAbordaje, String codigoReserva,
			Date horaEnSala, String clase, double pesoEquipajePermitido, Vuelo vuelo, Persona persona) {
		super();
		this.fechaCompra = fechaCompra;
		this.numSilla = numSilla;
		this.filaAsiento = filaAsiento;
		this.grupoAbordaje = grupoAbordaje;
		this.codigoReserva = codigoReserva;
		this.horaEnSala = horaEnSala;
		this.clase = clase;
		this.pesoEquipajePermitido = pesoEquipajePermitido;
		this.vuelo = vuelo;
		this.persona = persona;
	}
	
	
	public int getNumSilla() {
		return numSilla;
	}

	public char getFilaAsiento() {
		return filaAsiento;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Persona getPersona() {
		return persona;
	}

	public int getGrupoAbordaje() {
		return grupoAbordaje;
	}

	public String getCodigoReserva() {
		return codigoReserva;
	}

	public Date getHoraEnSala() {
		return horaEnSala;
	}

	public String getClase() {
		return clase;
	}

	public double getPesoEquipajePermitido() {
		return pesoEquipajePermitido;
	}
	
	
}
