package tiquetes;

import java.util.Date;

public class Tiquete {
	
	private Date fechaCompra;
	private String asiento;
	private int grupoAbordaje;
	private String codigoReserva;
	private Date horaEnSala;
	private String clase;
	private double pesoEquipajePermitido;
	
	//private Vuelo vuelo;
	//private Persona persona;
	
	public Tiquete(Date fechaCompra, String asiento, int grupoAbordaje, String codigoReserva, Date horaEnSala,String clase/*,Vuelo vuelo, Persona persona*/) {
		super();
		this.fechaCompra = fechaCompra;
		this.asiento = asiento;
		this.grupoAbordaje = grupoAbordaje;
		this.codigoReserva = codigoReserva;
		this.horaEnSala = horaEnSala;
		this.clase=clase;
		/*this.vuelo = vuelo;
		this.persona = persona;*/
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public String getAsiento() {
		return asiento;
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
