package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Vuelo;

public class InterfazMigracion extends JFrame{
	
	public InterfazMigracion(Vuelo v,Aeropuerto a) {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes(v,a);
	}
	
	public void iniciarComponentes(Vuelo v,Aeropuerto a) {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Migracion");
		etiqueta.setBounds(85, 10, 300, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		JButton menu=new JButton();
		menu.setText("Regresar");
		menu.setBounds(110, 300, 250, 30);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazTorreControl i1=new InterfazTorreControl(v,true,a);
				i1.setVisible(true);
				setVisible(false);
			}
			
		});

	}

}
