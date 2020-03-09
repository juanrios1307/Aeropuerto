package Aeropuerto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
						if (documento.equals(vueloLlegada[n].getTiquetes()[i].getPersona().getDocumento())) {
							try {
							 BufferedWriter bw = new BufferedWriter(new FileWriter("", false));
							 FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Decol\\Desktop\\persona1.ser");
							 ObjectOutputStream out = new ObjectOutputStream(fileOut);
							 out.writeObject(vueloLlegada[n].getTiquetes()[i].getPersona());
							 out.close();
							 fileOut.close();
							 } catch (IOException e) {
							 System.out.println(e.getMessage());
							 }
						}
					}
				 } 
				 catch (IOException e) {
					e.printStackTrace();
				 }
			}
		}
	}
}

