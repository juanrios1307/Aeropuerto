package Aeropuerto;

import java.util.Date;
import Avion.Avion;

public class Vuelo {
	
	private int codAeroptSalida,codAeroptLlegada;
	Date horaSalida, horaLlegada;
	Avion avion;
	private String estado;
	private final String estados[]={"En pista","Próximo a aterrizar","En sala","Próximo a despegar","Retrasado","Cancelado"};
	
	public Vuelo(int codAeroptSalida, int codAeroptLlegada,int estado, Date horaSalida, Date horaLlegada, Avion avion) {
		this.codAeroptSalida = codAeroptSalida;
		this.codAeroptLlegada = codAeroptLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.avion = avion;
		this.estado = estados[estado];
	}

	public int getCodAeroptSalida() {
		return codAeroptSalida;
	}

	public void setCodAeroptSalida(int codAeroptSalida) {
		this.codAeroptSalida = codAeroptSalida;
	}

	public int getCodAeroptLlegada() {
		return codAeroptLlegada;
	}

	public void setCodAeroptLlegada(int codAeroptLlegada) {
		this.codAeroptLlegada = codAeroptLlegada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String[] getEstados() {
		return estados;
	}
	
	
	
	
	
}
