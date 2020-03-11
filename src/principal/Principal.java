package principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Random;

import Aeropuerto.*;
import Avion.*;
import Interfaces.*;
import Persona.*;
import tiquetes.*;
import Mecanico.*;




public class Principal {
	
	public static Aeropuerto datosPrueba() {
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
			p[i]=new Persona("Juan"+i, "14789"+(i-1), "Colombia", (int)(Math.random()*100)+1, i%2==0?true:false, maleta);
			pil[i]=new Piloto("Juan"+i, "14789"+(i-1), "Colombia", (int)(Math.random()*100)+1, false, maleta, true);
 		}
		
		Carga[] avCarga=new Carga[10];
		Comercial[] avComercial=new Comercial[10];
		for (int i = 0; i < avCarga.length; i++) {
			avCarga[i]=new Carga(100, 100, 10, 1, "av15", "Avianca",1);
			avComercial[i]=new Comercial(200, 100, 10, 4, "air34", "Viva",1, 100);
		}

		Vuelo[] vueloLlegada=new Vuelo[10];
		Vuelo[] vueloSalida=new Vuelo[10];
		
		Date horaSalida=new Date(),horaLlegada=new Date();
		
		Tiquete[] t=new Tiquete[10];
		Mercancia[] merca=new Mercancia[10];
		
		for (int i = 0; i < t.length; i++) {
			merca[i]=new Mercancia("AS456", true, (int)(Math.random()*50));
			t[i]=new Tiquete(horaLlegada, 6+i, 'A', 1, "4569", horaSalida, "turista", 50, vueloSalida[i], p[i]);
		}
		
		
		for (int i = 0; i < vueloSalida.length; i++) {
			vueloLlegada[i]=new Vuelo("AV"+((int)(Math.random()*8999)+1000),(int)(Math.random()*8999)+1000, 2589, (int) (Math.random()*6),horaSalida, horaLlegada, avCarga[i], pil[i], pil[i+1]);
			vueloSalida[i]=new Vuelo("AV"+((int)(Math.random()*8999)+1000),((int)(Math.random()*8999)+1000), 8520+i,(int) (Math.random()*6), horaSalida, horaLlegada, avComercial[i], pil[i], pil[i+1]);
		}
		for (int i = 0; i < vueloSalida.length; i++) {	
			for (int j = 0; j < merca.length; j++) {
				vueloSalida[i].addTiquete(t[j]);
				vueloLlegada[i].addMercancia(merca[j]);
			}
		}
		
		Aeropuerto a=new Aeropuerto(vueloLlegada,vueloSalida);
		return a;
	}
	
	
	public static void main(String[] args) {
		Aeropuerto a=datosPrueba();
		
		InterfazPedidoVuelo menu=new InterfazPedidoVuelo(a);
		menu.setVisible(true);
		}
	}


