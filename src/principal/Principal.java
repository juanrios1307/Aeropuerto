package principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Interfaces.InterfazPedidoVuelo;
import Interfaces.MenuAeropuerto;



public class Principal {

	public static void main(String[] args) {
/*
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
*/
		InterfazPedidoVuelo menu=new InterfazPedidoVuelo();
		menu.setVisible(true);
//		 try {
//			 BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Decol\\Desktop\\prueba.txt", false));
//			 writer.append("sebas" + "\n");
//			 writer.append("montoya" + "\n");
//			 writer.close();
//		 } catch (IOException e1) {
//			 System.out.println(e1);
//		 }
/*		 try {
			 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Decol\\Desktop\\prueba.txt"));
			 String st;
			 String nombre = "";
			 int edad = 0;
			 st=br.readLine();
			 System.out.println(st);
			 st=br.readLine();
			 System.out.println(st);
		 }catch(Exception e) {
			 System.out.println(e);
		 */}
	}


