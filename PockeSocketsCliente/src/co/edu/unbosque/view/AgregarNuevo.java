/** Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
*/
package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.Iterator;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * Panel que gestiona los parametros para agregar un usuario mujer y extiende de
 * JPanel
 */

public class AgregarNuevo extends JPanel {

	/**
	 * Atributo tipo JPanel para la imagen del pokemon
	 */
	private JPanel img;
	/**
	 * Atributo tipo JLabel 
	 */
	private JLabel id, nombre, apodo, tipo, vida, ataque, defensa, nivel, ataques, t1, t2, iconitos, asteric;
	/**
	 * Atributo tipo JTextField para que el usuario digite los requisitos que se le
	 * solicitan
	 */
	private JTextField tNombre, tApodo, tTipo, tVida, tAtaque, tDefensa, tNivel, tAtaques1, tAtaques2, tAtaques3, tAtaques4;
	/**
	 * Atributo tipo JButton
	 */
	private JButton guardar, nuevo, buscar, backAgre;
	
	/**
	 * Atributo tipo String
	 */
	private String file_img = "Media/Mujer/1.jpg";
	
	/**
	 * Metodo constructor
	 */
	public AgregarNuevo() {

		setSize(1000, 650);
		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.pink);
		inicializarComponentes();
		
		setVisible(false);
	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {


		backAgre = new JButton("BACK");
		backAgre.setBounds(50, 550, 150, 30);
		backAgre.setFont(new Font("Monospaced", Font.BOLD, 20));
		backAgre.setForeground(Color.black);
		backAgre.setBackground(Color.white);
		backAgre.setActionCommand("backAgreNuevo");
		add(backAgre);
		
		asteric = new JLabel();
		asteric.setBounds(30, 50, 230, 350);
		ImageIcon imag1 = new ImageIcon("Media/Asteric.png");
		Icon icono = new ImageIcon(
				imag1.getImage().getScaledInstance(asteric.getWidth(), asteric.getHeight(), Image.SCALE_DEFAULT));
		asteric.setIcon(icono);
		asteric.setVisible(true);
		add(asteric);
		
		nombre = new JLabel("Nombre:");
		nombre.setBounds(320, 100, 150, 50);
		nombre.setFont(new Font("Monospaced", Font.BOLD, 15));
		nombre.setForeground(Color.white);
		add(nombre);

		apodo = new JLabel("Apodo:");
		apodo.setBounds(320, 180, 150, 50);
		apodo.setFont(new Font("Monospaced", Font.BOLD, 15));
		apodo.setForeground(Color.white);
		add(apodo);

		tipo = new JLabel("Tipo:");
		tipo.setBounds(320, 250, 250, 50);
		tipo.setFont(new Font("Monospaced", Font.BOLD, 15));
		tipo.setForeground(Color.white);
		add(tipo);

		vida = new JLabel("Vida:");
		vida.setBounds(600, 100, 250, 50);
		vida.setFont(new Font("Monospaced", Font.BOLD, 15));
		vida.setForeground(Color.white);
		add(vida);

		defensa = new JLabel("Defensa:");
		defensa.setBounds(600, 180, 150, 50);
		defensa.setFont(new Font("Monospaced", Font.BOLD, 15));
		defensa.setForeground(Color.white);
		add(defensa);

		ataque = new JLabel("Ataque:");
		ataque.setBounds(600, 250, 150, 50);
		ataque.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataque.setForeground(Color.white);
		add(ataque);

		nivel = new JLabel("Nivel:");
		nivel.setBounds(320, 320, 150, 50);
		nivel.setFont(new Font("Monospaced", Font.BOLD, 15));
		nivel.setForeground(Color.white);
		add(nivel);

		ataques = new JLabel("Ataques:");
		ataques.setBounds(600, 320, 250, 50);
		ataques.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataques.setForeground(Color.white);
		add(ataques);

		tNombre = new JTextField();
		tNombre.setBounds(320, 150, 250, 25);
		tNombre.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tNombre);

