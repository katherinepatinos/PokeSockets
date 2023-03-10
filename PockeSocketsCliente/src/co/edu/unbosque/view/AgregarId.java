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

public class AgregarId extends JPanel {

	/**
	 * 
	 */
	private JPanel opciones, nuevoPokemon, idPokemon, img;
	/**
	 * Atributo tipo JLabel que indica lo que debera ingresar el usuario
	 */
	private JLabel id, nombre, apodo, tipo, vida, ataque, defensa, nivel, ataques, t1, t2, iconitos;
	/**
	 * Atributo tipo JTextField para que el usuario digite los requisitos que se le
	 * solicitan
	 */
	private JTextField tApodo;
	/**
	 * Atributo tipo JButton para el boton guardar
	 */
	private JButton guardar, nuevo, buscar, backAgre, agregar;
	/**
	 * Atributo tipo JComboBox para la fecha de nacimiento y estado
	 */
	private JComboBox<String> pokeId;
	/**
	 * Atributo tipo String que es una lista con las opciones de a�os
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

	private String file_img = "Media/Mujer/1.jpg";
	
	/**
	 * Metodo constructor
	 */
	public AgregarId() {

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

		pokeId = new JComboBox<String>(pokemonId);
		pokeId.setBounds(70, 210, 100, 25);
		pokeId.setFont(new Font("Monospaced", Font.BOLD, 15));
		add(pokeId);

		agregar = new JButton("Agregar");
		agregar.setBounds(320, 500, 150, 50);
		agregar.setBackground(Color.white);
		agregar.setFont(new Font("Monospaced", 3, 20));
		agregar.setForeground(Color.black);
		agregar.setFocusable(false);
		agregar.setVisible(true);
		agregar.setActionCommand("btnagregar");
		add(agregar);
		
		buscar = new JButton("Buscar");
		buscar.setBounds(50, 315, 150, 30);
		buscar.setBackground(Color.white);
		buscar.setFont(new Font("Monospaced", 3, 20));
		buscar.setForeground(Color.black);
		buscar.setFocusable(false);
		buscar.setVisible(true);
		buscar.setActionCommand("buscar");
		add(buscar);

		backAgre = new JButton("BACK");
		backAgre.setBounds(50, 550, 150, 30);
		backAgre.setFont(new Font("Monospaced", Font.BOLD, 20));
		backAgre.setForeground(Color.black);
		backAgre.setBackground(Color.white);
		backAgre.setActionCommand("backAgre");
		add(backAgre);

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
		ataque.setBounds(600, 290, 150, 50);
		ataque.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataque.setForeground(Color.white);
		add(ataque);

		nivel = new JLabel("Nivel:");
		nivel.setBounds(600, 360, 150, 50);
		nivel.setFont(new Font("Monospaced", Font.BOLD, 15));
		nivel.setForeground(Color.white);
		add(nivel);

		ataques = new JLabel("Ataques:");
		ataques.setBounds(600, 430, 250, 50);
		ataques.setFont(new Font("Monospaced", Font.BOLD, 15));
		ataques.setForeground(Color.white);
		add(ataques);
		
		
	}
	
	/**
	 * Metodo encargado de crear un panel con la imagen del pokemon en su interior
	 */
	public void imagen() {
		
		iconitos = new JLabel();
		iconitos.setBounds(0, 0, 300, 470);
		ImageIcon imag1 = new ImageIcon(file_img);
		Icon icono = new ImageIcon(
				imag1.getImage().getScaledInstance(iconitos.getWidth(), iconitos.getHeight(), Image.SCALE_DEFAULT));
		iconitos.setIcon(icono);
		
		img = new JPanel();
		img.setBounds(550, 30, 300, 200);
		img.setBackground(Color.black);
		img.setVisible(true);
		img.add(iconitos);
		add(img);
		
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
	 * @return the nuevoPokemon
	 */
	public JPanel getNuevoPokemon() {
		return nuevoPokemon;
	}

	/**
	 * @param nuevoPokemon the nuevoPokemon to set
	 */
	public void setNuevoPokemon(JPanel nuevoPokemon) {
		this.nuevoPokemon = nuevoPokemon;
	}

	/**
	 * @return the idPokemon
	 */
	public JPanel getIdPokemon() {
		return idPokemon;
	}

	/**
	 * @param idPokemon the idPokemon to set
	 */
	public void setIdPokemon(JPanel idPokemon) {
		this.idPokemon = idPokemon;
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
	 * @return the pokeId
	 */
	public JComboBox<String> getPokeId() {
		return pokeId;
	}

	/**
	 * @param pokeId the pokeId to set
	 */
	public void setPokeId(JComboBox<String> pokeId) {
		this.pokeId = pokeId;
	}

	/**
	 * @return the agregar
	 */
	public JButton getAgregar() {
		return agregar;
	}


	
}
