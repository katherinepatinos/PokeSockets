package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

import co.edu.unbosque.model.persistence.FileHandler;

public class JugadorDAO {
	/**
	 *Listas de Pokemons en cajas y mano
	 * 
	 */
	  private ArrayList<JugadorDTO> caja1;
	    private ArrayList<JugadorDTO> caja2;
	    private ArrayList<JugadorDTO> caja3;
	    private ArrayList<JugadorDTO> mano;
	    
	    /**
	    *Constructor que inicializa la clase
	    *
	    */
		public JugadorDAO() {
			
			caja1 = new ArrayList<>();
			caja2 = new ArrayList<>();
			caja3 = new ArrayList<>();
			mano = new ArrayList<>();
			cargar1();
			cargar2();
			cargar3();
			cargar4();
		}
		
		/**
		 *Carga de los archivos serializados que guardan JugadorDTO
		 * 
		 */
		private void cargar1() {
			Object aux = FileHandler.readSerializable("caja1.dat");
			caja1 = (ArrayList<JugadorDTO>) aux;
		}
		private void cargar2() {
			Object aux = FileHandler.readSerializable("caja2.dat");
			caja2 = (ArrayList<JugadorDTO>) aux;
		}
		private void cargar3() {
			Object aux = FileHandler.readSerializable("caja3.dat");
			caja3 = (ArrayList<JugadorDTO>) aux;
		}
		private void cargar4() {
			Object aux = FileHandler.readSerializable("caja4.dat");
			mano = (ArrayList<JugadorDTO>) aux;
		}
		
		/**
		 *Metodo encargado de agregar pokemons con todas las variables de la clase, luego guardar y cargar el serializado
		 *
		 */
		
		public void agregarPokemon1(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
			JugadorDTO aux = new JugadorDTO(id, apodo, nombre, tipo, lvl, hp);
			caja1.add(aux);
			FileHandler.writeSerializable(caja1, "caja1.dat");
			cargar1();
	    }
		public void agregarPokemon2(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
			JugadorDTO aux = new JugadorDTO(id, apodo, nombre, tipo, lvl, hp);
			caja2.add(aux);
			FileHandler.writeSerializable(caja2, "caja2.dat");
			cargar2();
	    }
		public void agregarPokemon3(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
			JugadorDTO aux = new JugadorDTO(id, apodo, nombre, tipo, lvl, hp);
			caja3.add(aux);
			FileHandler.writeSerializable(caja3, "caja3.dat");
			cargar3();
	    }
		public void agregarPokemonMano(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
			JugadorDTO aux = new JugadorDTO(id, apodo, nombre, tipo, lvl, hp);
			mano.add(aux);
			FileHandler.writeSerializable(mano, "caja4.dat");
			cargar4();
	    }
		
		/**
		 *Metodo encargado de imprimir todos los pokemons recorriendo toda la lista
		 * 
		 */
		   public String imprimir1() {
		    	String res = "";
		        for (JugadorDTO pokemon : caja1) {
		           res+= "ID: " + pokemon.getId()+"\n"+
		            "Apodo: " + pokemon.getApodo()+"\n"+
		            "Nombre: " + pokemon.getNombre()+"\n"+
		            "Tipo: " + pokemon.getTipo()+"\n"+
		            "Nivel: " + pokemon.getLvl()+"\n"+
		           "HP: " + pokemon.getHp()+"\n"+
		            "Ataque 1: " + pokemon.getAtaque1()+"\n"+
		            "Ataque 2: " + pokemon.getAtaque2()+"\n"+
		            "Ataque 3: " + pokemon.getAtaque3()+"\n"+
		            "Ataque 4: " + pokemon.getAtaque4()+"\n"+
		           "-------------------------------"+"\n";
		        }
		        return res;
		    }
		   
		   public String imprimir2() {
		    	String res = "";
		        for (JugadorDTO pokemon : caja2) {
		           res+= "ID: " + pokemon.getId()+"\n"+
		            "Apodo: " + pokemon.getApodo()+"\n"+
		            "Nombre: " + pokemon.getNombre()+"\n"+
		            "Tipo: " + pokemon.getTipo()+"\n"+
		            "Nivel: " + pokemon.getLvl()+"\n"+
		           "HP: " + pokemon.getHp()+"\n"+
		            "Ataque 1: " + pokemon.getAtaque1()+"\n"+
		            "Ataque 2: " + pokemon.getAtaque2()+"\n"+
		            "Ataque 3: " + pokemon.getAtaque3()+"\n"+
		            "Ataque 4: " + pokemon.getAtaque4()+"\n"+
		           "-------------------------------"+"\n";
		        }
		        return res;
		    }
		   
