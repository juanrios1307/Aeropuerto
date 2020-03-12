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
						if (documento.equals(vuelo.getTiquetes()[i].getDocumento())) {
							try {
								System.out.println("le doy dir");
								String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/delincuente.ser";
								FileOutputStream fileOut = new FileOutputStream(dir);
								System.out.println("abri outstr");
								ObjectOutputStream out = new ObjectOutputStream(fileOut);
								System.out.println("paso entre outstr y write object");
								out.writeObject(vuelo.getTiquetes()[i].getPersona());
								System.out.println("serialize persona");
								
								out.close();
								fileOut.close();
								System.out.println("cerre ser y carpeta");
							 	Policia policia = new Policia();
							 	policia.arrestar(dir);
							 	System.out.println("arreste a la persona");
							 	cont++;
							 	
							} catch (IOException e) {
								System.err.println("Lanza excepcion");
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
		if(cont>0) {
			return true;
		}else {
			return false;
		}
	}
	
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
								if (lote.equals(vuelo.getTiquetes()[i].getPersona().getMaletas()[j].getMercancias()[k].getLote())) {
									try {
										String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.ser";
										FileOutputStream fileOut = new FileOutputStream(dir);
										ObjectOutputStream out = new ObjectOutputStream(fileOut);
										
										out.writeObject(vuelo.getTiquetes()[i].getPersona());
										
										out.close();
										fileOut.close();
										
										Policia policia = new Policia();
										policia.mercanciailegal(dir);
										cont++;
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
		if(cont>0)
			return true;
		else
			return false;
	}	
	
	public boolean revisarMercancia() {
		int cont=0;
		for(int i=0;i<vuelo.getMercancia().length;i++) {
		
			try {
				BufferedReader br = new BufferedReader(new FileReader("/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.txt"));
				String lote;
				while ((lote = br.readLine()) != null) {
					if (lote.equals(vuelo.getMercancia()[i].getLote())) {
						try {
							String dir = "/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercancia.ser";
							FileOutputStream fileOut = new FileOutputStream(dir);
							ObjectOutputStream out = new ObjectOutputStream(fileOut);
							out.writeObject(vuelo.getMercancia()[i]);
							
							out.close();
							fileOut.close();
							
							Policia policia = new Policia();
							policia.mercanciailegal(dir);
							cont++;
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
		if(cont>0)
			return true;
		else
			return false;
	}

}

