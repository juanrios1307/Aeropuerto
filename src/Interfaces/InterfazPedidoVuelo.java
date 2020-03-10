package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Aeropuerto.Aeropuerto;

public class InterfazPedidoVuelo extends JFrame{

	public InterfazPedidoVuelo(Aeropuerto a) {
		this.setSize(500, 270);
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
				if(air.buscarVueloLlegada(vuelo.getText())!=null) {
					
					InterfazTorreControl i1=new InterfazTorreControl(air.buscarVueloLlegada(vuelo.getText()));
					i1.setVisible(true);
					setVisible(false);
				}else if(air.buscarVueloSalida(vuelo.getText())!=null){
					InterfazMecanico i1=new InterfazMecanico(air.buscarVueloSalida(vuelo.getText()));
					i1.setVisible(true);
					setVisible(false);
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


	}
	
}
