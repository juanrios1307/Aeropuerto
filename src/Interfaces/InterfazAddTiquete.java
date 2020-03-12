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

import com.toedter.calendar.JDateChooser;

import Aeropuerto.Aeropuerto;
import Aeropuerto.Vuelo;
import Persona.Persona;
import tiquetes.Tiquete;

public class InterfazAddTiquete extends JFrame {
public JPanel panel;
	
	public InterfazAddTiquete (Aeropuerto a,Vuelo v) {
		this.setSize(820, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Sistema Aeroportuario");
		this.setLocationRelativeTo(null);
		this.getContentPane().setBackground(Color.gray);
		
		
		iniciarComponentes(a,v);
	}

	
	public void iniciarComponentes(Aeropuerto a,Vuelo v) {
		
		colocarPaneles(a);
		colocarEtiquetas(a);
		addTxtAndButton(a,v);
		
	}
	Tiquete t=new Tiquete();
	
	private void colocarPaneles(Aeropuerto a) {
		panel=new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}
	
	
	private void colocarEtiquetas(Aeropuerto a) {
		
		JLabel etiqueta=new JLabel();
		etiqueta.setText("Agregar tiquete");
		etiqueta.setBounds(200, 5, 300, 60);
		etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
		etiqueta.setFont(new Font("arial",Font.ITALIC,25));
		panel.add(etiqueta);
		
		
		
		
		JLabel etiqueta2=new JLabel();
		etiqueta2.setText("Fecha compra: ");
		etiqueta2.setBounds(50, 80, 160, 30);
		etiqueta2.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta2);
		
		JLabel etiqueta3=new JLabel();
		etiqueta3.setText("Numero silla: ");
		etiqueta3.setBounds(50, 130, 160, 30);
		etiqueta3.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta3);
		
		JLabel etiqueta4=new JLabel();
		etiqueta4.setText("Fila asiento: ");
		etiqueta4.setBounds(420, 80, 160, 30);
		etiqueta4.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta4);
		
		JLabel etiqueta5=new JLabel();
		etiqueta5.setText("Grupo abordaje: ");
		etiqueta5.setBounds(420, 130, 300, 30);
		etiqueta5.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta5);
		
		JLabel etiqueta6=new JLabel();
		etiqueta6.setText("Codigo reserva: ");
		etiqueta6.setBounds(50, 180, 300, 30);
		etiqueta6.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta6);
		
		JLabel etiqueta7=new JLabel();
		etiqueta7.setText("Hora en sala: ");
		etiqueta7.setBounds(420, 180, 300, 30);
		etiqueta7.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta7);
		
		JLabel etiqueta8=new JLabel();
		etiqueta8.setText("Clase: ");
		etiqueta8.setBounds(420, 230, 300, 30);
		etiqueta8.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta8);
		
		JLabel etiqueta9=new JLabel();
		etiqueta9.setText("Peso permitido: ");
		etiqueta9.setBounds(50, 230, 300, 30);
		etiqueta9.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta9);
		
		JLabel etiqueta10=new JLabel();
		etiqueta10.setText("Documento: ");
		etiqueta10.setBounds(50, 270, 300, 30);
		etiqueta10.setFont(new Font("arial",Font.BOLD,20));
		panel.add(etiqueta10);
		
	}
	
	private void addTxtAndButton(Aeropuerto a,Vuelo v) {
		
		JDateChooser fechaCompra=new JDateChooser();
		fechaCompra.setBounds(230, 80, 160, 30);
		panel.add(fechaCompra);
		
		JTextField numSilla=new JTextField();
		numSilla.setBounds(230, 130, 160, 30);
		panel.add(numSilla);
		
		
		JTextField filaAsiento=new JTextField();
		filaAsiento.setBounds(600, 80, 160, 30);
		panel.add(filaAsiento);
		
		JTextField grupoAbordaje=new JTextField();
		grupoAbordaje.setBounds(600, 130, 160, 30);
		panel.add(grupoAbordaje);
		
		JTextField codigoReserva=new JTextField();
		codigoReserva.setBounds(230, 180, 160, 30);
		panel.add(codigoReserva);
		
		JTextField horaSala=new JTextField();
		horaSala.setBounds(600, 180, 160, 30);
		panel.add(horaSala);
		
		JTextField clase=new JTextField();
		clase.setBounds(600, 230, 160, 30);
		panel.add(clase);
		
		JTextField equipajePermitido=new JTextField();
		equipajePermitido.setBounds(230, 230, 160, 30);
		panel.add(equipajePermitido);
		

		JTextField documento=new JTextField();
		documento.setBounds(230, 270, 160, 30);
		panel.add(documento);
		
		
		JButton btnMain = new JButton();
		btnMain.setBounds(425, 290, 200,40);
		btnMain.setText("Cancelar y cerrar");
		btnMain.setEnabled(true);
		btnMain.setFont(new Font("arial",3,15));
		btnMain.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		panel.add(btnMain);
	
		JButton btnGuardar = new JButton();
		btnGuardar.setBounds(195, 290, 200,40);
		btnGuardar.setText("Confirmar");
		btnGuardar.setEnabled(true);
		btnGuardar.setFont(new Font("arial",3,20));
		btnGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				t.setNumSilla(Integer.parseInt(numSilla.getText()));
				t.setFilaAsiento(filaAsiento.getText().charAt(0));
				t.setGrupoAbordaje(Integer.parseInt(grupoAbordaje.getText()));
				t.setCodigoReserva(codigoReserva.getText());
				
				t.setClase(clase.getText());
				t.setPesoEquipajePermitido(Double.parseDouble(equipajePermitido.getText()));
				t.setDocumento(documento.getText());
				
				v.addTiquete(t);
				
				JOptionPane.showMessageDialog(null, "Tiquete creado correctamente");
				
				int k=JOptionPane.showConfirmDialog(null, "¿Desea agregar mas tiquetes ?");
				
				if(k==0) {
					numSilla.setText("");
					filaAsiento.setText("");
					grupoAbordaje.setText("");
					codigoReserva.setText("");
					clase.setText("");
					equipajePermitido.setText("");
					documento.setText("");
				}else {
					InterfazPedidoVuelo i1=new InterfazPedidoVuelo(a);
					i1.setVisible(true);
					setVisible(false);
				}
			
					
			}
		});
		panel.add(btnGuardar);
	}
	
	
}
