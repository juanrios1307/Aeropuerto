package principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Principal {

	public static void main(String[] args) {

		try {
			persona p=new persona();
			p.setNombre("lolazo");
			p.setApellido("fdez");
			 FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Decol\\Desktop\\persona1.ser");
			 ObjectOutputStream out = new ObjectOutputStream(fileOut);
			 out.writeObject(p);
			 out.close();
			 fileOut.close();
			 } catch (IOException i) {
			 System.out.println(i.getMessage());
			 }
		try {
			persona p1 = new persona();
			FileInputStream fileIn = new FileInputStream("C:\\Users\\Decol\\Desktop\\persona1.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			p1 = (persona) in.readObject();
			System.out.println(p1.getNombre());
			System.out.println(p1.getApellido());
			in.close();
			fileIn.close();
			} catch (IOException e) {
			e.printStackTrace();
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			}
		}
	}


