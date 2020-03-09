package Aeropuerto;

public class Migracion {
	
	public Migracion(Vuelo[] vueloSalida) {
		super();
		this.vueloSalida = vueloSalida;
	}

	public Migracion(Vuelo[] vueloLlegada, boolean confirmacion) {
		super();
		this.vueloLlegada = vueloLlegada;
	}

	Vuelo[] vueloLlegada;
	Vuelo[] vueloSalida;
	
	public void revisarPasajerosVuelo() {
		if (vueloLlegada!=null) {
			for(int i=1;i<=vueloLlegada.getTiquetes.length;i++) {
				
			}
		}
	}
}
