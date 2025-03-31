/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 * @author marti
 */
public class Bulbasaur extends Pokemon implements PokemonPlanta {
    ////////////////////////////////////////////////////////////////////////
    ///////////contructor
    public Bulbasaur(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
    //Metodo abstracto atacarPlancaje
    // @return String
    @Override
    public String atacarPlancaje() {
       return "Soy Bulbasar y estoy atacando con plancaje";
    }
    //Metodo abstracto atacarAraniazo
    // @return String
    @Override
    public String atacarAraniazo() {
        return "Soy Bulbasar y estoy atacando con araniazo";
    }
    //Metodo abstracto atacarMordisco
    // @return String
    @Override
    public String atacarMordisco() {
        return "Soy Bulbasar y estoy atacando con mordisco";
    }
    //Metodo abstracto atacarParalizar
    // @return String
    @Override
    public String atacarParalizar() {
        return "Soy Bulbasar y estoy atacando con paralizar";
    }
    //metodo abstracto atacarDrenaje
    // @return String
    @Override
    public String atacarDrenaje() {
        return "Soy Bulbasar y estoy atacando con drenaje";
    }
    //metodo abstracto atacarHojaAfilada
    // @return String
    @Override
    public String atacarHojaAfilada() {
        return "Soy Bulbasar y estoy atacando con hoja afilada";
    }
    //metodo abstracto atacarLatigoCepa
    // @return String
    @Override
    public String atacarLatigoCepa() {
        return "Soy Bulbasar y estoy atacando con latigo Cepa";
    }
    
}
