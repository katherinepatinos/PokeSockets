/** 
* Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
 */
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones de pokemon en la mano que  extiende de JPanel
 */

public class PanelMano extends JPanel {

	/**
	 * Atributo tipo JButton para el boton inicio y registro
	 */
	private JButton a,b,c,d,e,f;

	/**
	 * Metodo constructor
	 */

	public PanelMano() {

		setLayout(null);
//		setBackground(new Color(108, 246, 248, 0));
		setBackground(Color.red);
		inicializarComponentes();

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		a = new JButton("1");
		a.setBounds(300, 60, 60, 60);
		a.setFont(new Font("Monospaced", Font.BOLD, 20));
		a.setForeground(Color.white);
		a.setBackground(Color.black);
		a.setActionCommand("a");
//		add(inicio);
		
		b = new JButton("2");
		b.setBounds(400, 60, 60, 60);
		b.setFont(new Font("Monospaced", Font.BOLD, 20));
		b.setForeground(Color.white);
		b.setBackground(Color.black);
		b.setActionCommand("b");
		
		c = new JButton("3");
		c.setBounds(500, 60, 60, 60);
		c.setFont(new Font("Monospaced", Font.BOLD, 20));
		c.setForeground(Color.white);
		c.setBackground(Color.black);
		c.setActionCommand("c");
		
		d = new JButton("4");
		d.setBounds(600, 60, 60, 60);
		d.setFont(new Font("Monospaced", Font.BOLD, 20));
		d.setForeground(Color.white);
		d.setBackground(Color.black);
		d.setActionCommand("d");
		
		e = new JButton("5");
		e.setBounds(700, 60, 60, 60);
		e.setFont(new Font("Monospaced", Font.BOLD, 20));
		e.setForeground(Color.white);
		e.setBackground(Color.black);
		e.setActionCommand("e");
		
		f = new JButton("6");
		f.setBounds(800, 60, 60, 60);
		f.setFont(new Font("Monospaced", Font.BOLD, 20));
		f.setForeground(Color.white);
		f.setBackground(Color.black);
		f.setActionCommand("f");

		add(a);
		add(b);
		add(c);
		add(d);
		add(e);
		add(f);

	}

	/**
	 * @return the a
	 */
	public JButton getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(JButton a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public JButton getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(JButton b) {
		this.b = b;
	}

	/**
	 * @return the c
	 */
	public JButton getC() {
		return c;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(JButton c) {
		this.c = c;
	}

	/**
	 * @return the d
	 */
	public JButton getD() {
		return d;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(JButton d) {
		this.d = d;
	}

	/**
	 * @return the e
	 */
	public JButton getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(JButton e) {
		this.e = e;
	}

	/**
	 * @return the f
	 */
	public JButton getF() {
		return f;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(JButton f) {
		this.f = f;
	}

}