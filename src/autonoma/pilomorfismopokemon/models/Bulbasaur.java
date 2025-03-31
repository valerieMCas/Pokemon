/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    ////////////////////////////////////////////////////////////////////////
    ///////////contructor
    public Bulbasaur(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }

    @Override
    public String atacarPlancaje() {
       return "Soy Bulbasar y estoy atacando con plancaje";
    }

    @Override
    public String atacarAraniazo() {
        return "Soy Bulbasar y estoy atacando con araniazo";
    }

    @Override
    public String atacarMordisco() {
        return "Soy Bulbasar y estoy atacando con mordisco";
    }

    @Override
    public String atacarParalizar() {
        return "Soy Bulbasar y estoy atacando con paralizar";
    }

    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasar y estoy atacando con drenaje";
    }

    @Override
    public String atacarHojaAfilada() {
        return "Soy Bulbasar y estoy atacando con hoja afilada";
    }

    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasar y estoy atacando con latigo Cepa";
    }
    
}
