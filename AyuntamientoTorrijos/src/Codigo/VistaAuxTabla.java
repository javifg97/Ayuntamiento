package Codigo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;

public class VistaAuxTabla extends JFrame {
	private ControladorWB controlador;
	private Modelo modelo;
	private Container contenedor;
	private JPanel contentPane;
	private JLabel lblJustificanteDePago;
	private JLabel lblEscritura;
	private JLabel lblModelo;
	private JLabel lblPlanos;
	private JLabel lblCd;
	private JLabel lblMemoria;
	private JLabel lblFotografia;
	private JTextField txtfRefCastral;
	private JTextField txtfLocal;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	public VistaAuxTabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 976 , 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de suelo");
		lblNewLabel.setBounds(10, 69, 125, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblReferenciaCatastral = new JLabel("Referencia catastral");
		lblReferenciaCatastral.setBounds(10, 99, 125, 14);
		contentPane.add(lblReferenciaCatastral);
		
		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 127, 125, 14);
		contentPane.add(lblLocal);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 155, 125, 14);
		contentPane.add(lblTipo);
		
		JLabel lblEmplazamiento = new JLabel("Emplazamiento");
		lblEmplazamiento.setBounds(10, 183, 125, 14);
		contentPane.add(lblEmplazamiento);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(10, 211, 125, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaSolicitud = new JLabel("Fecha Solicitud");
		lblFechaSolicitud.setBounds(10, 239, 125, 14);
		contentPane.add(lblFechaSolicitud);
		
		JLabel lblCuota = new JLabel("Cuota");
		lblCuota.setBounds(10, 267, 125, 14);
		contentPane.add(lblCuota);
		
		JLabel lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setBounds(677, 211, 63, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblCertificadoColegioOficial = new JLabel("Certificado colegio oficial");
		lblCertificadoColegioOficial.setBounds(677, 74, 165, 14);
		contentPane.add(lblCertificadoColegioOficial);
		
		JLabel lblCertificado = new JLabel("Certificado Modelo 1");
		lblCertificado.setBounds(677, 102, 165, 14);
		contentPane.add(lblCertificado);
		
		JLabel lblCertificadoModelo = new JLabel("Certificado Modelo 2");
		lblCertificadoModelo.setBounds(677, 130, 165, 14);
		contentPane.add(lblCertificadoModelo);
		
		JLabel lblLicenciaObra = new JLabel("Licencia obra");
		lblLicenciaObra.setBounds(677, 158, 165, 14);
		contentPane.add(lblLicenciaObra);
		
		JLabel lblOtrasAutorizaciones = new JLabel("Otras autorizaciones");
		lblOtrasAutorizaciones.setBounds(677, 186, 165, 14);
		contentPane.add(lblOtrasAutorizaciones);
		
		lblJustificanteDePago = new JLabel("Justificante de pago");
		lblJustificanteDePago.setBounds(345, 69, 122, 14);
		contentPane.add(lblJustificanteDePago);
		
		lblEscritura = new JLabel("Escritura");
		lblEscritura.setBounds(345, 99, 122, 14);
		contentPane.add(lblEscritura);
		
		lblModelo = new JLabel("Modelo 36");
		lblModelo.setBounds(345, 127, 122, 14);
		contentPane.add(lblModelo);
		
		lblPlanos = new JLabel("Planos");
		lblPlanos.setBounds(345, 155, 122, 14);
		contentPane.add(lblPlanos);
		
		lblCd = new JLabel("CD");
		lblCd.setBounds(345, 183, 122, 14);
		contentPane.add(lblCd);
		
		lblMemoria = new JLabel("Memoria");
		lblMemoria.setBounds(345, 211, 122, 14);
		contentPane.add(lblMemoria);
		
		lblFotografia = new JLabel("Fotografia");
		lblFotografia.setBounds(345, 239, 122, 14);
		contentPane.add(lblFotografia);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Urbano", "Rustico"}));
		comboBox.setBounds(155, 63, 92, 20);
		contentPane.add(comboBox);
		
		txtfRefCastral = new JTextField();
		txtfRefCastral.setBounds(155, 96, 92, 20);
		contentPane.add(txtfRefCastral);
		txtfRefCastral.setColumns(10);
		
		txtfLocal = new JTextField();
		txtfLocal.setColumns(10);
		txtfLocal.setBounds(155, 124, 92, 20);
		contentPane.add(txtfLocal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 152, 92, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 180, 92, 20);
		contentPane.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(155, 211, 115, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(155, 239, 115, 20);
		contentPane.add(dateChooser_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 264, 92, 20);
		contentPane.add(textField_2);
		
		JCheckBox chckbxEntregado = new JCheckBox("");
		chckbxEntregado.setBounds(880, 69, 23, 23);
		contentPane.add(chckbxEntregado);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(880, 97, 23, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(880, 125, 23, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(880, 153, 23, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(880, 181, 23, 23);
		contentPane.add(checkBox_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(750, 211, 193, 70);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(527, 69, 23, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(527, 97, 23, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(527, 125, 23, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(527, 153, 23, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(527, 181, 23, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(527, 211, 23, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		checkBox_10.setBounds(527, 239, 23, 23);
		contentPane.add(checkBox_10);
		
		JLabel lblNewLabel_1 = new JLabel("ACTIVIDAD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(31, 22, 124, 20);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(14, 309, 929, 2);
		contentPane.add(separator);
		
		JLabel label = new JLabel("Fotocopia DNI");
		label.setBounds(345, 267, 122, 14);
		contentPane.add(label);
		
		JCheckBox checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(527, 263, 23, 23);
		contentPane.add(checkBox_12);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(850, 495, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(728, 495, 89, 23);
		contentPane.add(btnAceptar);
		
		JPanel Interesado = new JPanel();
		Interesado.setBounds(10, 322, 443, 196);
		contentPane.add(Interesado);
		
		JLabel lblInteresado = new JLabel("INTERESADO");
		lblInteresado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		
		JLabel lblCodigoPostal = new JLabel("Codigo postal");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel lblTlfFijo = new JLabel("Tlf Fijo");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		
		JLabel lblCif = new JLabel("CIF");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblTlfMovil = new JLabel("Tlf Movil");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		
		JLabel lblFax = new JLabel("Fax");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		
		JLabel lblMunicipio = new JLabel("Municipio");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JCheckBox chckbxPersonaJuridica = new JCheckBox("Persona Juridica");
		GroupLayout gl_Interesado = new GroupLayout(Interesado);
		gl_Interesado.setHorizontalGroup(
			gl_Interesado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Interesado.createSequentialGroup()
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(145)
							.addComponent(lblInteresado, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addComponent(lblCodigoPostal, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addComponent(lblTlfFijo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addComponent(lblCif, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addComponent(lblTlfMovil, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addComponent(lblFax, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addComponent(lblMunicipio, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(72)
							.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING, false)
								.addComponent(chckbxPersonaJuridica, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_Interesado.createSequentialGroup()
									.addComponent(lblEmail, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_Interesado.setVerticalGroup(
			gl_Interesado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Interesado.createSequentialGroup()
					.addContainerGap()
					.addGap(11)
					.addComponent(lblInteresado, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(6)
							.addComponent(lblCodigoPostal))
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(4)
							.addComponent(lblApellidos))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTlfFijo))
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(4)
							.addComponent(lblCif))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTlfMovil))
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(4)
							.addComponent(lblDireccion))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(3)
							.addComponent(lblFax))
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(4)
							.addComponent(lblMunicipio))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(3)
							.addComponent(lblEmail))
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(chckbxPersonaJuridica, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Interesado.setLayout(gl_Interesado);
		
		JPanel Representante = new JPanel();
		Representante.setBounds(477, 322, 486, 170);
		contentPane.add(Representante);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setEnabled(false);
		
		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setEnabled(false);
		
		JLabel lblDocumentoIdentidad = new JLabel("Documento Identidad");
		lblDocumentoIdentidad.setEnabled(false);
		
		JLabel lblDireccion_1 = new JLabel("Direccion");
		lblDireccion_1.setEnabled(false);
		
		JLabel lblMunicipio_1 = new JLabel("Municipio");
		lblMunicipio_1.setEnabled(false);
		
		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		
		JLabel lblCodigoPostal_1 = new JLabel("Codigo Postal");
		lblCodigoPostal_1.setEnabled(false);
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		
		JLabel lblTlfFijo_1 = new JLabel("Tlf Fijo");
		lblTlfFijo_1.setEnabled(false);
		
		JLabel lblTlfMovil_1 = new JLabel("Tlf Movil");
		lblTlfMovil_1.setEnabled(false);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		
		JLabel lblFax_1 = new JLabel("Fax");
		lblFax_1.setEnabled(false);
		
		JLabel lblRepresentsnte = new JLabel("REPRESENTANTE");
		lblRepresentsnte.setEnabled(false);
		lblRepresentsnte.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_Representante = new GroupLayout(Representante);
		gl_Representante.setHorizontalGroup(
			gl_Representante.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Representante.createSequentialGroup()
					.addContainerGap(187, Short.MAX_VALUE)
					.addComponent(lblRepresentsnte, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addGap(146))
				.addGroup(gl_Representante.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblCodigoPostal_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addComponent(lblApellidos_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblTlfFijo_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addComponent(lblDocumentoIdentidad, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblTlfMovil_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addComponent(lblDireccion_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(lblFax_1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addComponent(lblMunicipio_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addGap(9)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_Representante.setVerticalGroup(
			gl_Representante.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Representante.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRepresentsnte, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(7)
							.addComponent(lblNombre))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(7)
							.addComponent(lblCodigoPostal_1))
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblApellidos_1))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblTlfFijo_1))
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblDocumentoIdentidad))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblTlfMovil_1))
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblDireccion_1))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(4)
							.addComponent(lblFax_1))
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(5)
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(3)
							.addComponent(lblMunicipio_1))
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7))
		);
		Representante.setLayout(gl_Representante);
		chckbxPersonaJuridica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                   if (chckbxPersonaJuridica.isSelected()) {
                          controlador.enableComponents(Representante, true);
                   } else {
                          controlador.enableComponents(Representante, false);
                   }

            }
     });
	}

	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void adirArr() {

	}
}
