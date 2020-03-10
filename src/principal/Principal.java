package principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import Aeropuerto.*;
import Avion.*;
import Interfaces.*;
import Persona.*;
import tiquetes.*;
import Mecanico.*;




public class Principal {

	public static void main(String[] args) {
		
		Persona[] p=new Persona[15];
		Piloto[] pil=new Piloto[15];
		Mercancia[] m=new Mercancia[15],m2=new Mercancia[2];
		Maleta[] maleta=new Maleta[2];
		
		for (int i = 0; i < m2.length; i++) {
			m2[i]=new Mercancia(true, 5);
		}
		
		for (int i = 0; i < maleta.length; i++) {
			maleta[i]=new Maleta(m2, 10);
		}
		
		for (int i = 0; i < m.length; i++) {
			m[i]=new Mercancia(true, 10);
			p[i]=new Persona("Juan"+i, "14789"+(i-1), "Colombia", 20, false, maleta);
			pil[i]=new Piloto("Juan"+i, "14789"+(i-1), "Colombia", 20, false, maleta, true);
 		}
		
		Carga[] avCarga=new Carga[10];
		Comercial[] avComercial=new Comercial[10];
		for (int i = 0; i < avCarga.length; i++) {
			avCarga[i]=new Carga(100, 100, 10, 1, "av15", "Avianca",1, m);
			avComercial[i]=new Comercial(200, 100, 10, 4, "air34", "Viva",1, 100);
		}

		Vuelo[] vueloLlegada=new Vuelo[10];
		Vuelo[] vueloSalida=new Vuelo[10];
		
		Date horaSalida=new Date(),horaLlegada=new Date();
		
		Tiquete[] t=new Tiquete[10];
		
		for (int i = 0; i < t.length; i++) {
			t[i]=new Tiquete(horaLlegada, 6+i, 'A', 1, "4569", horaSalida, "turista", 50, vueloSalida[i], p[i]);
		}
		
		
		
		for (int i = 0; i < vueloSalida.length; i++) {
			vueloLlegada[i]=new Vuelo("AV3222"+i,1030+i*2, 2589, 0,horaSalida, horaLlegada, avCarga[i], pil[i], pil[i+1]);
			vueloSalida[i]=new Vuelo("AV4515"+i,4569+i*2, 8520+i, 2, horaSalida, horaLlegada, avComercial[i], pil[i], pil[i+1]);
		}
		for (int i = 0; i < vueloSalida.length; i++) {
			vueloSalida[i].addTiquete(t[i]);
		}
		Aeropuerto a=new Aeropuerto(vueloLlegada,vueloSalida);
		
		InterfazPedidoVuelo menu=new InterfazPedidoVuelo(a);
		menu.setVisible(true);
		
		
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


