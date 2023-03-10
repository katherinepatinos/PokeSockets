/**
 *  Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
*/
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones iniciales del programa extiende de JPanel
 * 
 * 
 */

public class PanelOpciones extends JPanel {

	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel e1;
	private JPanel auxOpc, auxOpc2, auxOpc3;
	/**
	 * Atributo tipo JButton para el boton inicio y registro
	 */
	private JButton agregar, eliminar, modificar, mostrar, backOpc, agregar2, eliminar2, modificar2, mostrar2, backOpc2, agregar3, eliminar3, modificar3, 
	mostrar3, backOpc3;

	/**
	 * Metodo constructor
	 */

	public PanelOpciones() {

		setLayout(null);
		setSize(1000, 650);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.cyan);
		inicializarComponentes();

	}

	
	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		agregar = new JButton("Agregar");
		agregar.setBounds(420, 150, 200, 100);
		agregar.setFont(new Font("Monospaced", Font.BOLD, 20));
		agregar.setForeground(Color.white);
		agregar.setBackground(Color.black);
		agregar.setActionCommand("agregar");

		eliminar = new JButton("Eliminar");
		eliminar.setBounds(420, 400, 200, 100);
		eliminar.setFont(new Font("Monospaced", Font.BOLD, 20));
		eliminar.setForeground(Color.white);
		eliminar.setBackground(Color.black);
		eliminar.setActionCommand("eliminar");

		modificar = new JButton("Modificar");
		modificar.setBounds(680, 150, 200, 100);
		modificar.setFont(new Font("Monospaced", Font.BOLD, 20));
		modificar.setForeground(Color.white);
		modificar.setBackground(Color.black);
		modificar.setActionCommand("modificar");

		mostrar = new JButton("Mostrar");
		mostrar.setBounds(680, 400, 200, 100);
		mostrar.setFont(new Font("Monospaced", Font.BOLD, 20));
		mostrar.setForeground(Color.white);
		mostrar.setBackground(Color.black);
		mostrar.setActionCommand("mostrar");

		backOpc = new JButton("BACK");
		backOpc.setBounds(50, 550, 100, 30);
		backOpc.setFont(new Font("Monospaced", Font.BOLD, 20));
		backOpc.setForeground(Color.white);
		backOpc.setBackground(Color.black);
		backOpc.setActionCommand("backOpc");
		add(backOpc);

		e1 = new JLabel("Elija una opcion:");
		e1.setBounds(100, 250, 250, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
		e1.setForeground(Color.white);
		add(e1);

		add(modificar);
		add(agregar);
		add(eliminar);
		add(mostrar);

		auxOpc = new JPanel();
		auxOpc.setBounds(400, 80, 500, 500);
		auxOpc.setBackground(Color.RED);
		auxOpc.setVisible(false);
		add(auxOpc);
		
		// 
		
		agregar2 = new JButton("Agregar");
		agregar2.setBounds(420, 150, 200, 100);
		agregar2.setFont(new Font("Monospaced", Font.BOLD, 20));
		agregar2.setForeground(Color.white);
		agregar2.setBackground(Color.black);
		agregar2.setActionCommand("agregar2");

		eliminar2 = new JButton("Eliminar");
		eliminar2.setBounds(420, 400, 200, 100);
		eliminar2.setFont(new Font("Monospaced", Font.BOLD, 20));
		eliminar2.setForeground(Color.white);
		eliminar2.setBackground(Color.black);
		eliminar2.setActionCommand("eliminar2");

		modificar2 = new JButton("Modificar");
		modificar2.setBounds(680, 150, 200, 100);
		modificar2.setFont(new Font("Monospaced", Font.BOLD, 20));
		modificar2.setForeground(Color.white);
		modificar2.setBackground(Color.black);
		modificar2.setActionCommand("modificar2");

		mostrar2 = new JButton("Mostrar");
		mostrar2.setBounds(680, 400, 200, 100);
		mostrar2.setFont(new Font("Monospaced", Font.BOLD, 20));
		mostrar2.setForeground(Color.white);
		mostrar2.setBackground(Color.black);
		mostrar2.setActionCommand("mostrar2");

		backOpc2 = new JButton("BACK");
		backOpc2.setBounds(50, 550, 100, 30);
		backOpc2.setFont(new Font("Monospaced", Font.BOLD, 20));
		backOpc2.setForeground(Color.white);
		backOpc2.setBackground(Color.black);
		backOpc2.setActionCommand("backOpc2");
		add(backOpc2);

		e1 = new JLabel("Elija una opcion:");
		e1.setBounds(100, 250, 250, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
		e1.setForeground(Color.white);
		add(e1);

		add(modificar2);
		add(agregar2);
		add(eliminar2);
		add(mostrar2);

		auxOpc2 = new JPanel();
		auxOpc2.setBounds(400, 80, 500, 500);
		auxOpc2.setBackground(Color.magenta);
		auxOpc2.setVisible(true);
		add(auxOpc2);
		
		
		// 
		
		agregar3 = new JButton("Agregar");
		agregar3.setBounds(420, 150, 200, 100);
		agregar3.setFont(new Font("Monospaced", Font.BOLD, 20));
		agregar3.setForeground(Color.white);
		agregar3.setBackground(Color.black);
		agregar3.setActionCommand("agregar3");

		eliminar3 = new JButton("Eliminar");
		eliminar3.setBounds(420, 400, 200, 100);
		eliminar3.setFont(new Font("Monospaced", Font.BOLD, 20));
		eliminar3.setForeground(Color.white);
		eliminar3.setBackground(Color.black);
		eliminar3.setActionCommand("eliminar3");

		modificar3 = new JButton("Modificar");
		modificar3.setBounds(680, 150, 200, 100);
		modificar3.setFont(new Font("Monospaced", Font.BOLD, 20));
		modificar3.setForeground(Color.white);
		modificar3.setBackground(Color.black);
		modificar3.setActionCommand("modificar3");

		mostrar3 = new JButton("Mostrar");
		mostrar3.setBounds(680, 400, 200, 100);
		mostrar3.setFont(new Font("Monospaced", Font.BOLD, 20));
		mostrar3.setForeground(Color.white);
		mostrar3.setBackground(Color.black);
		mostrar3.setActionCommand("mostrar3");

		backOpc3 = new JButton("BACK");
		backOpc3.setBounds(50, 550, 100, 30);
		backOpc3.setFont(new Font("Monospaced", Font.BOLD, 20));
		backOpc3.setForeground(Color.white);
		backOpc3.setBackground(Color.black);
		backOpc3.setActionCommand("backOpc3");
		add(backOpc3);

		e1 = new JLabel("Elija una opcion:");
		e1.setBounds(100, 250, 250, 50);
		e1.setFont(new Font("Monospaced", Font.BOLD, 20));
		e1.setForeground(Color.white);
		add(e1);

		add(modificar3);
		add(agregar3);
		add(eliminar3);
		add(mostrar3);

		auxOpc3 = new JPanel();
		auxOpc3.setBounds(400, 80, 500, 500);
		auxOpc3.setBackground(Color.yellow);
		auxOpc3.setVisible(false);
		add(auxOpc3);

	}

	/**
	 * @return the backOpc
	 */
	public JButton getBackOpc() {
		return backOpc;
	}

	/**
	 * @param backOpc the backOpc to set
	 */
	public void setBackOpc(JButton backOpc) {
		this.backOpc = backOpc;
	}

	/**
	 * @return the agregar
	 */
	public JButton getAgregar() {
		return agregar;
	}

	/**
	 * @param agregar the agregar to set
	 */
	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	/**
	 * @return the eliminar
	 */
	public JButton getEliminar() {
		return eliminar;
	}

	/**
	 * @param eliminar the eliminar to set
	 */
	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	/**
	 * @return the modificar
	 */
	public JButton getModificar() {
		return modificar;
	}

	/**
	 * @param modificar the modificar to set
	 */
	public void setModificar(JButton modificar) {
		this.modificar = modificar;
	}

	/**
	 * @return the mostrar
	 */
	public JButton getMostrar() {
		return mostrar;
	}

	/**
	 * @param mostrar the mostrar to set
	 */
	public void setMostrar(JButton mostrar) {
		this.mostrar = mostrar;
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
	 * @return the auxOpc
	 */
	public JPanel getAuxOpc() {
		return auxOpc;
	}

	/**
	 * @param auxOpc the auxOpc to set
	 */
	public void setAuxOpc(JPanel auxOpc) {
		this.auxOpc = auxOpc;
	}

	/**
	 * @return the auxOpc2
	 */
	public JPanel getAuxOpc2() {
		return auxOpc2;
	}

	/**
	 * @param auxOpc2 the auxOpc2 to set
	 */
	public void setAuxOpc2(JPanel auxOpc2) {
		this.auxOpc2 = auxOpc2;
	}

	/**
	 * @return the auxOpc3
	 */
	public JPanel getAuxOpc3() {
		return auxOpc3;
	}

	/**
	 * @param auxOpc3 the auxOpc3 to set
	 */
	public void setAuxOpc3(JPanel auxOpc3) {
		this.auxOpc3 = auxOpc3;
	}


}