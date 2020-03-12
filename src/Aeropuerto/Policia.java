package Aeropuerto;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import Persona.Mercancia;
import Persona.Persona;

public class Policia {
	Persona per;
	String ubicArres="/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/arrestados.txt";
	Mercancia merca;
	String ubicmerca="/home/juan-rios/eclipse-workspace/Aeropuerto/archivosTexto/mercanciaDecomisada.txt";
	public void arrestar(String person) {
	
		try { 
			
			FileInputStream fileIN=new FileInputStream(person);
			ObjectInputStream in= new ObjectInputStream(fileIN);
			per=(Persona)in.readObject();
			try {
				BufferedWriter write=new BufferedWriter(new FileWriter(ubicArres,true));
				 write.append(per.getDocumento()+"\t");
				 write.append(per.getNombre()+"\t");
				 write.append(per.getEdad()+"\n");
				 write.append("------------------------"+"\n");
				 write.close();
			
			
			}catch(IOException e1) {
				System.out.println("E:"+e1.getMessage());}
			in.close();
			fileIN.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public void mercanciailegal(String mercanci) {
		
		try { 
			
			FileInputStream fileIN=new FileInputStream(mercanci);
			ObjectInputStream in= new ObjectInputStream(fileIN);
			merca=(Mercancia)in.readObject();
		try {
			BufferedWriter write=new BufferedWriter(new FileWriter(ubicmerca,true));
			write.append(merca.getLote()+"\n");
			write.append("------------------------"+"\n");
			write.close();
		
	       
	       
		}catch(IOException e1) {
			System.out.println("E1:"+e1.getMessage());}
		in.close();
		fileIN.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			}
}
		
}

