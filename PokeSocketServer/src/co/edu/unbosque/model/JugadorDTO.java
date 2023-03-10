package co.edu.unbosque.model;

import java.io.Serializable;
import java.util.Random;

public class JugadorDTO implements Serializable{
    private int id;
    private String apodo;
    private String nombre;
    private String tipo;
    private int lvl;
    private int hp;
    private String ataque1;
    private String ataque2;
    private String ataque3;
    private String ataque4;
    
    private static final String[] ATAQUES_PRIMERA_GEN = {
            "Placaje",
            "Arañazo",
            "Látigo cepa",
            "Lanzallamas",
            "Trueno",
            "Rayo hielo",
            "Bomba lodo",
            "Terremoto",
            "Hiperrayo",
            "Hidro bomba",
            "Psíquico",
            "Ala de acero",
            "Corte",
            "Puño trueno",
            "Patada salto alta",
            "Rayo burbuja",
            "Golpe cuerpo",
            "Golpe cabeza",
            "Mordisco",
            "Llamarada",
            "Hidrochorro",
            "Pulso dragón",
            "Ataque aéreo",
            "Garra umbría",
            "Onda trueno",
            "Ciclón",
            "Doble patada",
            "Picotazo venenoso",
            "Danza espada",
            "Explosión"
    };
    
    public JugadorDTO(int id, String apodo, String nombre, String tipo, int lvl, int hp) {
    	
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

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getAtaque1() {
		return ataque1;
	}

	public void setAtaque1(String ataque1) {
		this.ataque1 = ataque1;
	}

	public String getAtaque2() {
		return ataque2;
	}

	public void setAtaque2(String ataque2) {
		this.ataque2 = ataque2;
	}

	public String getAtaque3() {
		return ataque3;
	}

	public void setAtaque3(String ataque3) {
		this.ataque3 = ataque3;
	}

	public String getAtaque4() {
		return ataque4;
	}

	public void setAtaque4(String ataque4) {
		this.ataque4 = ataque4;
	}

	public static String[] getAtaquesPrimeraGen() {
		return ATAQUES_PRIMERA_GEN;
	}
    }