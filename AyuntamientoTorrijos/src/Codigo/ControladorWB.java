package Codigo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ControladorWB extends JFrame implements Controlador {
	private Modelo modelo;
	private ModeloBBDD modelo2;
	private ModeloFicheroIni modeloFicheroIni;
	private VistaFicheroIni vistaFicheroIni;
	private VistaWB vista;
	private VistaAuxTabla vista2;
	private JPanel contentPane;
	private JPanel ArrVistas[];

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void setModelo2(Modelo modelo) {
		this.modelo2 = (ModeloBBDD) modelo;
	}

	public void setModelo3(Modelo modelo) {
		this.modeloFicheroIni = (ModeloFicheroIni) modelo;
	}

	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}

	public void setVistaFichero(Vista vista) {
		this.vistaFicheroIni = (VistaFicheroIni) vista;
	}

	public void setPanels(JPanel[] aux) {
		this.ArrVistas = aux;
	}

	public void cambioPantalla(JPanel pantallaNueva) {
		if (pantallaNueva.isVisible() == false) {
			pantallaNueva.setVisible(true);
			for (int i = 0; i < ArrVistas.length; i++) {
				if (!(ArrVistas[i] == pantallaNueva)) {
					ArrVistas[i].setVisible(false);
				}
			}

		}
	}

	public void nuevaPantalla() {
		VistaAuxTabla vistaTabla = new VistaAuxTabla();
		vistaTabla.setControlador(this);
		vistaTabla.setModelo(modelo);
		vistaTabla.setVisible(true);

	}

	public void GuardarDatos() {

		modeloFicheroIni.GuardarDatos(vistaFicheroIni.getTxtfBaseDatos(), vistaFicheroIni.getTxtfLogin(),
				vistaFicheroIni.getTxtfPassword(), vistaFicheroIni.getTxtfURL());
	}

	public void ventanaConfiguracion() {
		VistaFicheroIni vistaFichero = new VistaFicheroIni();
		vistaFichero.setControlador(this);
		vistaFichero.setModeloFich(modeloFicheroIni);
		vistaFichero.setModeloBBDD(modelo2);
		modeloFicheroIni.setVista(vistaFichero);

		modeloFicheroIni.setDatos();
		setVistaFichero(vistaFichero);

		vistaFichero.setVisible(true);
	}

	public void refrescar() {

		modelo2.refrescar();
	}

	public void busquedaPersonaJur() {
		String nif = vista.getNIFBusquedaPJ();
		String razonSocial = vista.getTxtfRazonSocialBusquedaPJ();
		modelo2.Consulta2(nif, razonSocial);

	}

	public void busquedaActividad() {
		// String fechaInicial = vista.getFechaInicialActBusqueda();
		String fechaFinal = vista.getFechaFinalActBusqueda();
		String tipo = vista.getTxtfActBusqueda();
		modelo2.Consulta3(tipo, "dd-MMM-yyyy", fechaFinal);

	}

	public void Modificar() {
		modeloFicheroIni.Modificar(vistaFicheroIni.getTxtfBaseDatosEnb(), vistaFicheroIni.getTxtfLoginEnb(),
				vistaFicheroIni.getTxtfPasswordEnb(), vistaFicheroIni.getTxtfURLEnb(), vistaFicheroIni.getBtnOk());
	}

	public void enableComponents(Container container, boolean enable) {
		Component[] components = container.getComponents();
		for (Component component : components) {
			component.setEnabled(enable);
			if (component instanceof Container) {
				enableComponents((Container) component, enable);
			}
		}

	}

	public int insetarPersona() {
		return modelo2.insertarPersona(vista.getTxtfInscNom(),vista.getTxtfInscApll(),vista.getTxtfInscCIF(),vista.getTxtfInscMun(),vista.getTxtfInscDir(),vista.getTxtfInscCP(),vista.getTxtfInscMail(),vista.getTxtfInscFax(),vista.getTxtfInscTlfMo(),vista.getTxtfInscTlfFij());
	}

	public int inscribirActividad() {
		return modelo2.insertarActividad(vista.getChckFotocopiaLicenciaObra(),vista.getChckOtrasAut(),vista.getChckJustificantePago(),vista.getChckFotocopiaEscritura(),vista.getChckFotocopiaModelo36(),vista.getChckPlanos(),vista.getChckCD(),vista.getChckMemoria(),vista.getChckFotografia(),vista.getCbTipoSuelo(),vista.getTxtfReferenciaCatastral(),vista.getTxtfLocal(),vista.getTxtfTipo(),vista.getTxtfEmplazamiento(),vista.getDCFechaInicio(),vista.getDCFechaSolicitud(),vista.getTxtfCuota(),vista.getTxtDescripcion(),vista.getChckCertificadoColegio(),vista.getChckbxCer1(),vista.getChckbxCer2(),vista.getChckbxFtcDNI());
	}

	public int insertarRepresentante() {
		return modelo2.insertarRepresentante(vista.getTxtfInscRNom(),vista.getTxtfInscRApll(),vista.getTxtfInscRDNI(),vista.getTxtfInscRMun(),vista.getTxtfInscRDir(),vista.getTxtfInscRCP(),vista.getTxtfInscRMail(),vista.getTxtfInscRFax(),vista.getTxtfInscRTlfMo(),vista.getTxtfInscRTlfFij());
	}

	public void inscribirTablaInter(int idPer, int idAct) {
		modelo2.inscribirTablaInter(idPer,idAct);
	}

	public void inscribirTablaInterRep(int idPer, int idRep) {
		modelo2.inscribirTablaInterRep(idPer,idRep);
		
	}
	

}