		tApodo = new JTextField();
		tApodo.setBounds(320, 220, 250, 25);
		tApodo.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tApodo);

		tTipo = new JTextField();
		tTipo.setBounds(320, 290, 250, 25);
		tTipo.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tTipo);

		tVida = new JTextField();
		tVida.setBounds(320, 360, 250, 25);
		tVida.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tVida);

		tDefensa = new JTextField();
		tDefensa.setBounds(600, 150, 250, 25);
		tDefensa.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tDefensa);

		tAtaque = new JTextField();
		tAtaque.setBounds(600, 220, 250, 25);
		tAtaque.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAtaque);
		
		tNivel = new JTextField();
		tNivel.setBounds(600, 290, 250, 25);
		tNivel.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tNivel);
		
		tAtaques1 = new JTextField();
		tAtaques1.setBounds(600, 360, 250, 25);
		tAtaques1.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAtaques1);
		
		tAtaques2 = new JTextField();
		tAtaques2.setBounds(600, 400, 250, 25);
		tAtaques2.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAtaques2);
		
		tAtaques3 = new JTextField();
		tAtaques3.setBounds(600, 440, 250, 25);
		tAtaques3.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAtaques3);
		
		tAtaques4 = new JTextField();
		tAtaques4.setBounds(600, 480, 250, 25);
		tAtaques4.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(tAtaques4);

		guardar = new JButton("Guardar");
		guardar.setBounds(350, 440, 150, 30);
		guardar.setBackground(Color.white);
		guardar.setFont(new Font("Monospaced", 3, 20));
		guardar.setForeground(Color.black);
		guardar.setFocusable(false);
//		guardar.setVisible(true);
		guardar.setActionCommand("guardarnuevopoke");
		add(guardar);


	}


	/**
	 * @return the guardar
	 */
	public JButton getGuardar() {
		return guardar;
	}

	/**
	 * @param guardar the guardar to set
	 */
	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	/**
	 * @return the nuevo
	 */
	public JButton getNuevo() {
		return nuevo;
	}

	/**
	 * @param nuevo the nuevo to set
	 */
	public void setNuevo(JButton nuevo) {
		this.nuevo = nuevo;
	}

	/**
	 * @return the buscar
	 */
	public JButton getBuscar() {
		return buscar;
	}

	/**
	 * @param buscar the buscar to set
	 */
	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}

	/**
	 * @return the backAgre
	 */
	public JButton getBackAgre() {
		return backAgre;
	}

	/**
	 * @param backAgre the backAgre to set
	 */
	public void setBackAgre(JButton backAgre) {
		this.backAgre = backAgre;
	}

	/**
	 * @return the img
	 */
	public JPanel getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(JPanel img) {
		this.img = img;
	}

	/**
	 * @return the tNombre
	 */
	public JTextField gettNombre() {
		return tNombre;
	}

	/**
	 * @param tNombre the tNombre to set
	 */
	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

	/**
	 * @return the tApodo
	 */
	public JTextField gettApodo() {
		return tApodo;
	}

	/**
	 * @param tApodo the tApodo to set
	 */
	public void settApodo(JTextField tApodo) {
		this.tApodo = tApodo;
	}

	/**
	 * @return the tTipo
	 */
	public JTextField gettTipo() {
		return tTipo;
	}

	/**
	 * @param tTipo the tTipo to set
	 */
	public void settTipo(JTextField tTipo) {
		this.tTipo = tTipo;
	}

	/**
	 * @return the tVida
	 */
	public JTextField gettVida() {
		return tVida;
	}

	/**
	 * @param tVida the tVida to set
	 */
	public void settVida(JTextField tVida) {
		this.tVida = tVida;
	}

	/**
	 * @return the tAtaque
	 */
	public JTextField gettAtaque() {
		return tAtaque;
	}

	/**
	 * @param tAtaque the tAtaque to set
	 */
	public void settAtaque(JTextField tAtaque) {
		this.tAtaque = tAtaque;
	}

	/**
	 * @return the tDefensa
	 */
	public JTextField gettDefensa() {
		return tDefensa;
	}

	/**
	 * @param tDefensa the tDefensa to set
	 */
	public void settDefensa(JTextField tDefensa) {
		this.tDefensa = tDefensa;
	}

	/**
	 * @return the tNivel
	 */
	public JTextField gettNivel() {
		return tNivel;
	}

	/**
	 * @param tNivel the tNivel to set
	 */
	public void settNivel(JTextField tNivel) {
		this.tNivel = tNivel;
	}

	

}
