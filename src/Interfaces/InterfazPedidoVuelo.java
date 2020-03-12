package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Vuelo;

public class InterfazPedidoVuelo extends JFrame{

	public InterfazPedidoVuelo(Aeropuerto a) {
		this.setSize(500, 350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes(a);
	}
	
	public void iniciarComponentes(Aeropuerto air) {
		
		
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Ingrese Vuelo");
		etiqueta.setBounds(85, 10, 300, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		JTextField vuelo = new JTextField();
		vuelo.setBounds(85,60, 300, 30);
		vuelo.setFont(new Font("arial",Font.ITALIC,15));
		vuelo.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(vuelo);
		
		JButton menu=new JButton();
		menu.setText("Confirmar");
		menu.setBounds(110, 110, 250, 30);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				Vuelo v=air.buscarVueloLlegada(vuelo.getText());
				Vuelo v1=air.buscarVueloSalida(vuelo.getText());
				
				
				Date horaActual=new Date();

				JOptionPane.showMessageDialog(null, horaActual.getTime());
				
				if(v!=null) {
					if(horaActual.getTime() <= v.getHoraLlegada().getTime() && horaActual.getTime() >= v.getHoraLlegada().getTime()-3) {
						InterfazTorreControl i1=new InterfazTorreControl(air.buscarVueloLlegada(vuelo.getText()),false,air);
						i1.setVisible(true);
						setVisible(false);
					}else {
						InterfazAdminAero i1=new InterfazAdminAero(air,v);
						i1.setVisible(true);
						setVisible(false);
					}
				}else if(v1!=null){
					if(horaActual.getTime() <= v1.getHoraSalida().getTime() && horaActual.getTime() >= v1.getHoraSalida().getTime()-3){
						InterfazMecanico i1=new InterfazMecanico(air.buscarVueloSalida(vuelo.getText()),air);
						i1.setVisible(true);
						setVisible(false);
					}else {
						InterfazAdminAero i1=new InterfazAdminAero(air,v1);
						i1.setVisible(true);
						setVisible(false);
					}
						
				}else {
					JOptionPane.showMessageDialog(null, "Vuelo no enontrado");
				}
			}
			
		});
		
		JButton aero=new JButton();
		aero.setText("Aeropuerto");
		aero.setBounds(110, 170, 250, 30);
		aero.setHorizontalAlignment(SwingConstants.CENTER);
		aero.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(aero);
		aero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazAeropuerto i1=new InterfazAeropuerto(air);
				i1.setVisible(true);
				setVisible(false);
			}
			
		});
		
		JButton admin=new JButton();
		admin.setText("Administar");
		admin.setBounds(110, 230, 250, 30);
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(admin);
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazAddVuelo i1=new InterfazAddVuelo(air);
				i1.setVisible(true);
				setVisible(false);
			}
			
		});

	}
	
}
