package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Migracion;
import Aeropuerto.Policia;
import Aeropuerto.Vuelo;
import Avion.Carga;
import Avion.Comercial;

public class InterfazMigracion extends JFrame{
	
	public InterfazMigracion(Vuelo v,Aeropuerto a) {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		iniciarComponentes(v,a);
	}
	
	public void iniciarComponentes(Vuelo v,Aeropuerto a) {
		Migracion migra=new Migracion(v);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Migracion");
		etiqueta.setBounds(85, 10, 300, 50);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(etiqueta);
		
		ImageIcon alerta =new ImageIcon("iconalert.png");
		
		if(migra.getVuelo().getTiquetes().length>0){
			
		
		JButton menu=new JButton();
		menu.setText("Continuar");
		menu.setBounds(110, 350, 250, 30);
		menu.setHorizontalAlignment(SwingConstants.CENTER);
		menu.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(menu);
		menu.setVisible(false);
		menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				InterfazTorreControl i1=new InterfazTorreControl(v,true,a);
				i1.setVisible(true);
				setVisible(false);
				
			}
			
		});
		
		JLabel alertai=new JLabel();
		alertai.setBounds(110, 120, 250,80);
		alertai.setIcon(new ImageIcon(alerta.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
		alertai.setText("Decomisar mercancias");
		alertai.setVisible(false);
		panel.add(alertai);
		
		JButton revisar=new JButton();
		revisar.setText("Revisar Mercancias Avion");
		revisar.setBounds(110, 80, 250, 30);
		revisar.setHorizontalAlignment(SwingConstants.CENTER);
		revisar.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(revisar);
		revisar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(migra.revisarMercancia()) {
					
					alertai.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "No se encontraron mercancias reportadas");
				}
			}
			
		});

		JLabel alerta2=new JLabel();
		alerta2.setBounds(110, 260, 250,80);
		alerta2.setIcon(new ImageIcon(alerta.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
		alerta2.setText("Arrestar Pasajeros");
		alerta2.setVisible(false);
		panel.add(alerta2);
		
		JButton revisar2=new JButton();
		revisar2.setText("Revisar pasajeros Avion");
		revisar2.setBounds(110, 220, 250, 30);
		revisar2.setHorizontalAlignment(SwingConstants.CENTER);
		revisar2.setFont(new Font("arial",Font.ITALIC,20));
		panel.add(revisar2);
		revisar2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(migra.revisarPasajerosVuelo()) {
					
					alerta2.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "No se encontraron personas reportadas");
				}
			}
			
		});
		
		}else {
			
			setSize(500,300);

			JButton menu=new JButton();
			menu.setText("Continuar");
			menu.setBounds(110, 210, 250, 30);
			menu.setHorizontalAlignment(SwingConstants.CENTER);
			menu.setFont(new Font("arial",Font.ITALIC,20));
			menu.setVisible(false);
			panel.add(menu);
			menu.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					InterfazTorreControl i1=new InterfazTorreControl(v,true,a);
					i1.setVisible(true);
					setVisible(false);
					
				}
				
			});
			
			JLabel alertai=new JLabel();
			alertai.setBounds(110, 120, 250,80);
			alertai.setIcon(new ImageIcon(alerta.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
			alertai.setText("Decomisar Mercancia");
			alertai.setVisible(false);
			panel.add(alertai);
			
			JButton revisar=new JButton();
			revisar.setText("Revisar Mercancias Avion");
			revisar.setBounds(110, 80, 250, 30);
			revisar.setHorizontalAlignment(SwingConstants.CENTER);
			revisar.setFont(new Font("arial",Font.ITALIC,20));
			panel.add(revisar);
			revisar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(migra.revisarMercancia()) {
						alertai.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "No se encontraron mercancias reportadas");
					}
					
				}
				
			});

		}
		
	}

}
