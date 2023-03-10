package co.edu.unbosque.model;

import java.util.Random;

public class PokemonDTO {
	
	private int id, lvl, hp;
	private String apodo;
	private String nombre;
	private String tipo;
	private String ataque1;
	private String ataque2;
	private String ataque3;
	private String ataque4;

	private static final String[] ATAQUES_PRIMERA_GEN = { "Placaje", "Arañazo", "Látigo cepa", "Lanzallamas", "Trueno",
			"Rayo hielo", "Bomba lodo", "Terremoto", "Hiperrayo", "Hidro bomba", "Psíquico", "Ala de acero", "Corte",
			"Puño trueno", "Patada salto alta", "Rayo burbuja", "Golpe cuerpo", "Golpe cabeza", "Mordisco", "Llamarada",
			"Hidrochorro", "Pulso dragón", "Ataque aéreo", "Garra umbría", "Onda trueno", "Ciclón", "Doble patada",
			"Picotazo venenoso", "Danza espada", "Explosión" };

	public PokemonDTO(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
		this.id = id;
		this.apodo = apodo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.lvl = lvl;
		this.hp = hp;

		// Asignar 4 ataques aleatorios de la primera generación
		Random random = new Random();
		this.ataque1 = ATAQUES_PRIMERA_GEN[random.nextInt(ATAQUES_PRIMERA_GEN.length)];
		this.ataque2 = ATAQUES_PRIMERA_GEN[random.nextInt(ATAQUES_PRIMERA_GEN.length)];
		this.ataque3 = ATAQUES_PRIMERA_GEN[random.nextInt(ATAQUES_PRIMERA_GEN.length)];
		this.ataque4 = ATAQUES_PRIMERA_GEN[random.nextInt(ATAQUES_PRIMERA_GEN.length)];
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the apodo
	 */
	public String getApodo() {
		return apodo;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the lvl
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @return the ataque1
	 */
	public String getAtaque1() {
		return ataque1;
	}

	/**
	 * @return the ataque2
	 */
	public String getAtaque2() {
		return ataque2;
	}

	/**
	 * @return the ataque3
	 */
	public String getAtaque3() {
		return ataque3;
	}

	/**
	 * @return the ataque4
	 */
	public String getAtaque4() {
		return ataque4;
	}

}