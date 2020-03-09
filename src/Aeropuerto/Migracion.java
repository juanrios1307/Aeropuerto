package Aeropuerto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	
	public void revisarPasajerosVuelo(int n) {
		if (vueloLlegada!=null) {
			for(int i=1;i<=vueloLlegada[n].getTiquetes().length;i++) {
				 try {
					BufferedReader br = new BufferedReader(new FileReader(""));
					String documento;
					while ((documento = br.readLine()) != null) {
						
					}
				
				 } 
				 catch (IOException e) {
					e.printStackTrace();
				 }
			}
		}
	}
}

