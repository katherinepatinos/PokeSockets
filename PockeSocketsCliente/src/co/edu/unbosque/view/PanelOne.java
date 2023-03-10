/**
 * Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones iniciales del programa extiende de JPanel
 */

public class PanelOne extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel e1;
	/**
	 * Atributo tipo JButton para el boton inicio y registro
	 */
	private JButton inicio;

	/**
	 * Metodo constructor
	 */

	public PanelOne() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.cyan);
		inicializarComponentes();

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		inicio = new JButton("Iniciar");
		inicio.setBounds(25, 90, 200, 50);
		inicio.setFont(new Font("Monospaced", Font.BOLD, 20));
		inicio.setForeground(Color.white);
		inicio.setBackground(Color.black);
		inicio.setActionCommand("iniciar");
		add(inicio);

		e1 = new JLabel("Empieza la aventura");
		e1.setBounds(5, 20, 250, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
		e1.setForeground(Color.black);
		add(e1);

	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the e1
	 */
	public JLabel getE1() {
		return e1;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param e1 the e1 to set
	 */
	public void setE1(JLabel e1) {
		this.e1 = e1;
	}

	/**
	 * @return the inicio
	 */
	public JButton getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(JButton inicio) {
		this.inicio = inicio;
	}

	
}
