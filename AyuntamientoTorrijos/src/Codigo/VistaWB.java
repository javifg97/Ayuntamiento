package Codigo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import com.toedter.calendar.JDateChooser;

import javafx.scene.control.TableColumn;

import com.toedter.calendar.JCalendar;
import java.awt.SystemColor;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.Label;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ListSelectionModel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class VistaWB extends JFrame implements Vista {
	private ModeloWB modelo;
	private ControladorWB controlador;
	private ModeloBBDD modelo2;

	private Container contenedor;
	private JPanel contentPane;
	private JPanel ArrVistas[];
	private JTextField txtfRazonSocialBusquedaPJ;
	private JTextField NIFBusquedaPJ;
	private JTextField txtfActBusqueda;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_15;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField txtfLocal;
	private JTextField txtfTipo;
	private JTextField txtfCuota;
	private JTextField txtfReferenciaCatastral;
	private JTextField txtfEmplazamiento;

	private JTable table;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JDateChooser FechaInicialActBusqueda;
	private JDateChooser FechaFinalActBusqueda;
	private JButton btnConfiguracion;

	public void setControlador(Controlador controlador) {

		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {
		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloWB) modelo;
	}

	public void setModelo2(Modelo modelo2) {
		this.modelo2 = (ModeloBBDD) modelo2;
	}

	public void adirArr() {
		controlador.setPanels(ArrVistas);
	}

	/**
	 * Create the frame.
	 */
	public VistaWB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaWB.class.getResource("/Codigo/logo50x50.png")));
		setResizable(false);
		this.ArrVistas = new JPanel[3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnVisualizarLicencias = new JButton("Visualizar Licencias");

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		JPanel panel_4 = new JPanel();

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");

		tabbedPane.setVisible(false);
		
				JPanel panel_3 = new JPanel();
				tabbedPane.addTab("Personas", null, panel_3, null);//BUSCAR PERSONA
				
						JLabel lblRazonSocial = new JLabel("Nombre:");
						
								txtfRazonSocialBusquedaPJ = new JTextField();
								txtfRazonSocialBusquedaPJ.setColumns(10);
								
										JLabel label = new JLabel("NIF/NIE:");
										
												NIFBusquedaPJ = new JTextField();
												NIFBusquedaPJ.setColumns(10);
												
														JButton BuscarPJ = new JButton("Buscar");
														
																JButton btnRefreshPers = new JButton("Actualizar");
																btnRefreshPers.setVisible(false);
																btnRefreshPers.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent arg0) {
																		controlador.refrescar();
																	}
																});
																btnRefreshPers.addMouseListener(new MouseAdapter() {
																	@Override
																	public void mouseClicked(MouseEvent arg0) {

																	}
																});
														GroupLayout gl_panel_3 = new GroupLayout(panel_3);
														gl_panel_3.setHorizontalGroup(
															gl_panel_3.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_3.createSequentialGroup()
																	.addContainerGap()
																	.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblRazonSocial, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
																		.addComponent(label, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtfRazonSocialBusquedaPJ)
																		.addComponent(NIFBusquedaPJ, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
																		.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
																			.addComponent(btnRefreshPers)
																			.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
																			.addComponent(BuscarPJ, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
																	.addContainerGap())
														);
														gl_panel_3.setVerticalGroup(
															gl_panel_3.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel_3.createSequentialGroup()
																	.addGap(7)
																	.addComponent(lblRazonSocial, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
																	.addGap(2)
																	.addComponent(txtfRazonSocialBusquedaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(NIFBusquedaPJ, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
																		.addComponent(BuscarPJ)
																		.addComponent(btnRefreshPers))
																	.addContainerGap(90, Short.MAX_VALUE))
														);
														panel_3.setLayout(gl_panel_3);
														
																BuscarPJ.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		controlador.busquedaPersonaJur();
																	}
																});

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Actividades", null, panel_1, null);//bUSCAR ACTIVIDADES

		JButton btnBuscarLicencia = new JButton("Buscar");
		btnBuscarLicencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controlador.busquedaActividad();
			}
		});

		JLabel lblTipo = new JLabel("Tipo");

		FechaInicialActBusqueda = new JDateChooser();

		JLabel lblDesdeActBusqueda = new JLabel("Fecha Solicitud:");

		JLabel lblHastaActBusqueda = new JLabel("Fecha Inicio:");

		txtfActBusqueda = new JTextField();
		txtfActBusqueda.setColumns(10);
		
		JButton btnRefreshActv = new JButton("Actualizar");
		btnRefreshActv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.refrescar();
			}
		});
		
		FechaFinalActBusqueda = new JDateChooser();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtfActBusqueda, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblDesdeActBusqueda, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(lblHastaActBusqueda)))
							.addGap(10))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(FechaFinalActBusqueda, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
							.addComponent(FechaInicialActBusqueda, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnRefreshActv)
							.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
							.addComponent(btnBuscarLicencia)
							.addContainerGap())))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addComponent(lblTipo)
					.addGap(6)
					.addComponent(txtfActBusqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDesdeActBusqueda)
						.addComponent(lblHastaActBusqueda))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(FechaInicialActBusqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FechaFinalActBusqueda, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBuscarLicencia)
						.addComponent(btnRefreshActv))
					.addContainerGap(58, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ventanaConfiguracion();
			}
		});
		btnConfiguracion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(panel_4, 0, 0, Short.MAX_VALUE))
							.addComponent(btnVisualizarLicencias, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
						.addComponent(btnConfiguracion))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 665, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 628, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(33)
									.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(btnVisualizarLicencias, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(271)
							.addComponent(btnConfiguracion)))
					.addContainerGap())
		);
		panel_4.setLayout(new CardLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5, "name_30359970588412");

		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon(VistaWB.class.getResource("/Codigo/logo.png")));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
					.addGap(73))
		);
		panel_5.setLayout(gl_panel_5);
		panel_5.setVisible(true);

		JLabel lblRutaDeAcceso = new JLabel("");
		lblRutaDeAcceso.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutaDeAcceso.setText("Visualizar licencias");

		JPanel Contenedor = new JPanel();

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addComponent(lblRutaDeAcceso, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(Contenedor, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addComponent(lblRutaDeAcceso, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Contenedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		Contenedor.setLayout(new CardLayout(0, 0));

		JPanel inscActvPers = new JPanel();
		inscActvPers.setBackground(SystemColor.menu);
		Contenedor.add(inscActvPers, "name_25046820143722");
		inscActvPers.setVisible(false);
		ArrVistas[1] = inscActvPers;

		JButton btnAceptarInsPers = new JButton("Aceptar");

		JButton btnCancelarInsPers = new JButton("Cancelar");


		
		JPanel Interesado = new JPanel();
		
				JLabel lblInteresado = new JLabel("Interesado");
				lblInteresado.setFont(new Font("Tahoma", Font.BOLD, 14));
		
				JLabel lblNombre_1 = new JLabel("Nombre");
		
				textField = new JTextField();
				textField.setColumns(10);
		
				JLabel lblApellidos_1 = new JLabel("Apellidos");
		
				textField_1 = new JTextField();
				textField_1.setColumns(10);
		
				JLabel lblRazonSocial_1 = new JLabel("Razon social");
		
				textField_2 = new JTextField();
				textField_2.setColumns(10);
		
				JLabel lblCif = new JLabel("CIF");
		
				textField_3 = new JTextField();
				textField_3.setColumns(10);
		
				JLabel lblDireccion = new JLabel("Direccion");
		
				textField_4 = new JTextField();
				textField_4.setColumns(10);
		
				JLabel lblCodigoPostal = new JLabel("Codigo postal");
		
				textField_5 = new JTextField();
				textField_5.setColumns(10);
		
				JLabel lblEmailInteresado = new JLabel("Email interesado");
		
				textField_9 = new JTextField();
				textField_9.setColumns(10);
		
				JLabel lblFaxInteresado = new JLabel("Fax interesado");
		
				textField_18 = new JTextField();
				textField_18.setColumns(10);
		
				JLabel label_2 = new JLabel("Telefono movil");
		
				JLabel lblTelefonoFijo = new JLabel("Telefono fijo");
		
				textField_11 = new JTextField();
				textField_11.setColumns(10);
		
				textField_10 = new JTextField();
				textField_10.setColumns(10);
		
				JCheckBox checkRepresentante = new JCheckBox("Persona Jur\u00EDdica");
		GroupLayout gl_Interesado = new GroupLayout(Interesado);
		gl_Interesado.setHorizontalGroup(
			gl_Interesado.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Interesado.createSequentialGroup()
					.addContainerGap(118, Short.MAX_VALUE)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(48)
							.addComponent(lblInteresado))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblApellidos_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblRazonSocial_1, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCif, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblDireccion, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblCodigoPostal, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblEmailInteresado, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(lblFaxInteresado, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(lblTelefonoFijo, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Interesado.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
								.addComponent(checkRepresentante, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Interesado.createSequentialGroup()
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(8)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(58))
		);
		gl_Interesado.setVerticalGroup(
			gl_Interesado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Interesado.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInteresado, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNombre_1)
					.addGap(11)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblApellidos_1)
					.addGap(11)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblRazonSocial_1)
					.addGap(11)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblCif)
					.addGap(11)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblDireccion)
					.addGap(11)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblCodigoPostal)
					.addGap(11)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblEmailInteresado)
					.addGap(11)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblFaxInteresado)
					.addGap(7)
					.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(14)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(lblTelefonoFijo))
					.addGap(11)
					.addGroup(gl_Interesado.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(checkRepresentante)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		Interesado.setLayout(gl_Interesado);
		
		if (checkRepresentante.isSelected()) {

		}
		JPanel Representante = new JPanel();

		
		
				JLabel lblRepresentante = new JLabel("Representante");
				lblRepresentante.setEnabled(false);
				lblRepresentante.setFont(new Font("Tahoma", Font.BOLD, 14));
		
				JLabel label_10 = new JLabel("Nombre");
				label_10.setEnabled(false);
		
				textField_17 = new JTextField();
				textField_17.setEnabled(false);
				textField_17.setColumns(10);
		
				JLabel label_9 = new JLabel("Apellidos");
				label_9.setEnabled(false);
		
				textField_16 = new JTextField();
				textField_16.setEnabled(false);
				textField_16.setColumns(10);
		
				JLabel lblDocumentoDeIdentidad = new JLabel("Documento de identidad");
				lblDocumentoDeIdentidad.setEnabled(false);
		
				textField_14 = new JTextField();
				textField_14.setEnabled(false);
				textField_14.setColumns(10);
		
				JLabel label_5 = new JLabel("Direccion");
				label_5.setEnabled(false);
		
				textField_13 = new JTextField();
				textField_13.setEnabled(false);
				textField_13.setColumns(10);
		
				JLabel lblMunicipio = new JLabel("Municipio");
				lblMunicipio.setEnabled(false);
		
				textField_8 = new JTextField();
				textField_8.setEnabled(false);
				textField_8.setColumns(10);
		
				JLabel label_4 = new JLabel("Codigo postal");
				label_4.setEnabled(false);
		
				textField_12 = new JTextField();
				textField_12.setEnabled(false);
				textField_12.setColumns(10);
		
				JLabel lblEmailRepresentante = new JLabel("Email representante");
				lblEmailRepresentante.setEnabled(false);
		
				textField_15 = new JTextField();
				textField_15.setEnabled(false);
				textField_15.setColumns(10);
		
				JLabel lblFaxRepresentante = new JLabel("Fax representante");
				lblFaxRepresentante.setEnabled(false);
		
				textField_19 = new JTextField();
				textField_19.setEnabled(false);
				textField_19.setColumns(10);
		
				JLabel lblTelefonoMovil = new JLabel("Telefono movil");
				lblTelefonoMovil.setEnabled(false);
		
				textField_6 = new JTextField();
				textField_6.setEnabled(false);
				textField_6.setColumns(10);
		
				textField_7 = new JTextField();
				textField_7.setEnabled(false);
				textField_7.setColumns(10);
		
				JLabel label_3 = new JLabel("Telefono fijo");
				label_3.setEnabled(false);
		GroupLayout gl_Representante = new GroupLayout(Representante);
		gl_Representante.setHorizontalGroup(
			gl_Representante.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Representante.createSequentialGroup()
					.addGroup(gl_Representante.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(147)
							.addComponent(lblRepresentante))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(lblDocumentoDeIdentidad, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(lblMunicipio, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(lblEmailRepresentante, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(lblFaxRepresentante, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(106)
							.addComponent(lblTelefonoMovil, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Representante.createSequentialGroup()
							.addGap(105)
							.addComponent(textField_6, 0, 0, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
					.addGap(40))
		);
		gl_Representante.setVerticalGroup(
			gl_Representante.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Representante.createSequentialGroup()
					.addGap(11)
					.addComponent(lblRepresentante)
					.addGap(9)
					.addComponent(label_10)
					.addGap(11)
					.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_9)
					.addGap(11)
					.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblDocumentoDeIdentidad)
					.addGap(11)
					.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_5)
					.addGap(11)
					.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblMunicipio)
					.addGap(11)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(label_4)
					.addGap(11)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblEmailRepresentante)
					.addGap(11)
					.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblFaxRepresentante)
					.addGap(10)
					.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_Representante.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(lblTelefonoMovil))
					.addGap(11)
					.addGroup(gl_Representante.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		Representante.setLayout(gl_Representante);
		GroupLayout gl_inscActvPers = new GroupLayout(inscActvPers);
		gl_inscActvPers.setHorizontalGroup(
			gl_inscActvPers.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inscActvPers.createSequentialGroup()
					.addComponent(Interesado, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addGap(63)
					.addComponent(btnAceptarInsPers, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnCancelarInsPers, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_inscActvPers.createSequentialGroup()
					.addGap(310)
					.addComponent(Representante, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE))
		);
		gl_inscActvPers.setVerticalGroup(
			gl_inscActvPers.createParallelGroup(Alignment.LEADING)
				.addComponent(Interesado, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_inscActvPers.createSequentialGroup()
					.addGap(561)
					.addComponent(btnAceptarInsPers))
				.addGroup(gl_inscActvPers.createSequentialGroup()
					.addGap(561)
					.addComponent(btnCancelarInsPers))
				.addComponent(Representante, GroupLayout.PREFERRED_SIZE, 554, GroupLayout.PREFERRED_SIZE)
		);
		inscActvPers.setLayout(gl_inscActvPers);
		panel_2.setLayout(gl_panel_2);

		JPanel VisualizarLicencias = new JPanel();
		VisualizarLicencias.setVisible(true);
		Contenedor.add(VisualizarLicencias, "name_30680022169608");
		VisualizarLicencias.setVisible(true);
		ArrVistas[0] = VisualizarLicencias;

		JScrollPane scrollPane_1 = new JScrollPane();
		
				JButton btnInscribirActividad = new JButton("Nueva licencia");
				btnInscribirActividad.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						lblRutaDeAcceso.setText("Inscribir Actividad");
						controlador.cambioPantalla(inscActvPers);
						tabbedPane.setVisible(false);
						btnRefreshPers.setVisible(false);
					}
				});

		table = new JTable() {
			private static final long serialVersionUID = 9082642090247275215L;

			public boolean isCellEditable(int row, int column) {
				return false;// you can set which column/row can be edited.
			}
		};
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int selectedRowIndex = table.getSelectedRow();
					controlador.nuevaPantalla();
				}
			}
		});
	       checkRepresentante.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
                      if (checkRepresentante.isSelected()) {
                             controlador.enableComponents(Representante, true);
                      } else {
                             controlador.enableComponents(Representante, false);
                      }

               }
        });

		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		scrollPane_1.setViewportView(table);
		GroupLayout gl_VisualizarLicencias = new GroupLayout(VisualizarLicencias);
		gl_VisualizarLicencias.setHorizontalGroup(
			gl_VisualizarLicencias.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_VisualizarLicencias.createSequentialGroup()
					.addGap(21)
					.addComponent(btnInscribirActividad, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(515, Short.MAX_VALUE))
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
		);
		gl_VisualizarLicencias.setVerticalGroup(
			gl_VisualizarLicencias.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_VisualizarLicencias.createSequentialGroup()
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnInscribirActividad))
		);
		VisualizarLicencias.setLayout(gl_VisualizarLicencias);

		tabbedPane.setVisible(true);

		
		JPanel inscActv = new JPanel();
		ArrVistas[2] = inscActv;
		Contenedor.add(inscActv, "name_29022094463246");

		JLabel lblNewLabel = new JLabel("Fotocopia de licencia de obra");
		lblNewLabel.setBounds(37, 38, 166, 14);

		JLabel lblNewLabel_1 = new JLabel("Justificante de pago");
		lblNewLabel_1.setBounds(37, 79, 139, 14);

		JLabel lblNewLabel_2 = new JLabel("Fotocopia de Escritura");
		lblNewLabel_2.setBounds(37, 120, 139, 14);

		JLabel lblNewLabel_3 = new JLabel("Fotocopia de modelo 36");
		lblNewLabel_3.setBounds(37, 161, 139, 14);

		JLabel lblNewLabel_4 = new JLabel("Planos");
		lblNewLabel_4.setBounds(37, 202, 139, 14);

		JLabel lblNewLabel_5 = new JLabel("CD");
		lblNewLabel_5.setBounds(37, 243, 139, 14);

		JLabel lblNewLabel_6 = new JLabel("Memoria");
		lblNewLabel_6.setBounds(37, 284, 139, 14);

		JLabel lblNewLabel_7 = new JLabel("Fotograf\u00EDa");
		lblNewLabel_7.setBounds(37, 325, 139, 14);

		JLabel lblNewLabel_8 = new JLabel("Tipo de suelo");
		lblNewLabel_8.setBounds(334, 37, 124, 14);

		JLabel lblNewLabel_9 = new JLabel("Emplazamiento");
		lblNewLabel_9.setBounds(334, 303, 124, 14);

		JLabel lblNewLabel_10 = new JLabel("Fecha de inicio");
		lblNewLabel_10.setBounds(334, 116, 124, 14);

		JLabel lblNewLabel_11 = new JLabel("Fecha de solicitud");
		lblNewLabel_11.setBounds(334, 78, 124, 14);

		JLabel lblNewLabel_12 = new JLabel("Referencia catastral");
		lblNewLabel_12.setBounds(334, 265, 124, 14);

		JLabel lblNewLabel_13 = new JLabel("Local");
		lblNewLabel_13.setBounds(334, 151, 124, 14);

		JLabel lblNewLabel_14 = new JLabel("Tipo");
		lblNewLabel_14.setBounds(334, 189, 124, 14);

		JLabel lblNewLabel_15 = new JLabel("Cuota");
		lblNewLabel_15.setBounds(334, 227, 129, 14);

		JLabel lblNewLabel_16 = new JLabel("Descripci\u00F3n");
		lblNewLabel_16.setBounds(334, 338, 124, 14);

		JLabel lblNewLabel_17 = new JLabel("Certificado del Colegio Oficial");
		lblNewLabel_17.setBounds(37, 489, 166, 14);

		JCheckBox chckFotocopiaLicenciaObra = new JCheckBox("");
		chckFotocopiaLicenciaObra.setBounds(245, 38, 23, 23);

		JCheckBox chckJustificantePago = new JCheckBox("");
		chckJustificantePago.setBounds(245, 75, 23, 23);

		JCheckBox chckFotocopiaEscritura = new JCheckBox("");
		chckFotocopiaEscritura.setBounds(245, 116, 23, 23);

		JCheckBox chckFotocopiaModelo36 = new JCheckBox("");
		chckFotocopiaModelo36.setBounds(245, 157, 23, 23);

		JCheckBox chckPlanos = new JCheckBox("");
		chckPlanos.setBounds(245, 198, 23, 23);

		JCheckBox chckCD = new JCheckBox("");
		chckCD.setBounds(245, 239, 23, 23);

		JCheckBox chckMemoria = new JCheckBox("");
		chckMemoria.setBounds(245, 280, 23, 23);

		JCheckBox chckFotografia = new JCheckBox("");
		chckFotografia.setBounds(245, 321, 23, 23);

		JCheckBox chckCertificadoColegio = new JCheckBox("");
		chckCertificadoColegio.setBounds(245, 485, 23, 23);

		JDateChooser DCFechaSolicitud = new JDateChooser();
		DCFechaSolicitud.setBounds(473, 72, 146, 20);

		JDateChooser DCFechaInicio = new JDateChooser();
		DCFechaInicio.setBounds(473, 110, 146, 20);

		txtfLocal = new JTextField();
		txtfLocal.setBounds(473, 148, 146, 20);
		txtfLocal.setColumns(10);

		txtfTipo = new JTextField();
		txtfTipo.setBounds(473, 186, 146, 20);
		txtfTipo.setText("");
		txtfTipo.setColumns(10);

		txtfCuota = new JTextField();
		txtfCuota.setBounds(473, 224, 146, 20);
		txtfCuota.setText("");
		txtfCuota.setColumns(10);

		txtfReferenciaCatastral = new JTextField();
		txtfReferenciaCatastral.setBounds(473, 262, 146, 20);
		txtfReferenciaCatastral.setColumns(10);

		txtfEmplazamiento = new JTextField();
		txtfEmplazamiento.setBounds(473, 300, 146, 20);
		txtfEmplazamiento.setText("");
		txtfEmplazamiento.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(473, 338, 146, 61);

		JButton btnAceptarInsActv = new JButton("Aceptar");
		btnAceptarInsActv.setBounds(334, 449, 90, 23);

		JButton btnCancelarInsActv = new JButton("Cancelar");
		btnCancelarInsActv.setBounds(524, 449, 95, 23);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(473, 34, 74, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Urbano", "Rústico" }));

		JLabel lblNewLabel_18 = new JLabel("Fotocopia DNI/CIF/NIE");
		lblNewLabel_18.setBounds(37, 366, 139, 14);

		JCheckBox chckbxEntregado = new JCheckBox("");
		chckbxEntregado.setBounds(245, 362, 23, 23);

		JLabel lblCertificado = new JLabel("Certificado 1");
		lblCertificado.setBounds(37, 407, 139, 14);

		JCheckBox chckbxEntregado_1 = new JCheckBox("");
		chckbxEntregado_1.setBounds(245, 403, 23, 23);

		JLabel lblCertificado_1 = new JLabel("Certificado2");
		lblCertificado_1.setBounds(37, 453, 139, 14);

		JCheckBox chckbxEntregado_2 = new JCheckBox("");
		chckbxEntregado_2.setBounds(245, 449, 23, 23);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(313, 0, 2, 573);
		separator_1.setOrientation(SwingConstants.VERTICAL);

		JTextPane txtDescripcion = new JTextPane();
		scrollPane.setViewportView(txtDescripcion);
		inscActv.setLayout(null);
		inscActv.add(lblNewLabel_17);
		inscActv.add(chckCertificadoColegio);
		inscActv.add(lblNewLabel);
		inscActv.add(lblNewLabel_1);
		inscActv.add(lblNewLabel_2);
		inscActv.add(lblNewLabel_3);
		inscActv.add(lblNewLabel_4);
		inscActv.add(lblNewLabel_5);
		inscActv.add(lblNewLabel_6);
		inscActv.add(lblNewLabel_7);
		inscActv.add(lblNewLabel_18);
		inscActv.add(lblCertificado);
		inscActv.add(chckbxEntregado);
		inscActv.add(chckFotocopiaLicenciaObra);
		inscActv.add(chckJustificantePago);
		inscActv.add(chckFotocopiaEscritura);
		inscActv.add(chckPlanos);
		inscActv.add(chckCD);
		inscActv.add(chckMemoria);
		inscActv.add(chckFotocopiaModelo36);
		inscActv.add(chckFotografia);
		inscActv.add(chckbxEntregado_1);
		inscActv.add(lblCertificado_1);
		inscActv.add(chckbxEntregado_2);
		inscActv.add(separator_1);
		inscActv.add(lblNewLabel_11);
		inscActv.add(lblNewLabel_8);
		inscActv.add(lblNewLabel_10);
		inscActv.add(lblNewLabel_13);
		inscActv.add(lblNewLabel_14);
		inscActv.add(lblNewLabel_15);
		inscActv.add(lblNewLabel_12);
		inscActv.add(lblNewLabel_9);
		inscActv.add(lblNewLabel_16);
		inscActv.add(btnCancelarInsActv);
		inscActv.add(txtfLocal);
		inscActv.add(txtfTipo);
		inscActv.add(txtfCuota);
		inscActv.add(txtfReferenciaCatastral);
		inscActv.add(txtfEmplazamiento);
		inscActv.add(DCFechaInicio);
		inscActv.add(DCFechaSolicitud);
		inscActv.add(btnAceptarInsActv);
		inscActv.add(scrollPane);
		inscActv.add(comboBox);
		contentPane.setLayout(gl_contentPane);
		btnVisualizarLicencias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblRutaDeAcceso.setText("Visualizar Licencias");
				controlador.cambioPantalla(VisualizarLicencias);
				tabbedPane.setVisible(true);
				btnRefreshPers.setVisible(true);
			}
		});
		btnAceptarInsPers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRutaDeAcceso.setText("Inscribir Actividad");
				controlador.cambioPantalla(inscActv);
				tabbedPane.setVisible(false);
				btnRefreshPers.setVisible(false);
			}
		});
		btnCancelarInsActv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(inscActvPers);
				tabbedPane.setVisible(false);
				btnRefreshPers.setVisible(false);
			}
		});
		btnCancelarInsPers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRutaDeAcceso.setText("Visualizar Licencias");
				controlador.cambioPantalla(VisualizarLicencias);
				tabbedPane.setVisible(true);
				btnRefreshPers.setVisible(true);
			}
		});

	}

