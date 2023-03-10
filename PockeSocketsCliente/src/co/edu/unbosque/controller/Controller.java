/**
 * Paquete que pertenece al controlador que gestiona la vista con el modelo
 */
package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.WindowConstants;

import co.edu.unbosque.model.*;
import co.edu.unbosque.view.*;

/**
 * Clase que se encarga de controlar la logica del programa
 */

public class Controller implements ActionListener {

	private Cliente cl;
	public Vista vista;

	/**
	 * Metodo constructor
	 */
	public Controller() {

		cl = new Cliente(9669);
		
		vista = new Vista();
		asignarOyentes();
	}

	/**
	 * Se le asignan las funciones a cada boton
	 */
	private void asignarOyentes() {

		vista.getVp().getP1().getInicio().addActionListener(this);
		vista.getVp().getPcajas().getCaja1().addActionListener(this);
		vista.getVp().getPcajas().getCaja2().addActionListener(this);
		vista.getVp().getPcajas().getCaja3().addActionListener(this);

		vista.getVp().getPopciones().getAgregar().addActionListener(this);
		vista.getVp().getPopciones().getModificar().addActionListener(this);
		vista.getVp().getPopciones().getMostrar().addActionListener(this);
		vista.getVp().getPopciones().getEliminar().addActionListener(this);

		vista.getVp().getPaggid().getBackAgre().addActionListener(this);
		vista.getVp().getPaggnuevo().getBackAgre().addActionListener(this);
		vista.getVp().getPopciones().getBackOpc().addActionListener(this);

		vista.getVp().getPmostrar().getAtras().addActionListener(this);
		vista.getVp().getPmostrar().getBackMostrar().addActionListener(this);
		vista.getVp().getPaggid().getBuscar().addActionListener(this);
		vista.getVp().getPaggid().getAgregar().addActionListener(this);
		vista.getVp().getPaggnuevo().getGuardar().addActionListener(this);

	}

	/**
	 * Metodo encargado de accionar los comandos
	 */

	public void actionPerformed(ActionEvent e) {

		String comando = e.getActionCommand();
		cl.enivarComando(comando);

		if (comando.equals("iniciar")) {

			vista.getVp().getP1().setVisible(false);
			int dato = vista.getJuju().mostrarOpcGenero("Seleccione su genero:");

			if (dato == 0) {
				vista.getVp().getPgenero().getImgH().setVisible(false);
				vista.getVp().getPgenero().getImgM().setVisible(true);

			} else if (dato == 1) {
				vista.getVp().getPgenero().getImgH().setVisible(true);
				vista.getVp().getPgenero().getImgM().setVisible(false);
			}
			
			vista.getVp().getPcajas().setVisible(true);
			vista.getVp().getPmano().setVisible(true);
			vista.getVp().getPgenero().setVisible(true);
		}

		if (comando.equals("caja1")) {

			vista.getVp().getPcajas().setVisible(false);
			vista.getVp().getPmano().setVisible(false);
			vista.getVp().getPgenero().setVisible(false);

			vista.getVp().getPopciones().setVisible(true);
			vista.getVp().getPopciones().getAuxOpc().setVisible(true);
		}

		if (comando.equals("caja2")) {

			vista.getVp().getPcajas().setVisible(false);
			vista.getVp().getPmano().setVisible(false);
			vista.getVp().getPgenero().setVisible(false);

			vista.getVp().getPopciones().setVisible(true);
			vista.getVp().getPopciones().getAuxOpc2().setVisible(true);
		}

		if (comando.equals("caja3")) {

			vista.getVp().getPcajas().setVisible(false);
			vista.getVp().getPmano().setVisible(false);
			vista.getVp().getPgenero().setVisible(false);

			vista.getVp().getPopciones().setVisible(true);
			vista.getVp().getPopciones().getAuxOpc3().setVisible(true);
		}

		if (comando.equals("backAgreNuevo")) {

			vista.getVp().getPaggnuevo().setVisible(false);
			vista.getVp().getPopciones().setVisible(true);
		}

		if (comando.equals("backMostrar")) {

			vista.getVp().getPmostrar().setVisible(false);
			vista.getVp().getPopciones().setVisible(true);
		}

		if (comando.equals("backOpc")) {

			vista.getVp().getPopciones().setVisible(false);
			vista.getVp().getPopciones().getAuxOpc().setVisible(false);
			vista.getVp().getPopciones().getAuxOpc2().setVisible(false);
			vista.getVp().getPopciones().getAuxOpc3().setVisible(false);
			
			vista.getVp().getPcajas().setVisible(true);
			vista.getVp().getPmano().setVisible(true);
			vista.getVp().getPgenero().setVisible(true);
	

		}

		if (comando.equals("backAgre")) {

			vista.getVp().getPaggid().setVisible(false);
			vista.getVp().getPopciones().setVisible(true);
		}

		if (comando.equals("agregar")) {

			
			vista.getVp().getPopciones().setVisible(false);

			int dato = vista.getJuju().mostrarOpcAgg("Seleccione la manera que desee para agregar un pokemon:");

			if (dato == 0) {
				vista.getVp().getPaggnuevo().setVisible(false);
				vista.getVp().getPaggid().setVisible(true);
				

			} else if (dato == 1) {
					vista.getVp().getPaggid().setVisible(false);
				vista.getVp().getPaggnuevo().setVisible(true);
			
			}
		
			if(comando.equals("btnagregar")) {
				
				String lista = vista.getVp().getPaggid().getPokeId().getSelectedItem().toString();
				cl.enivarComando(lista);
				cl.recibirMsj();
			}

			if(comando.equals("guardarnuevopoke")) {
				
				String name = vista.getVp().getPaggnuevo().gettNombre().getText();
				String apodo = vista.getVp().getPaggnuevo().gettApodo().getText();
				String tipo = vista.getVp().getPaggnuevo().gettTipo().getText();
				String lvl = vista.getVp().getPaggnuevo().gettNivel().getText();
				String hp = vista.getVp().getPaggnuevo().gettNivel().getText();
				
				cl.enivarComando(apodo + ";" + name + ";" + tipo + ";" + lvl + ";" + hp);
				
				cl.recibirMsj();
			}
		}

		if (comando.equals("eliminar")) {
			

			String id = vista.juju.mostrarEliminar("Ingrese el ID del pokemon que desea eliminar");
			cl.enivarComando(id);
			cl.recibirMsj(); 
		}

		if (comando.equals("modificar")) {
//			vista.juju.mostrarDialogo("Ingrese el ID que desea modificar");
			String id = vista.juju.mostrarModificar("Ingrese el ID del pokemon que desea modificar");
			cl.enivarComando(id);
			cl.recibirMsj();
		}

		if (comando.equals("mostrar")) {

			vista.getVp().getPcajas().setVisible(false);
			vista.getVp().getPmano().setVisible(false);
			vista.getVp().getPgenero().setVisible(false);
			vista.getVp().getPopciones().setVisible(false);
//			vista.getVp().getPagregar().setVisible(true);

			vista.getVp().getPmostrar().setVisible(true);
		}
		
	}
}