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
    /**
     * 
     * @param numPokedex
     * @param nombre
     * @param pesoPokemon
     * @param temporada 
     */

    public Charmander(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
    //metodo abstracto atacarPlancaje
    // @return String
    @Override
    public String atacarPlancaje() {
        return "soy Charmander y estoy atacando con con plataje";
    }
    //metodo abstracto atacarAraniazo
    // @return String
    @Override
    public String atacarAraniazo() {
        return "soy Charmander y estoy atacando con araniazo";
    }
    //metodo abstracto atacarMordisco
    // @return String
    @Override
    public String atacarMordisco() {
        return "soy Charmander y estoy atacando con mordisco ";
    }
    //metodo abstracto atacarPunioFuego
    // @return String
    @Override
    public String atacarPunioFuego() {
        return "soy Charmander y estoy atacando con punio fuego";
    }
    //metodo abstracto atacarAcusas
    // @return String
    @Override
    public String atacarAcusas() {
        return "soy Charmander y estoy atacando con acusas";
    }
    //metodo abstracto atacarLanzaLlamas
    // @return String
    @Override
    public String atacarLanzaLlamas() {
        return "soy Charmander y estoy atacando con lanza llamas";
    }
    
    
}
