package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.List;

public class PokemonDAO {
    private List<PokemonDTO> listaPokemon;
    
    public PokemonDAO() {
        listaPokemon = new ArrayList<>();
        inicializarLista();
    }
    
    private void inicializarLista() {
        agregarPokemon(new PokemonDTO(1, "Bulbasaur", "Bulbasaur", "Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(2, "Ivysaur", "Ivysaur", "Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(3, "Venusaur", "Venusaur", "Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(4, "Charmander", "Charmander", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(5, "Charmeleon", "Charmeleon", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(6, "Charizard", "Charizard", "Fuego/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(7, "Squirtle", "Squirtle", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(8, "Wartortle", "Wartortle", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(9, "Blastoise", "Blastoise", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(10, "Caterpie", "Caterpie", "Bicho", 100, 2000));
        agregarPokemon(new PokemonDTO(11, "Metapod", "Metapod", "Bicho", 100, 2000));
        agregarPokemon(new PokemonDTO(12, "Butterfree", "Butterfree", "Bicho/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(13, "Weedle", "Weedle", "Bicho/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(14, "Kakuna", "Kakuna", "Bicho/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(15, "Beedrill", "Beedrill", "Bicho/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(16, "Pidgey", "Pidgey", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(17, "Pidgeotto", "Pidgeotto", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(18, "Pidgeot", "Pidgeot", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(19, "Rattata", "Rattata", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(20, "Raticate", "Raticate", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(21, "Spearow", "Spearow", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(22, "Fearow", "Fearow", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(23, "Ekans", "Ekans", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(24, "Arbok", "Arbok", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(25, "Pikachu", "Pikachu", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(26, "Raichu", "Raichu", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(27, "Sandshrew", "Sandshrew", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(28, "Sandslash", "Sandslash", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(29, "Nidoran♀", "Nidoran♀", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(30, "Nidorina", "Nidorina", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(31, "Nidoqueen", "Nidoqueen", "Veneno/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(32, "Nidoran♂", "Nidoran♂", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(33, "Nidorino", "Nidorino", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(34, "Nidoking", "Nidoking", "Veneno/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(35, "Clefairy", "Clefairy", "Hada", 100, 2000));
        agregarPokemon(new PokemonDTO(36, "Clefable", "Clefable", "Hada", 100, 2000));
        agregarPokemon(new PokemonDTO(37, "Vulpix", "Vulpix", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(38, "Ninetales", "Ninetales", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(39, "Jigglypuff", "Jigglypuff", "Normal/Hada", 100, 2000));
        agregarPokemon(new PokemonDTO(40, "Wigglytuff", "Wigglytuff", "Normal/Hada", 100, 2000));
        agregarPokemon(new PokemonDTO(41, "Zubat", "Zubat", "Veneno/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(42, "Golbat", "Golbat", "Veneno/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(43, "Oddish", "Oddish", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(44, "Gloom", "Gloom", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(45, "Vileplume", "Vileplume", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(46, "Paras", "Paras", "Bicho/Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(47, "Parasect", "Parasect", "Bicho/Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(48, "Venonat", "Venonat", "Bicho/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(49, "Venomoth", "Venomoth", "Bicho/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(50, "Diglett", "Diglett", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(51, "Dugtrio", "Dugtrio", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(52, "Meowth", "Meowth", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(53, "Persian", "Persian", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(54, "Psyduck", "Psyduck", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(55, "Golduck", "Golduck", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(56, "Mankey", "Mankey", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(57, "Primeape", "Primeape", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(58, "Growlithe", "Growlithe", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(59, "Arcanine", "Arcanine", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(60, "Poliwag", "Poliwag", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(61, "Poliwhirl", "Poliwhirl", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(62, "Poliwrath", "Poliwrath", "Agua/Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(63, "Abra", "Abra", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(64, "Kadabra", "Kadabra", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(65, "Alakazam", "Alakazam", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(66, "Machop", "Machop", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(67, "Machoke", "Machoke", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(68, "Machamp", "Machamp", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(69, "Bellsprout", "Bellsprout", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(70, "Weepinbell", "Weepinbell", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(71, "Victreebel", "Victreebel", "Planta/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(72, "Tentacool", "Tentacool", "Agua/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(73, "Tentacruel", "Tentacruel", "Agua/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(74, "Geodude", "Geodude", "Roca/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(75, "Graveler", "Graveler", "Roca/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(76, "Golem", "Golem", "Roca/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(77, "Ponyta", "Ponyta", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(78, "Rapidash", "Rapidash", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(79, "Slowpoke", "Slowpoke", "Agua/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(80, "Slowbro", "Slowbro", "Agua/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(81, "Magnemite", "Magnemite", "Eléctrico/Metal", 100, 2000));
        agregarPokemon(new PokemonDTO(82, "Magneton", "Magneton", "Eléctrico/Metal", 100, 2000));
        agregarPokemon(new PokemonDTO(83, "Farfetch'd", "Farfetch'd", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(84, "Doduo", "Doduo", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(85, "Dodrio", "Dodrio", "Normal/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(86, "Seel", "Seel", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(87, "Dewgong", "Dewgong", "Agua/Hielo", 100, 2000));
        agregarPokemon(new PokemonDTO(88, "Grimer", "Grimer", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(89, "Muk", "Muk", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(90, "Shellder", "Shellder", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(91, "Cloyster", "Cloyster", "Agua/Hielo", 100, 2000));
        agregarPokemon(new PokemonDTO(92, "Gastly", "Gastly", "Fantasma/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(93, "Haunter", "Haunter", "Fantasma/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(94, "Gengar", "Gengar", "Fantasma/Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(95, "Onix", "Onix", "Roca/Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(96, "Drowzee", "Drowzee", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(97, "Hypno", "Hypno", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(98, "Krabby", "Krabby", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(99, "Kingler", "Kingler", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(100, "Voltorb", "Voltorb", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(101, "Electrode", "Electrode", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(102, "Exeggcute", "Exeggcute", "Planta/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(103, "Exeggutor", "Exeggutor", "Planta/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(104, "Cubone", "Cubone", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(105, "Marowak", "Marowak", "Tierra", 100, 2000));
        agregarPokemon(new PokemonDTO(106, "Hitmonlee", "Hitmonlee", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(107, "Hitmonchan", "Hitmonchan", "Lucha", 100, 2000));
        agregarPokemon(new PokemonDTO(108, "Lickitung", "Lickitung", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(109, "Koffing", "Koffing", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(110, "Weezing", "Weezing", "Veneno", 100, 2000));
        agregarPokemon(new PokemonDTO(111, "Rhyhorn", "Rhyhorn", "Tierra/Roca", 100, 2000));
        agregarPokemon(new PokemonDTO(112, "Rhydon", "Rhydon", "Tierra/Roca", 100, 2000));
        agregarPokemon(new PokemonDTO(113, "Chansey", "Chansey", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(114, "Tangela", "Tangela", "Planta", 100, 2000));
        agregarPokemon(new PokemonDTO(115, "Kangaskhan", "Kangaskhan", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(116, "Horsea", "Horsea", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(117, "Seadra", "Seadra", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(118, "Goldeen", "Goldeen", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(119, "Seaking", "Seaking", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(120, "Staryu", "Staryu", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(121, "Starmie", "Starmie", "Agua/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(122, "Mr. Mime", "Mr. Mime", "Psíquico/Hada", 100, 2000));
        agregarPokemon(new PokemonDTO(123, "Scyther", "Scyther", "Bicho/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(124, "Jynx", "Jynx", "Hielo/Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(125, "Electabuzz", "Electabuzz", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(126, "Magmar", "Magmar", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(127, "Pinsir", "Pinsir", "Bicho", 100, 2000));
        agregarPokemon(new PokemonDTO(128, "Tauros", "Tauros", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(129, "Magikarp", "Magikarp", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(130, "Gyarados", "Gyarados", "Agua/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(131, "Lapras", "Lapras", "Agua/Hielo", 100, 2000));
        agregarPokemon(new PokemonDTO(132, "Ditto", "Ditto", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(133, "Eevee", "Eevee", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(134, "Vaporeon", "Vaporeon", "Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(135, "Jolteon", "Jolteon", "Eléctrico", 100, 2000));
        agregarPokemon(new PokemonDTO(136, "Flareon", "Flareon", "Fuego", 100, 2000));
        agregarPokemon(new PokemonDTO(137, "Porygon", "Porygon", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(138, "Omanyte", "Omanyte", "Roca/Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(139, "Omastar", "Omastar", "Roca/Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(140, "Kabuto", "Kabuto", "Roca/Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(141, "Kabutops", "Kabutops", "Roca/Agua", 100, 2000));
        agregarPokemon(new PokemonDTO(142, "Aerodactyl", "Aerodactyl", "Roca/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(143, "Snorlax", "Snorlax", "Normal", 100, 2000));
        agregarPokemon(new PokemonDTO(144, "Articuno", "Articuno", "Hielo/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(145, "Zapdos", "Zapdos", "Eléctrico/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(146, "Moltres", "Moltres", "Fuego/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(147, "Dratini", "Dratini", "Dragón", 100, 2000));
        agregarPokemon(new PokemonDTO(148, "Dragonair", "Dragonair", "Dragón", 100, 2000));
        agregarPokemon(new PokemonDTO(149, "Dragonite", "Dragonite", "Dragón/Volador", 100, 2000));
        agregarPokemon(new PokemonDTO(150, "Mewtwo", "Mewtwo", "Psíquico", 100, 2000));
        agregarPokemon(new PokemonDTO(151, "Mew", "Mew", "Psíquico", 100, 2000));
        
	}

	public void agregarPokemon(PokemonDTO pokemon) {
        listaPokemon.add(pokemon);
    }
    
    public String imprimirLista() {
    	String res = "";
        for (PokemonDTO pokemon : listaPokemon) {
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
    
    public String imprimirPokemonPorId(int id) {
    	String res = "";
        for (PokemonDTO pokemon : listaPokemon) {
            if (pokemon.getId() == id) {
            	res = "ID: " + pokemon.getId()+"\n"+
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
        }
		return res;
    }
}