//	public String getFechaInicialActBusqueda() {
//
//
//		int str = (Integer) FechaInicialActBusqueda.getDate().getDay();
//		int str2 = (Integer) FechaInicialActBusqueda.getDate().getMonth()+1;
//		int str3 = (Integer) FechaInicialActBusqueda.getDate().getYear() +1900;
//		System.out.println(str+"-"+str2+"-"+str3);
//		return str+"-"+str2+"-"+str3;
//	}

	public String getFechaFinalActBusqueda() {

		int str = (Integer) FechaFinalActBusqueda.getDate().getDay();
		int str2 = (Integer) FechaFinalActBusqueda.getDate().getMonth()+1;
		int str3 = (Integer) FechaFinalActBusqueda.getDate().getYear() +1900; 
		System.out.println(str+"-"+str2+"-"+str3);
		return str+"-"+str2+"-"+str3;
	}

	public void clear_Table() {
		for (int i = 0; i < table.getRowCount(); i++) {
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.removeRow(i);
			i -= 1;
		}
	}

	public String getTxtfRazonSocialBusquedaPJ() {
		return txtfRazonSocialBusquedaPJ.getText();
	}

	public String getNIFBusquedaPJ() {
		return NIFBusquedaPJ.getText();
	}

	public String getTxtfActBusqueda() {
		return txtfActBusqueda.getText();
	}

	public void RellenarTabla(Object[][] aaa) {
		Object[][] resultados = (Object[][]) aaa;
		table.setModel(new DefaultTableModel(resultados,
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
	}

	public void setDatosTabla() {
		Object[][] tabla = modelo2.getTabla();
		this.RellenarTabla(tabla);

	}
}
