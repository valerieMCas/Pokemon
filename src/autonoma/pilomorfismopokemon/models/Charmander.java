/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 */
public class Charmander extends Pokemon implements PokemonFuego{

    public Charmander(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }

    @Override
    public String atacarPlancaje() {
        return "soy Charmander y estoy atacando con con plataje";
    }

    @Override
    public String atacarAraniazo() {
        return "soy Charmander y estoy atacando con araniazo";
    }

    @Override
    public String atacarMordisco() {
        return "soy Charmander y estoy atacando con mordisco ";
    }

    @Override
    public String atacarPunioFuego() {
        return "soy Charmander y estoy atacando con punio fuego";
    }

    @Override
    public String atacarAcusas() {
        return "soy Charmander y estoy atacando con acusas";
    }

    @Override
    public String atacarLanzaLlamas() {
        return "soy Charmander y estoy atacando con lanza llamas";
    }
    
    
}
