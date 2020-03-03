package Aeropuerto;

import java.util.Arrays;
import java.util.Date;
import Avion.Avion;
import tiquetes.Tiquete;

public class Vuelo {
	
	private final String estados[]={"En pista","Pr�ximo a aterrizar","En sala","Pr�ximo a despegar","Retrasado","Cancelado"};
	
	
	private int codAeroptSalida,codAeroptLlegada;
	private Date horaSalida, horaLlegada;
	private Avion avion;
	private String estado;
	private Tiquete tiquetes[];
	
	public Vuelo(int codAeroptSalida, int codAeroptLlegada,int estado, Date horaSalida, Date horaLlegada, Avion avion) {
		this.codAeroptSalida = codAeroptSalida;
		this.codAeroptLlegada = codAeroptLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.avion = avion;
		this.estado = estados[estado];
		this.tiquetes=new Tiquete[0];
	}
	
	public void addTiquete(Tiquete t) {
		tiquetes=Arrays.copyOf(tiquetes, tiquetes.length+1);
		
		tiquetes[tiquetes.length-1]=t;
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
