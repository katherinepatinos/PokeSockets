/** Paquete que pertenece a la vista el cual gestiona la interfaz grafica 
*/
package co.edu.unbosque.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Ventana que gestiona los JOptionPane
 * 
 */
public class Juju {

	/**
	 * Atributo tipo String con las opciones del JOptionPane
	 */
	private String[] opc = { "Mujer", "Hombre" };
	/**
	 * Atributo tipo String con las opciones del JOptionPane
	 */

	private String[] agg = { "Existente por ID", "Uno nuevo desde cero" };

	/**
	 * Metodo encargado de leer un dato tipo double
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return dato double leido
	 */

	public int leerDato(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Informacion", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Advertencia", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Ventana de Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public String mostrarEliminar(String mensaje) {
		String id = JOptionPane.showInputDialog(null, mensaje, "Oyeeeee", 0, new ImageIcon("Media/Eliminar.png"), null, mensaje).toString();
		
		return id;
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * 
	 */

	public String mostrarModificar(String mensaje) {
		String id = JOptionPane.showInputDialog(null, mensaje, "Oyeeeee", 0, new ImageIcon("Media/Modificar.png"), null, mensaje).toString();
	
		return id;
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */

	public int mostrarOpcGenero(String mensaje) {
		return JOptionPane.showOptionDialog(null, mensaje, "Wait...", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE, new ImageIcon("Media/Genero.png"), opc, opc[0]);
	}

	/**
	 * Metodo que se encarga de mostrar el mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return Mensaje por medio del JOptionPane
	 */
	public int mostrarOpcAgg(String mensaje) {
		return JOptionPane.showOptionDialog(null, mensaje, "Wait...", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.WARNING_MESSAGE, new ImageIcon(), agg, agg[0]);
	}

	/**
	 * Metodo que se encarga de recibir un mensaje ingresado por medio de un
	 * JOptionPane
	 * 
	 * @param mensaje Mensaje que contiene la informacion del dato solicitado
	 * @return aux variable tipo String
	 */

	public String mostrarDialogo(String mensaje) {
		String aux = JOptionPane.showInputDialog(null, mensaje, "");
		return aux;
	}

	
}
