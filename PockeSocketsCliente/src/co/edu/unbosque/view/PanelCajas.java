 /**
  *  Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones iniciales del programa que extiende de JPanel
 * 
 */

public class PanelCajas extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel e1;
	/**
	 * Atributo tipo JButton para las cajas
	 */
	private JButton caja1, caja2, caja3;

	/**
	 * Metodo constructor
	 */

	public PanelCajas() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.blue);
		inicializarComponentes();

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		caja1 = new JButton("Caja 1");
		caja1.setBounds(10, 20, 180, 100);
		caja1.setFont(new Font("Monospaced", Font.BOLD, 20));
		caja1.setForeground(Color.white);
		caja1.setBackground(Color.black);
		caja1.setActionCommand("caja1");
		add(caja1);
		
		caja2 = new JButton("Caja 2");
		caja2.setBounds(210, 20, 180, 100);
		caja2.setFont(new Font("Monospaced", Font.BOLD, 20));
		caja2.setForeground(Color.white);
		caja2.setBackground(Color.black);
		caja2.setActionCommand("caja2");
		add(caja2);
		
		caja3 = new JButton("Caja 3");
		caja3.setBounds(410, 20, 180, 100);
		caja3.setFont(new Font("Monospaced", Font.BOLD, 20));
		caja3.setForeground(Color.white);
		caja3.setBackground(Color.black);
		caja3.setActionCommand("caja3");
		add(caja3);

//		e1 = new JLabel("Empieza esta aventura");
//		e1.setBounds(365, 250, 250, 50);
//		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
//		e1.setForeground(Color.white);
//		add(e1);

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
	 * @return the caja1
	 */
	public JButton getCaja1() {
		return caja1;
	}

	/**
	 * @param caja1 the caja1 to set
	 */
	public void setCaja1(JButton caja1) {
		this.caja1 = caja1;
	}

	/**
	 * @return the caja2
	 */
	public JButton getCaja2() {
		return caja2;
	}

	/**
	 * @param caja2 the caja2 to set
	 */
	public void setCaja2(JButton caja2) {
		this.caja2 = caja2;
	}

	/**
	 * @return the caja3
	 */
	public JButton getCaja3() {
		return caja3;
	}

	/**
	 * @param caja3 the caja3 to set
	 */
	public void setCaja3(JButton caja3) {
		this.caja3 = caja3;
	}


}

