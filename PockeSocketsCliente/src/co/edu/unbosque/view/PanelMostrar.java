/** Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
*/
package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

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

public class PanelMostrar extends JPanel {

	/**
	 * Atributo tipo String para las imagenes
	 */
	private String file_img = "Media/Mujer/1.jpg";
	/**
	 * Atributo tipo JComboBox que es una lista
	 */
	private JComboBox<String> pokeId;
	/**
	 * Atributo tipo String que es un arreglo con los pokemones
	 */
	private String pokemonId[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
			"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33",
			"34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51",
			"52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69",
			"70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87",
			"88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104",
			"105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119",
			"120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134",
			"135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149",
			"150", "151" };
	
	/**
	 * Atributo tipo JPanel para mostrar la imagen y las opciones
	 */
	private JPanel img, opciones;
	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel  nombre, apodo, tipo, vida, ataque, defensa, nivel, ataques, t1, t2, iconitos;
	/**
	 * Atributo tipo JTextField para que el usuario digite los requisitos que se le
	 * solicitan
	 */
	private JTextField tNombre;
	/**
	 * Atributo tipo JButton para el boton guardar
	 */
	private JButton atras, next, buscar, backMostrar;

	/**
	 * Metodo constructor
	 */
	public PanelMostrar() {

		setSize(1000, 650);
		setLayout(null);
		setBackground(new Color(108, 246, 248, 0));
//		setBackground(Color.pink);
		inicializarComponentes();

		imagen();
		setVisible(false);
	}

	/**
	 * Metodo para asignar las caracteristicas a cada atributo
	 */
	private void inicializarComponentes() {

		t1 = new JLabel("Escoja la ID de un");
		t1.setBounds(30, 30, 400, 25);
		t1.setBackground(new Color(108, 246, 248, 0));
		t1.setFont(new Font("cooper black", 0, 20));
		t1.setForeground(Color.black);
		t1.setVisible(true);
		add(t1);
		
		t2 = new JLabel("pokemon existente");
		t2.setBounds(30, 100, 400, 25);
		t2.setBackground(new Color(108, 246, 248, 0));
		t2.setFont(new Font("cooper black", 0, 20));
		t2.setForeground(Color.black);
		t2.setVisible(true);
		add(t2);

		backMostrar = new JButton("BACK");
		backMostrar.setBounds(50, 550, 150, 30);
		backMostrar.setFont(new Font("Monospaced", Font.BOLD, 20));
		backMostrar.setForeground(Color.black);
		backMostrar.setBackground(Color.LIGHT_GRAY);
		backMostrar.setActionCommand("backMostrar");
		add(backMostrar);
		
		pokeId = new JComboBox<String>(pokemonId);
		pokeId.setBounds(70, 210, 100, 25);
		pokeId.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(pokeId);
		
		atras = new JButton("atras");
		atras.setBounds(800, 500, 150, 30);
		atras.setBackground(Color.white);
		atras.setFont(new Font("cooper black", 3, 20));
		atras.setForeground(Color.black);
		atras.setFocusable(false);
		atras.setVisible(true);
		atras.setActionCommand("atras");
		add(atras);
		
		buscar = new JButton("buscar");
		buscar.setBounds(40, 300, 150, 30);
		buscar.setBackground(Color.white);
		buscar.setFont(new Font("cooper black", 3, 20));
		buscar.setForeground(Color.black);
		buscar.setFocusable(false);
		buscar.setVisible(true);
		buscar.setActionCommand("buscar");
		add(buscar);
		
		next = new JButton("next");
		next.setBounds(800, 450, 150, 30);
		next.setBackground(Color.white);
		next.setFont(new Font("cooper black", 3, 20));
		next.setForeground(Color.black);
		next.setFocusable(false);
		next.setVisible(true);
		next.setActionCommand("next");
		add(next);
		
		opciones = new JPanel();
		opciones.setBounds(0, 0, 230, 650);
		opciones.setBackground(Color.LIGHT_GRAY);
		opciones.setVisible(true);
		add(opciones);
		
		nombre = new JLabel("Nombre:");
		nombre.setBounds(320, 10, 150, 50);
		nombre.setFont(new Font("Monospaced", Font.BOLD, 15));
		nombre.setForeground(Color.white);
		add(nombre);

		apodo = new JLabel("Apodo:");
		apodo.setBounds(320, 80, 150, 50);
		apodo.setFont(new Font("Monospaced", Font.BOLD, 15));
		apodo.setForeground(Color.white);
		add(apodo);

		tipo = new JLabel("Tipo:");
		tipo.setBounds(320, 220, 250, 50);
		tipo.setFont(new Font("Monospaced", Font.BOLD, 15));
		tipo.setForeground(Color.white);
		add(tipo);

		vida = new JLabel("Vida:");
		vida.setBounds(320, 290, 250, 50);
		vida.setFont(new Font("Monospaced", Font.BOLD, 15));
		vida.setForeground(Color.white);
		add(vida);

		defensa = new JLabel("Defensa:");
		defensa.setBounds(320, 360, 150, 50);
		defensa.setFont(new Font("Monospaced", Font.BOLD, 15));
		defensa.setForeground(Color.white);
		add(defensa);

		ataque = new JLabel("Ataque:");
		ataque.setBounds(320, 430, 150, 50);
		ataque.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataque.setForeground(Color.white);
		add(ataque);

		nivel = new JLabel("Nivel:");
		nivel.setBounds(320, 500, 150, 50);
		nivel.setFont(new Font("Monospaced", Font.BOLD, 15));
		nivel.setForeground(Color.white);
		add(nivel);

		ataques = new JLabel("Ataques:");
		ataques.setBounds(500, 350, 250, 50);
		ataques.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataques.setForeground(Color.white);
		add(ataques);

		
	}

	/**
	 * Metodo que muestra la imagen en un JPanel 
	 */
	public void imagen() {
		
		iconitos = new JLabel();
		iconitos.setBounds(0, 0, 300, 470);
		ImageIcon imag1 = new ImageIcon(file_img);
		Icon icono = new ImageIcon(
				imag1.getImage().getScaledInstance(iconitos.getWidth(), iconitos.getHeight(), Image.SCALE_DEFAULT));
		iconitos.setIcon(icono);

		img = new JPanel();
		img.setBounds(500, 50, 300, 200);
		img.setBackground(Color.black);
		img.setVisible(true);
		img.add(iconitos);
		add(img);
		
	}
	
	/**
	 * @return the backMostrar
	 */
	public JButton getBackMostrar() {
		return backMostrar;
	}

	/**
	 * @param backMostrar the backMostrar to set
	 */
	public void setBackMostrar(JButton backMostrar) {
		this.backMostrar = backMostrar;
	}

	/**
	 * @return the atras
	 */
	public JButton getAtras() {
		return atras;
	}

	/**
	 * @param atras the atras to set
	 */
	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	/**
	 * El metodo get funciona para tomar o llamar el atributo
	 * 
	 * @return the tNombre
	 */
	public JTextField gettNombre() {
		return tNombre;
	}

	/**
	 * El metodo set funciona para actualizar el atributo
	 * 
	 * @param tNombre the tNombre to set
	 */
	public void settNombre(JTextField tNombre) {
		this.tNombre = tNombre;
	}

}
