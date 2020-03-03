package tiquetes;

import java.util.Date;

public class Tiquete {
	
	protected Date fechaCompra;
	protected String asiento;
	protected int grupoAbordaje;
	protected String codigoReserva;
	protected Date horaEnSala;
	protected String clase;
	
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
	
	
	
	
}