		   public String imprimir3() {
		    	String res = "";
		        for (JugadorDTO pokemon : caja3) {
		           res+= "ID: " + pokemon.getId()+"\n"+
		            "Apodo: " + pokemon.getApodo()+"\n"+
		            "Nombre: " + pokemon.getNombre()+"\n"+
		            "Tipo: " + pokemon.getTipo()+"\n"+
		            "Nivel: " + pokemon.getLvl()+"\n"+
		           "HP: " + pokemon.getHp()+"\n"+
		            "Ataque 1: " + pokemon.getAtaque1()+"\n"+
		            "Ataque 2: " + pokemon.getAtaque2()+"\n"+
		            "Ataque 3: " + pokemon.getAtaque3()+"\n"+
		            "Ataque 4: " + pokemon.getAtaque4()+"\n"+
		           "-------------------------------"+"\n";
		        }
		        return res;
		    }
		   
		   public String imprimirMano() {
		    	String res = "";
		        for (JugadorDTO pokemon : mano) {
		           res+= "ID: " + pokemon.getId()+"\n"+
		            "Apodo: " + pokemon.getApodo()+"\n"+
		            "Nombre: " + pokemon.getNombre()+"\n"+
		            "Tipo: " + pokemon.getTipo()+"\n"+
		            "Nivel: " + pokemon.getLvl()+"\n"+
		           "HP: " + pokemon.getHp()+"\n"+
		            "Ataque 1: " + pokemon.getAtaque1()+"\n"+
		            "Ataque 2: " + pokemon.getAtaque2()+"\n"+
		            "Ataque 3: " + pokemon.getAtaque3()+"\n"+
		            "Ataque 4: " + pokemon.getAtaque4()+"\n"+
		           "-------------------------------"+"\n";
		        }
		        return res;
		    }
		   /**
		   *
		   * Metodo encargado de eliminar pokemons pidiendo la id, haciendo un recorrido a la lista, modificando una lista auxiliar y eliminando estos datos de la lista original
		   */
		   public String eliminar1(int id) {
			   String res = "";
			    List<JugadorDTO> elementosAEliminar = new ArrayList<>();
			    for (JugadorDTO s : caja1) {
			        if (id == s.getId()) {
			            elementosAEliminar.add(s);
			            res = "Usuario eliminado!";
			        }
			    }
			    caja1.removeAll(elementosAEliminar);
			    if (res.isEmpty()) {
			        res = "Usuario no encontrado";
			    }
			    FileHandler.writeSerializable(caja1, "caja1.dat");
			    cargar1();
			    return res;
			    }
		   public String eliminar2(int id) {
			   String res = "";
			    List<JugadorDTO> elementosAEliminar = new ArrayList<>();
			    for (JugadorDTO s : caja2) {
			        if (id == s.getId()) {
			            elementosAEliminar.add(s);
			            res = "Usuario eliminado!";
			        }
			    }
			    caja2.removeAll(elementosAEliminar);
			    if (res.isEmpty()) {
			        res = "Usuario no encontrado";
			    }
			    FileHandler.writeSerializable(caja2, "caja2.dat");
			    cargar2();
			    return res;
			    }

			public String eliminar3(int id) {
				String res = "";
			    List<JugadorDTO> elementosAEliminar = new ArrayList<>();
			    for (JugadorDTO s : caja3) {
			        if (id == s.getId()) {
			            elementosAEliminar.add(s);
			            res = "Usuario eliminado!";
			        }
			    }
			    caja3.removeAll(elementosAEliminar);
			    if (res.isEmpty()) {
			        res = "Usuario no encontrado";
			    }
			    FileHandler.writeSerializable(caja3, "caja3.dat");
			    cargar3();
			    return res;
			}

			public String eliminarMano(int id) {
				String res = "";
			    List<JugadorDTO> elementosAEliminar = new ArrayList<>();
			    for (JugadorDTO s : mano) {
			        if (id == s.getId()) {
			            elementosAEliminar.add(s);
			            res = "Usuario eliminado!";
			        }
			    }
			    mano.removeAll(elementosAEliminar);
			    if (res.isEmpty()) {
			        res = "Usuario no encontrado";
			    }
			    FileHandler.writeSerializable(mano, "caja4.dat");
			    cargar1();
			    return res;
			}
}
