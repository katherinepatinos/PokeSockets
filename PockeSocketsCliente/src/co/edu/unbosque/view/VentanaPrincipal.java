/**
 * Paquete de vista que maneja la interfaz grafica
 */
package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	/**
	 * Atributo tipo AgregarId renombrado como paggid
	 */
	private AgregarId paggid;
	/**
	 * Atributo tipo AgregarNuevo renombrado como paggnuevo
	 */
	private AgregarNuevo paggnuevo;
	/**
	 * Atributo tipo PanelMostrar renombrado como pmostrar
	 */
	private PanelMostrar pmostrar;
	/**
	 * Atributo tipo PanelOpciones renombrado como popciones
	 */
	private PanelOpciones popciones;
	/**
	 * Atributo tipo PanelOne renombrado como po
	 */
	private PanelGenero pgenero;
	/**
	 * Atributo tipo PanelOne renombrado como p1
	 */
	private PanelOne p1;
	/**
	 * Atributo tipo PanelManorenombrado como pmano
	 */
	private PanelMano pmano;
	/**
	 * Atributo tipo PanelCajas renombrado como pcajas
	 */
	private PanelCajas pcajas;
	/**
	 * Atributo tipo JLabel que es una imagen
	 */
	private JLabel img;
	/**
	 * Atributo tipo ImageIcon para asignar un icono a la ventana
	 */
	private ImageIcon icono;

	/**
	 * Metodo constructor
	 */
	public VentanaPrincipal() {

		setSize(1000, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		getContentPane().setBackground(Color.black);

		inicializarComponentes();

		icono();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Metodo de icono del programa
	 */
	private void icono() {
		icono = new ImageIcon("Media/Icono.png");
		setIconImage(icono.getImage());

	}

	/**
	 * Metodo que inicializa los atributos
	 */
	private void inicializarComponentes() {

		// TODO Auto-generated method stub

		pmostrar = new PanelMostrar();
//		popciones.setBounds(350, 200, 250, 200);
		pmostrar.setVisible(false);
		add(pmostrar);

		paggid = new AgregarId();
//		popciones.setBounds(350, 200, 250, 200);
		paggid.setVisible(false);
		add(paggid);

		paggnuevo = new AgregarNuevo();
//		popciones.setBounds(350, 200, 250, 200);
		paggnuevo.setVisible(false);
		add(paggnuevo);

		popciones = new PanelOpciones();
//		popciones.setBounds(350, 200, 250, 200);
		popciones.setVisible(false);
		add(popciones);

		p1 = new PanelOne();
		p1.setBounds(350, 200, 250, 200);
		p1.setVisible(true);
		add(p1);

		pgenero = new PanelGenero();
		pgenero.setBounds(30, 250, 150, 400);
		pgenero.setVisible(false);
		add(pgenero);

		pmano = new PanelMano();
		pmano.setBounds(0, 450, 1000, 200);
		pmano.setVisible(false);
		add(pmano);

		pcajas = new PanelCajas();
		pcajas.setBounds(280, 170, 600, 200);
		pcajas.setVisible(false);
		add(pcajas);

		img = new JLabel("", JLabel.CENTER);
		img.setIcon(new ImageIcon("Media/Fondo vp.gif"));
		add(img);
	}

	/**
	 * @return the paggid
	 */
	public AgregarId getPaggid() {
		return paggid;
	}

	/**
	 * @param paggid the paggid to set
	 */
	public void setPaggid(AgregarId paggid) {
		this.paggid = paggid;
	}

	/**
	 * @return the paggnuevo
	 */
	public AgregarNuevo getPaggnuevo() {
		return paggnuevo;
	}

	/**
	 * @param paggnuevo the paggnuevo to set
	 */
	public void setPaggnuevo(AgregarNuevo paggnuevo) {
		this.paggnuevo = paggnuevo;
	}

	/**
	 * @return the pmostrar
	 */
	public PanelMostrar getPmostrar() {
		return pmostrar;
	}

	/**
	 * @param pmostrar the pmostrar to set
	 */
	public void setPmostrar(PanelMostrar pmostrar) {
		this.pmostrar = pmostrar;
	}

	/**
	 * @return the popciones
	 */
	public PanelOpciones getPopciones() {
		return popciones;
	}

	/**
	 * @param popciones the popciones to set
	 */
	public void setPopciones(PanelOpciones popciones) {
		this.popciones = popciones;
	}

	/**
	 * @return the pgenero
	 */
	public PanelGenero getPgenero() {
		return pgenero;
	}

	/**
	 * @param pgenero the pgenero to set
	 */
	public void setPgenero(PanelGenero pgenero) {
		this.pgenero = pgenero;
	}

	/**
	 * @return the p1
	 */
	public PanelOne getP1() {
		return p1;
	}

	/**
	 * @param p1 the p1 to set
	 */
	public void setP1(PanelOne p1) {
		this.p1 = p1;
	}

	/**
	 * @return the pmano
	 */
	public PanelMano getPmano() {
		return pmano;
	}

	/**
	 * @param pmano the pmano to set
	 */
	public void setPmano(PanelMano pmano) {
		this.pmano = pmano;
	}

	/**
	 * @return the pcajas
	 */
	public PanelCajas getPcajas() {
		return pcajas;
	}

	/**
	 * @param pcajas the pcajas to set
	 */
	public void setPcajas(PanelCajas pcajas) {
		this.pcajas = pcajas;
	}

	/**
	 * @return the img
	 */
	public JLabel getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(JLabel img) {
		this.img = img;
	}

	/**
	 * @return the icono
	 */
	public ImageIcon getIcono() {
		return icono;
	}

	/**
	 * @param icono the icono to set
	 */
	public void setIcono(ImageIcon icono) {
		this.icono = icono;
	}

}
