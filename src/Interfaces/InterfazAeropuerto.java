package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Aeropuerto.Aeropuerto;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Scrollable;
import javax.swing.SwingConstants;

import Aeropuerto.Vuelo;
import excepcion.ENoFecha;

public class InterfazAeropuerto extends JFrame{
	
	public InterfazAeropuerto(Aeropuerto a) {
		this.setSize(745, 590);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		String [] nombresColumnas  = {"Tiempo","Aerolinea","Vuelo","Destino","Observaciones"};
		Object [][] datosVuelo=new Object[a.getVueloSalida().length][nombresColumnas.length];
		
		String [] nc = {"Tiempo","Aerolinea","Vuelo","Origen","Observaciones"};
		Object [][] dv=new Object[a.getVueloSalida().length][nombresColumnas.length];
		datosVuelo=crearTablaVuelosSalida(a,datosVuelo);
		dv=crearTablaVuelosLlegada(a, dv);
		
		iniciarComponentes(a,datosVuelo,nombresColumnas,dv,nc);
	}
	
	public Object[][] crearTablaVuelosSalida(Aeropuerto a,Object[][] datosVuelo) {
		
		for(int i=0;i<(a.getVueloSalida()).length;i++) {
				try {
					datosVuelo[i][0]=a.getVueloSalida()[i].getHoraSalida();
				} catch (ENoFecha e) {
					
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				datosVuelo[i][1]=a.getVueloSalida()[i].getAvion().getAerolinea();
				datosVuelo[i][2]=a.getVueloSalida()[i].getVuelo();
				datosVuelo[i][3]=a.getVueloSalida()[i].getCodAeroptLlegada();
				datosVuelo[i][4]=a.getVueloSalida()[i].getEstado();			
		}		
		return datosVuelo;
		}
	
	public Object[][] crearTablaVuelosLlegada(Aeropuerto a,Object[][] datosVuelo) {
		
		for(int i=0;i<(a.getVueloSalida()).length;i++) {
				try {
					datosVuelo[i][0]=a.getVueloLlegada()[i].getHoraLlegada();
				} catch (ENoFecha e) {
					
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				datosVuelo[i][1]=a.getVueloLlegada()[i].getAvion().getAerolinea();
				datosVuelo[i][2]=a.getVueloLlegada()[i].getVuelo();
				datosVuelo[i][3]=a.getVueloLlegada()[i].getCodAeroptSalida();
				datosVuelo[i][4]=a.getVueloLlegada()[i].getEstado();			
		}
		
		return datosVuelo;
		}
	
	public void iniciarComponentes(Aeropuerto a,Object[][] datosVuelo,String[] nombresColumnas,Object[][] datosVuelo1,String[] nombresColumnas1) {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Aeropuerto");
		etiqueta.setBounds(0, 10, 745, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,25));
		panel.add(etiqueta);
		
		JLabel salida=new JLabel();
		salida.setText("Arrivals / Llegadas");
		salida.setBounds(0, 60, 745, 20);
		salida.setHorizontalAlignment(SwingConstants.CENTER);
		salida.setFont(new Font("arial",Font.ITALIC,15));
		panel.add(salida);
		
		JTable estadosVuelo=new JTable(datosVuelo,nombresColumnas);
		estadosVuelo.setBounds(45, 300, 645, 190);
		panel.add(estadosVuelo);
		
		JLabel llegadas=new JLabel();
		llegadas.setText("Departures / Salidas");
		llegadas.setBounds(0, 270, 745, 20);
		llegadas.setHorizontalAlignment(SwingConstants.CENTER);
		llegadas.setFont(new Font("arial",Font.ITALIC,15));
		panel.add(llegadas);
		
		JTable estadosVuelo1=new JTable(datosVuelo1,nombresColumnas1);
		estadosVuelo1.setBounds(45, 90, 645, 190);
		panel.add(estadosVuelo1);
		
		JButton menu=new JButton();
		menu.setText("Regresar");
		menu.setBounds(245, 490, 250, 30);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazPedidoVuelo i1=new InterfazPedidoVuelo(a);
				i1.setVisible(true);
				setVisible(false);
				dispose();
			}
			
		});
			
		}

}
