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

public class InterfazAdminAero extends JFrame{
	
	public InterfazAdminAero(Aeropuerto a) {
		this.setSize(400, 350);
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
		etiqueta.setText("Administrar Aeropuerto");
		etiqueta.setBounds(0, 10, 400, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		
		JButton menu=new JButton();
		menu.setText("Agregar Tiquetes");
		menu.setBounds(40, 80, 300, 50);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
			}});
		
		JButton aero=new JButton();
		aero.setText("Agregar Mercancia");
		aero.setBounds(40, 160, 300, 50);
		aero.setHorizontalAlignment(SwingConstants.CENTER);
		aero.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(aero);
		aero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			
			}
			
		});
		
		JButton admin=new JButton();
		admin.setText("Regresar");
		admin.setBounds(60, 250, 260, 30);
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(admin);
		admin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			InterfazPedidoVuelo i1=new InterfazPedidoVuelo(air);
			i1.setVisible(true);
			setVisible(false);
			}
			
		});

	}
}
