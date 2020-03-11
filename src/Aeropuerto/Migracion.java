package Aeropuerto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Migracion {
	
	public Migracion(Vuelo vueloSalida) {
		super();
		this.vueloSalida = vueloSalida;
	}

	public Migracion(Vuelo vueloLlegada, boolean confirmacion) {
		super();
		this.vueloLlegada = vueloLlegada;
	}

	Vuelo vueloLlegada;
	Vuelo vueloSalida;
	
	public void revisarPasajerosVuelo(int n) {
		if (vueloLlegada!=null) {
			for(int i=1;i<=vueloLlegada.getTiquetes().length;i++) {
				 try {
					BufferedReader br = new BufferedReader(new FileReader(""));
					String documento ;
					while ((documento = br.readLine()) != null) {
						if (documento.equals(vueloLlegada.getTiquetes()[i].getPersona().getDocumento())) {
							try {
								String dir = "";
								BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
								FileOutputStream fileOut = new FileOutputStream(dir);
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								out.writeObject(vueloLlegada.getTiquetes()[i].getPersona());
								out.close();
								fileOut.close();
							 	Policia policia = new Policia();
							 	policia.arrestar(dir);
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
	
	public void revisarMaletas(int n) {
		if (vueloLlegada!=null) {
			for(int i=1;i<=vueloLlegada.getTiquetes().length;i++) {
				
				for(int j=1;j<=vueloLlegada.getTiquetes()[i].getPersona().getMaletas().length;j++) {
					
					for(int k=1;k<=vueloLlegada.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias().length;k++) {
					
						 try {
								BufferedReader br = new BufferedReader(new FileReader(""));
								String lote;
								while ((lote = br.readLine()) != null) {
									if (lote.equals(vueloLlegada.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k])) {
										try {
											String dir = "";
											BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
											FileOutputStream fileOut = new FileOutputStream(dir);
											ObjectOutputStream out = new ObjectOutputStream(fileOut);
											out.writeObject(vueloLlegada.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k]);
											out.close();
											fileOut.close();
										 	Policia policia = new Policia();
										 	policia.mercanciailegal(dir);
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
		}	
	
	public String revisarMercancia(int n) {
		for(int i=1;i<=vueloLlegada.getMercancia().length;i++) {
			
			 try {
					BufferedReader br = new BufferedReader(new FileReader(""));
					String lote;
					while ((lote = br.readLine()) != null) {
						if (lote.equals(vueloLlegada.getMercancia()[i])) {
							try {
								String dir = "";
								BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
								FileOutputStream fileOut = new FileOutputStream(dir);
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								out.writeObject(vueloLlegada.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k]);
								out.close();
								fileOut.close();
							 	Policia policia = new Policia();
							 	policia.mercanciailegal(dir);
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

