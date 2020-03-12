package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.*;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Vuelo;


public class InterfazAddVuelo extends JFrame {
	
	public JPanel panel;
	
	public InterfazAddVuelo(Aeropuerto a) {
		this.setSize(500, 270);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		
		iniciarComponentes(a);
	}

	
	public void iniciarComponentes(Aeropuerto a) {
		
		colocarPaneles(a);
		colocarEtiquetas(a);
		addTxtAndButton(a);
		
	}
	
	Vuelo v=new Vuelo();
	
	private void colocarPaneles(Aeropuerto a) {
		panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	
	
	private void colocarEtiquetas(Aeropuerto a) {
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Agregar vuelo");
		etiqueta.setBounds(150, 5, 200, 60);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,35));
		panel.add(etiqueta);
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Codigo salida: ");
		etiqueta2.setBounds(50, 80, 300, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Codigo llegada: ");
		etiqueta3.setBounds(50, 130, 300, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("Fecha salida: ");
		etiqueta4.setBounds(50, 180, 300, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Fecha llegada: ");
		etiqueta5.setBounds(50, 80, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
		
		JLabel etiqueta6=new JLabel();
		etiqueta6.setText("Matricula avion: ");
		etiqueta6.setBounds(50, 130, 300, 30);
		etiqueta6.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta6);
		
		JLabel etiqueta7=new JLabel();
		etiqueta7.setText("Licencia piloto: ");
		etiqueta7.setBounds(50, 180, 300, 30);
		etiqueta7.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta7);
		
		JLabel etiqueta8=new JLabel();
		etiqueta8.setText("Licencia copiloto: ");
		etiqueta8.setBounds(50, 130, 300, 30);
		etiqueta8.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta8);
		
		JLabel etiqueta9=new JLabel();
		etiqueta9.setText("Numero de vuelo: ");
		etiqueta9.setBounds(50, 180, 300, 30);
		etiqueta9.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta9);
		
	}
	
	private void addTxtAndButton(Aeropuerto a) {
		
		JTextField codSalida=new JTextField();
		codSalida.setBounds(270, 130, 170, 30);
		panel.add(codSalida);
		
		JTextField codLlegada=new JTextField();
		codLlegada.setBounds(270, 180, 170, 30);
		panel.add(codLlegada);
		
		
	/*	JTextField horaSalida=new JTextField();
		txtCedula.setBounds(270, 130, 170, 30);
		panel.add(txtCedula);
		
		JTextField horaLlegada=new JTextField();
		txtCodigoLibro.setBounds(270, 180, 170, 30);
		panel.add(txtCodigoLibro);*/
		
		JTextField matriculaAvion=new JTextField();
		matriculaAvion.setBounds(270, 130, 170, 30);
		panel.add(matriculaAvion);
		
		JTextField licenciaPiloto=new JTextField();
		licenciaPiloto.setBounds(270, 180, 170, 30);
		panel.add(licenciaPiloto);
		
		JTextField licenciaCopiloto=new JTextField();
		licenciaCopiloto.setBounds(270, 130, 170, 30);
		panel.add(licenciaCopiloto);
		
		JTextField numeroVuelo=new JTextField();
		numeroVuelo.setBounds(270, 180, 170, 30);
		panel.add(numeroVuelo);
		
		
		
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
				
				
				v.setCodAeroptSalida(Integer.parseInt(codSalida.getText()));
				v.setCodAeroptLlegada(Integer.parseInt(codLlegada.getText()));
				v.setAvion(a.buscarAvion(matriculaAvion.getText()));
				
				v.setPiloto(a.buscarPiloto(licenciaPiloto.getText()));
				v.setCopiloto(a.buscarPiloto(licenciaPiloto.getText()));
				v.setVuelo(numeroVuelo.getText());
				
				Date d=new Date();
				
				
				
				Boolean bool;
				if(codSalida.getText().equals("4256")) {
					bool=true;
				}else {
					bool=false;
				}
				
				
				if(v.getAvion()!=null && v.getPiloto()!=null && v.getCopiloto()!=null) {
					a.addVuelo(v, bool);
					JOptionPane.showMessageDialog(null, "Vuelo añadido correctamente");
				}else if(v.getAvion()==null){
					JOptionPane.showMessageDialog(null, "Avion no creado, por favor crearlo");
					InterfazAddAvion i1=new InterfazAddAvion(a,v,bool);
					i1.setVisible(true);
					setVisible(false);
				}else if(v.getPiloto()==null || v.getCopiloto()==null) {
					JOptionPane.showMessageDialog(null, "Piloto no creado, por favor creelo para utilizar el aeropuerto");
					InterfazAddPiloto i1=new InterfazAddPiloto(a,v,bool);
					i1.setVisible(true);
					setVisible(false);
				}
					
			}
		});
		panel.add(btnGuardar);
	}
	
	
	
}
