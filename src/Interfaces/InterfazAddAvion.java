package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Vuelo;
import Avion.Avion;
import jdk.nashorn.internal.scripts.JO;


public class InterfazAddAvion extends JFrame {
	
	public JPanel panel;
	
	public InterfazAddAvion(Aeropuerto a,Vuelo v,boolean b) {
		this.setSize(500, 270);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		
		iniciarComponentes(a,v,b);
	}

	
	public void iniciarComponentes(Aeropuerto a,Vuelo v,boolean b) {
		
		colocarPaneles(a);
		colocarEtiquetas(a);
		addTxtAndButton(a,v,b);
		
	}
	
	Avion avion=new Avion();
	
	private void colocarPaneles(Aeropuerto a) {
		panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	
	
	private void colocarEtiquetas(Aeropuerto a) {
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Agregar avion");
		etiqueta.setBounds(150, 5, 200, 60);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,35));
		panel.add(etiqueta);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Matricula: ");
		etiqueta2.setBounds(50, 80, 300, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Aerolinea: ");
		etiqueta3.setBounds(50, 130, 300, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("Modelo: ");
		etiqueta4.setBounds(50, 180, 300, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Horas de vuelo: ");
		etiqueta5.setBounds(50, 80, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
		
		JLabel etiqueta6=new JLabel();
		etiqueta6.setText("Consumo: ");
		etiqueta6.setBounds(50, 130, 300, 30);
		etiqueta6.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta6);
		
		JLabel etiqueta7=new JLabel();
		etiqueta7.setText("Combustible maximo: ");
		etiqueta7.setBounds(50, 180, 300, 30);
		etiqueta7.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta7);
		
		JLabel etiqueta8=new JLabel();
		etiqueta8.setText("Capacidad carga: ");
		etiqueta8.setBounds(50, 130, 300, 30);
		etiqueta8.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta8);
		
		JLabel etiqueta9=new JLabel();
		etiqueta9.setText("Nivel aceite: ");
		etiqueta9.setBounds(50, 180, 300, 30);
		etiqueta9.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta9);
		
	}
	
	private void addTxtAndButton(Aeropuerto a,Vuelo v,boolean b) {
		
		JTextField matricula=new JTextField();
		matricula.setBounds(270, 130, 170, 30);
		panel.add(matricula);
		
		JTextField aerolinea=new JTextField();
		aerolinea.setBounds(270, 180, 170, 30);
		panel.add(aerolinea);
		
		
		JTextField modelo=new JTextField();
		modelo.setBounds(270, 130, 170, 30);
		panel.add(modelo);
		
		JTextField horasVuelo=new JTextField();
		horasVuelo.setBounds(270, 180, 170, 30);
		panel.add(horasVuelo);
		
		JTextField consumo=new JTextField();
		consumo.setBounds(270, 130, 170, 30);
		panel.add(consumo);
		
		JTextField combustibleMaximo=new JTextField();
		combustibleMaximo.setBounds(270, 180, 170, 30);
		panel.add(combustibleMaximo);
		
		JTextField capCarga=new JTextField();
		capCarga.setBounds(270, 130, 170, 30);
		panel.add(capCarga);
		
		JTextField nivAceite=new JTextField();
		nivAceite.setBounds(270, 180, 170, 30);
		panel.add(nivAceite);
		
		
		
		JButton btnMain = new JButton();
		btnMain.setBounds(260, 280, 200,40);
		btnMain.setText("Cancelar y cerrar");
		btnMain.setEnabled(true);
		btnMain.setFont(new Font("arial",3,20));
		btnMain.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		panel.add(btnMain);
	
		JButton btnGuardar = new JButton();
		btnGuardar.setBounds(30, 280, 200,40);
		btnGuardar.setText("Confirmar");
		btnGuardar.setEnabled(true);
		btnGuardar.setFont(new Font("arial",3,20));
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				avion.setMatricula((matricula.getText()));
				avion.setAerolinea((aerolinea.getText()));
				avion.setModelo((modelo.getText()));
				
				avion.setHorasVuelo(Integer.parseInt(horasVuelo.getText()));
				
				avion.setConsumo(Double.parseDouble(consumo.getText()));
				avion.setCombustMax(Double.parseDouble(combustibleMaximo.getText()));
				avion.setCapCarga(Double.parseDouble(capCarga.getText()));
				avion.setNivAceite(Double.parseDouble(nivAceite.getText()));
				
				a.addAvion(avion);
				
				if(v.getPiloto()!=null) {
					
					a.addVuelo(v,b);
					JOptionPane.showMessageDialog(null, "Vuelo y avion creados correctamente");
					InterfazAeropuerto i1=new InterfazAeropuerto(a);
					i1.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Piloto no creado, por favor crearlo");
					InterfazAddPiloto i1=new InterfazAddPiloto(a,v,b);
					i1.setVisible(true);
					setVisible(false);
				}
					
				
				
				
				
				
				
			}
		});
		panel.add(btnGuardar);
	}
	
	
	
}
