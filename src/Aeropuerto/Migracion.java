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

	public boolean revisarPasajerosVuelo() {
		int cont=0;
		if (vuelo!=null) {
			for(int i=0;i<vuelo.getTiquetes().length;i++) {
				try {
					BufferedReader br = new BufferedReader(new FileReader("/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/ipool.txt"));
					String documento ;
					while ((documento = br.readLine()) != null) {
						if (documento.equals(vuelo.getTiquetes()[i].getPersona().getDocumento())) {
							try {
								String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/delincuente.ser";
								BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
								FileOutputStream fileOut = new FileOutputStream(dir);
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								out.writeObject(vuelo.getTiquetes()[i].getPersona());
							 	Policia policia = new Policia();
							 	policia.arrestar(dir);
							 	return true;
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
		return false;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public boolean revisarMaletas() {
		int cont=0;
		if (vuelo!=null) {
			for(int i=0;i<vuelo.getTiquetes().length;i++) {
				
				for(int j=1;j<=vuelo.getTiquetes()[i].getPersona().getMaletas().length;j++) {
					
					for(int k=1;k<=vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias().length;k++) {
					
						try {
							BufferedReader br = new BufferedReader(new FileReader("/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.txt"));
							String lote;
							while ((lote = br.readLine()) != null) {
								if (lote.equals(vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k])) {
									try {
										String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.ser";
										BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
										FileOutputStream fileOut = new FileOutputStream(dir);
										ObjectOutputStream out = new ObjectOutputStream(fileOut);
										Policia policia = new Policia();
										policia.mercanciailegal(dir);
										return true;
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
		return false;
	}	
	
	public boolean revisarMercancia() {
		int cont=0;
		for(int i=0;i<vuelo.getMercancia().length;i++) {
		
			try {
				BufferedReader br = new BufferedReader(new FileReader("/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.txt"));
				String lote;
				while ((lote = br.readLine()) != null) {
					if (lote.equals(vuelo.getMercancia()[i])) {
						try {
							String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.ser";
							BufferedWriter bw = new BufferedWriter(new FileWriter(dir, false));
							FileOutputStream fileOut = new FileOutputStream(dir);
							ObjectOutputStream out = new ObjectOutputStream(fileOut);
							Policia policia = new Policia();
							policia.mercanciailegal(dir);
							return true;
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
		return false;
	}

}

