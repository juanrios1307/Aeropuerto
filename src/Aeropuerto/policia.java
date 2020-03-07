import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

public class polici {
persona per;
String ubicArres;
	public void arrestar(String person) {
	
		try { 
			
			FileInputStream fileIN=new FileInputStream(person);
			ObjectInputStream in= new ObjectInputStream(fileIN);
		per=(persona)in.ReadObject();
		try {
			BufferedWriter write=new BufferedWriter(new FileWriter(ubicArres,false));
			 write.append(per.getdocumento()+"\n");
			 write.append(per.getnombre()+"\n");
			 write.append(per.getedad()+"\n");
			 write.append("------------------------"+"\n");
			write.close();}
		catch(IOException e1) {
			System.out.println(e1.getMessage());}
		in.close();
		fileIN.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		}
		
	}

