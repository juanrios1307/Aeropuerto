package Aeropuerto;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import Persona.Persona;

public class Policia {
Persona per;
String ubicArres;
	public void arrestar(String person) {
	
		try { 
			
			FileInputStream fileIN=new FileInputStream(person);
			ObjectInputStream in= new ObjectInputStream(fileIN);
			per=(Persona)in.readObject();
			try {
				BufferedWriter write=new BufferedWriter(new FileWriter(ubicArres,true));
				 write.append(per.getDocumento()+"\n");
				 write.append(per.getNombre()+"\n");
				 write.append(per.getEdad()+"\n");
				 write.append("------------------------"+"\n");
				write.close();}
			catch(IOException e1) {
				System.out.println(e1.getMessage());}
			in.close();
			fileIN.close();
			}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

