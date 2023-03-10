/**
* Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
*/
package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel con las opciones de genero extiende de JPanel
 */

public class PanelGenero extends JPanel {

	/**
	 * Atributo tipo JLabel que muestra las imagenes
	 */
	private JLabel imgH, imgM;


	/**
	 * Metodo constructor
	 */

	public PanelGenero() {

		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.pink);
		inicializarComponentes();

	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	
	private void inicializarComponentes() {
		// TODO Auto-generated method stub

		imgH = new JLabel();
		imgH.setBounds(0, 0, 150, 400);
		ImageIcon imag1 = new ImageIcon("Media/AvatarChico.png");
		Icon icono = new ImageIcon(
				imag1.getImage().getScaledInstance(imgH.getWidth(), imgH.getHeight(), Image.SCALE_DEFAULT));
		imgH.setIcon(icono);
		imgH.setVisible(false);
		add(imgH);
		
		imgM = new JLabel();
		imgM.setBounds(0, 0, 150, 400);
		ImageIcon imag2 = new ImageIcon("Media/AvatarChica.png");
		Icon icono2 = new ImageIcon(
				imag2.getImage().getScaledInstance(imgM.getWidth(), imgH.getHeight(), Image.SCALE_DEFAULT));
		imgM.setIcon(icono2);
		imgH.setVisible(false);
		add(imgM);

	}

	/**
	 * @return the imgH
	 */
	public JLabel getImgH() {
		return imgH;
	}

	/**
	 * @param imgH the imgH to set
	 */
	public void setImgH(JLabel imgH) {
		this.imgH = imgH;
	}

	/**
	 * @return the imgM
	 */
	public JLabel getImgM() {
		return imgM;
	}

	/**
	 * @param imgM the imgM to set
	 */
	public void setImgM(JLabel imgM) {
		this.imgM = imgM;
	}



}
