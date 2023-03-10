package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.JugadorDAO;
import co.edu.unbosque.model.PokemonDAO;

import co.edu.unbosque.view.Vista;

public class Controller{

	private Vista vs;
	private PokemonDAO pk;
	private JugadorDAO jg;
	private Server server;
	
	public Controller() {

		vs = new Vista();
		pk = new PokemonDAO();
		jg = new JugadorDAO();
		server = new Server(9669);
		server.startServer();
		inicializar();
	}
	private void inicializar() {
		int opcion = -1;
		while (opcion != 0) {
			vs.imprimir("=== Menu ===");
		    vs.imprimir("1. Clinica Pokemon");
		    vs.imprimir("2. Todos los Pokemons");
		    vs.imprimir("0. Salir");
		    
		    opcion = vs.leerInt();

		    switch (opcion) {
		        case 1:
		        	clinica();
		            break;
		        case 2:
		        	pokemons();
		            break;
		        default:
		        	vs.imprimir("Cerrando");
		            break;
		    }
			
			
			
		}
	
	}
	private void clinica() {

	    int opcion3 = -1;

	    while (opcion3!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Caja1");
	        vs.imprimir("2. caja2");;
	        vs.imprimir("3. caja3");
	        vs.imprimir("4. Mano");
	        vs.imprimir("0. Volver");
	        opcion3 = vs.leerInt();
	        switch (opcion3) {
	            case 1:
	                caja1();
	                break;
	            case 2:
	            	caja2();
	                break;
	            case 3:
	            	caja3();
	                break;
	            case 4:
	            	caja4();
	            	break;
	            default:
	                break;
	        }
	    }
	
	}
	private void caja4() {

	    int opcion3 = -1;

	    while (opcion3!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Ver Todos los Pokemon");
	        vs.imprimir("2. Eliminar un Pokemon");;
	        vs.imprimir("3. Agregar un pokemon");
	        vs.imprimir("0. Volver");
	        opcion3 = vs.leerInt();
	        switch (opcion3) {
	            case 1:
	                vs.imprimir(jg.imprimirMano());
	                break;
	            case 2:
	            	vs.imprimir("Ingrese una id a eliminar:");
	            	int id= vs.leerInt();
	            	jg.eliminarMano(id);
	            	vs.imprimir("Pokemon eliminado");
	                break;
	            case 3:
	            	vs.imprimir("Ingrese una id:");
	            	int id2 = vs.leerInt();
	            	vs.imprimir("Ingrese un apodo:");
	            	String apodo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un nombre:");
	            	String nombre = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un tipo:");
	            	String tipo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un lvl:");
	            	int lvl = vs.leerInt();
	            	vs.imprimir("Ingrese un hp:");
	            	int hp = vs.leerInt();
	            	jg.agregarPokemonMano(id2, apodo, nombre, tipo, lvl, hp);
	                break;
	          
	            default:
	                break;
	        }}
	}
	private void caja3() {

	    int opcion3 = -1;

	    while (opcion3!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Ver Todos los Pokemon");
	        vs.imprimir("2. Eliminar un Pokemon");;
	        vs.imprimir("3. Agregar un pokemon");
	        vs.imprimir("0. Volver");
	        opcion3 = vs.leerInt();
	        switch (opcion3) {
	            case 1:
	                vs.imprimir(jg.imprimir3());
	                break;
	            case 2:
	            	vs.imprimir("Ingrese una id a eliminar:");
	            	int id= vs.leerInt();
	            	jg.eliminar3(id);
	            	vs.imprimir("Pokemon eliminado");
	                break;
	            case 3:
	            	vs.imprimir("Ingrese una id:");
	            	int id2 = vs.leerInt();
	            	vs.imprimir("Ingrese un apodo:");
	            	String apodo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un nombre:");
	            	String nombre = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un tipo:");
	            	String tipo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un lvl:");
	            	int lvl = vs.leerInt();
	            	vs.imprimir("Ingrese un hp:");
	            	int hp = vs.leerInt();
	            	jg.agregarPokemon3(id2, apodo, nombre, tipo, lvl, hp);
	                break;
	          
	            default:
	                break;
	        }}
	}
	private void caja2() {

	    int opcion3 = -1;

	    while (opcion3!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Ver Todos los Pokemon");
	        vs.imprimir("2. Eliminar un Pokemon");;
	        vs.imprimir("3. Agregar un pokemon");
	        vs.imprimir("0. Volver");
	        opcion3 = vs.leerInt();
	        switch (opcion3) {
	            case 1:
	                vs.imprimir(jg.imprimir2());
	                break;
	            case 2:
	            	vs.imprimir("Ingrese una id a eliminar:");
	            	int id= vs.leerInt();
	            	jg.eliminar2(id);
	            	vs.imprimir("Pokemon eliminado");
	                break;
	            case 3:
	            	vs.imprimir("Ingrese una id:");
	            	int id2 = vs.leerInt();
	            	vs.imprimir("Ingrese un apodo:");
	            	String apodo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un nombre:");
	            	String nombre = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un tipo:");
	            	String tipo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un lvl:");
	            	int lvl = vs.leerInt();
	            	vs.imprimir("Ingrese un hp:");
	            	int hp = vs.leerInt();
	            	jg.agregarPokemon2(id2, apodo, nombre, tipo, lvl, hp);
	                break;
	          
	            default:
	                break;
	        }}
	}
	private void caja1() {

	    int opcion3 = -1;

	    while (opcion3!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Ver Todos los Pokemon");
	        vs.imprimir("2. Eliminar un Pokemon");;
	        vs.imprimir("3. Agregar un pokemon");
	        vs.imprimir("0. Volver");
	        opcion3 = vs.leerInt();
	        switch (opcion3) {
	            case 1:
	                vs.imprimir(jg.imprimir1());
	                break;
	            case 2:
	            	vs.imprimir("Ingrese una id a eliminar:");
	            	int id= vs.leerInt();
	            	jg.eliminar1(id);
	            	vs.imprimir("Pokemon eliminado");
	                break;
	            case 3:
	            	vs.imprimir("Ingrese una id:");
	            	int id2 = vs.leerInt();
	            	vs.imprimir("Ingrese un apodo:");
	            	String apodo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un nombre:");
	            	String nombre = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un tipo:");
	            	String tipo = vs.leerString();
	            	vs.leerString();
	            	vs.imprimir("Ingrese un lvl:");
	            	int lvl = vs.leerInt();
	            	vs.imprimir("Ingrese un hp:");
	            	int hp = vs.leerInt();
	            	jg.agregarPokemon1(id2, apodo, nombre, tipo, lvl, hp);
	                break;
	          
	            default:
	                break;
	        }
	    }
	
	}
	private void pokemons() {
	    int opcion2 = -1;

	    while (opcion2!=0) {
	        vs.imprimir("=== Menu ===");
	        vs.imprimir("1. Ver todos los pokemons");
	        vs.imprimir("2. ver un solo pokemon");;
	        vs.imprimir("0. Volver");
	        opcion2 = vs.leerInt();
	        switch (opcion2) {
	            case 1:
	                vs.imprimir(pk.imprimirLista());
	                break;
	            case 2:
	                vs.imprimir("Ingrese un ID:");
	                int id = vs.leerInt();
	                vs.imprimir(pk.imprimirPokemonPorId(id));
	                break;
	            default:
	                break;
	        }
	    }
	}
	
	public void metodos() {
		
		if(server.getClient().getRecibido().equals("eliminar")) {
			
			int id = Integer.parseInt(server.getClient().getRecibido());
			server.getClient().enviar(jg.eliminar1(id));
		}
	}
}
