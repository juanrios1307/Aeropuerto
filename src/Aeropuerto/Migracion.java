package Aeropuerto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Migracion {
	
	public Migracion(Vuelo vuelo) {
		super();
		this.vuelo = vuelo;
	}

	public Migracion() {
	}

	Vuelo vuelo;
	
	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public void revisarPasajerosVuelo() {
		if (vuelo!=null) {
			for(int i=1;i<=vuelo.getTiquetes().length;i++) {
				 try {
					BufferedReader br = new BufferedReader(new FileReader(""));
					String documento ;
					while ((documento = br.readLine()) != null) {
						if (documento.equals(vuelo.getTiquetes()[i].getPersona().getDocumento())) {
							try {
								String dir = "";
								BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
								FileOutputStream fileOut = new FileOutputStream(dir);
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								out.writeObject(vuelo.getTiquetes()[i].getPersona());
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
	
	public void revisarMaletas() {
		if (vuelo!=null) {
			for(int i=1;i<=vuelo.getTiquetes().length;i++) {
				
				for(int j=1;j<=vuelo.getTiquetes()[i].getPersona().getMaletas().length;j++) {
					
					for(int k=1;k<=vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias().length;k++) {
					
						 try {
								BufferedReader br = new BufferedReader(new FileReader(""));
								String lote;
								while ((lote = br.readLine()) != null) {
									if (lote.equals(vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k])) {
										try {
											String dir = "";
											BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
											FileOutputStream fileOut = new FileOutputStream(dir);
											ObjectOutputStream out = new ObjectOutputStream(fileOut);
											out.writeObject(vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k]);
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
	
	public String revisarMercancia() {
		for(int i=1;i<=vuelo.getMercancia().length;i++) {
			
			 try {
					BufferedReader br = new BufferedReader(new FileReader(""));
					String lote;
					while ((lote = br.readLine()) != null) {
						if (lote.equals(vuelo.getMercancia()[i])) {
							try {
								String dir = "";
								BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
								FileOutputStream fileOut = new FileOutputStream(dir);
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								out.writeObject(vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k]);
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

