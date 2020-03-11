package Aeropuerto;

import java.util.Arrays;
import java.util.Date;
import Avion.Avion;
import Persona.Mercancia;
import Persona.Piloto;
import tiquetes.Tiquete;

public class Vuelo {
	
	private final String estados[]={"En pista","Proximo a aterrizar","En sala","Proximo a despegar","Retrasado","Cancelado"};
	
	
	private int codAeroptSalida,codAeroptLlegada;
	private Date horaSalida, horaLlegada;
	private Avion avion;
	private Piloto piloto,copiloto;
	private String estado;
	private boolean planDeVuelo,metar,notam;
	private Tiquete tiquetes[];
	private Mercancia mercancia[];
	private String vuelo;
	
	public Vuelo(String vuelo,int codAeroptSalida, int codAeroptLlegada,int estado, Date horaSalida, Date horaLlegada, Avion avion,Piloto piloto, Piloto copiloto) {
		this.vuelo=vuelo;
		this.codAeroptSalida = codAeroptSalida;
		this.codAeroptLlegada = codAeroptLlegada;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.piloto=piloto;
		this.copiloto=copiloto;
		this.avion = avion;
		this.estado = estados[estado];
		this.tiquetes=new Tiquete[0];
		this.mercancia=new Mercancia[0];
	}
	
	
	public String getVuelo() {
		return vuelo;
	}

	public void addTiquete(Tiquete t) {
		tiquetes=Arrays.copyOf(tiquetes, tiquetes.length+1);
		
		tiquetes[tiquetes.length-1]=t;
	}
	
	public void addMercancia(Mercancia m) {
		mercancia=Arrays.copyOf(mercancia, mercancia.length+1);
		
		mercancia[mercancia.length-1]=m;
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
	
	public Piloto getCopiloto() {
		return copiloto;
	}
	
	public void setCopiloto(Piloto copiloto) {
		this.copiloto = copiloto;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public boolean isNotam() {
		return notam;
	}

	public void setNotam(boolean notam) {
		this.notam = notam;
	}

	public boolean isMetar() {
		return metar;
	}

	public void setMetar(boolean metar) {
		this.metar = metar;
	}

	public boolean isPlanDeVuelo() {
		return planDeVuelo;
	}

	public void setPlanDeVuelo(boolean planDeVuelo) {
		this.planDeVuelo = planDeVuelo;
	}

	public Tiquete[] getTiquetes() {
		return tiquetes;
	}
}