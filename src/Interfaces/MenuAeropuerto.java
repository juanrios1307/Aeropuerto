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

public class MenuAeropuerto extends JFrame{

	public MenuAeropuerto() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Aeropuerto");
		etiqueta.setBounds(85, 10, 300, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		JButton torreControl=new JButton();
		torreControl.setText("Torre de control");
		torreControl.setBounds(110, 70, 250, 30);
		torreControl.setHorizontalAlignment(SwingConstants.CENTER);
		torreControl.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(torreControl);
		torreControl.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazTorreControl i1=new InterfazTorreControl();
				i1.setVisible(true);
				setVisible(false);
			}
			
		});
		
		JButton migracion=new JButton();
		migracion.setText("Migracion");
		migracion.setBounds(110, 120, 250, 30);
		migracion.setHorizontalAlignment(SwingConstants.CENTER);
		migracion.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(migracion);
		migracion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazMigracion i1=new InterfazMigracion();
				i1.setVisible(true);
				setVisible(false);
			}
			
		});
		
		JButton mecanico=new JButton();
		mecanico.setText("Mecanico");
		mecanico.setBounds(110, 170, 250, 30);
		mecanico.setHorizontalAlignment(SwingConstants.CENTER);
		mecanico.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(mecanico);
		mecanico.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazMecanico i1=new InterfazMecanico();
				i1.setVisible(true);
				setVisible(false);
			}
			
		});

		JButton aero=new JButton();
		aero.setText("Aeropuerto");
		aero.setBounds(110, 220, 250, 30);
		aero.setHorizontalAlignment(SwingConstants.CENTER);
		aero.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(aero);
		aero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazAeropuerto i1=new InterfazAeropuerto();
				i1.setVisible(true);
				setVisible(false);
			}
			
		});

		
	}
}