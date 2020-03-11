package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Aeropuerto.Aeropuerto;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import Aeropuerto.Vuelo;

public class InterfazAeropuerto extends JFrame{
	
	public InterfazAeropuerto(Aeropuerto a) {
		this.setSize(500, 600);
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
	/*private Object [][] datosVuelo= {
			{"15:45","Avianca","AV45150","Cali","En sala"},
			{"17:45","Viva Air","AV45153","Bogota","A tiempo"},
			{"10:45","Spirit","AV45152","Miami","En pista"}
			};
	*/
	public Object[][] crearTablaVuelosSalida(Aeropuerto a,Object[][] datosVuelo) {
		for(int i=0;i<(a.getVueloSalida()).length;i++) {
				datosVuelo[i][0]=a.getVueloSalida()[i].getHoraSalida();
				datosVuelo[i][1]=a.getVueloSalida()[i].getAvion().getAerolinea();
				datosVuelo[i][2]=a.getVueloSalida()[i].getVuelo();
				datosVuelo[i][3]=a.getVueloSalida()[i].getCodAeroptLlegada();
				datosVuelo[i][4]=a.getVueloSalida()[i].getEstado();			
		}
		
		return datosVuelo;
		}
	
	public Object[][] crearTablaVuelosLlegada(Aeropuerto a,Object[][] datosVuelo) {
		for(int i=0;i<(a.getVueloSalida()).length;i++) {
				datosVuelo[i][0]=a.getVueloLlegada()[i].getHoraLlegada();
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
		etiqueta.setBounds(85, 10, 300, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		
		JTable estadosVuelo=new JTable(datosVuelo,nombresColumnas);
		estadosVuelo.setBounds(45, 300, 400, 220);
		estadosVuelo.setName("Departures/Salidas");
		panel.add(estadosVuelo);
		
		JTable estadosVuelo1=new JTable(datosVuelo1,nombresColumnas1);
		estadosVuelo1.setBounds(45, 60, 400, 220);
		estadosVuelo1.setName("Departures/Salidas");
		panel.add(estadosVuelo1);
		
		JButton menu=new JButton();
		menu.setText("Regresar");
		menu.setBounds(120, 520, 250, 30);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazPedidoVuelo i1=new InterfazPedidoVuelo(a);
				i1.setVisible(true);
				setVisible(false);
			}
			
		});
			
		}

}
