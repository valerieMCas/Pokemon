/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 */
public class Squirtle extends Pokemon implements PokemonAgua{

    public Squirtle(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }

    @Override
    public String atacarPlancaje() {
        return "soy Squitle y estoy atacando con plancaje";
    }

    @Override
    public String atacarAraniazo() {
        return "soy Squitle y estoy atacando con araniazo";
    }

    @Override
    public String atacarMordisco() {
        return "soy Squitle y estoy atacando con mordisco";
    }

    @Override
    public String atacarHidroBomba() {
        return "soy Squitle y estoy atacando con Hidro bomba";

    }

    @Override
    public String atacarPistolaAgua() {
        return "soy Squitle y estoy atacando con pistola agua";
    }

    @Override
    public String atacarBurguja() {
        return "soy Squitle y estoy atacando con burbuja ";
    }

    @Override
    public String atacarHidroPulso() {
        return "soy Squitle y estoy atacando con hidro pulso";
    }
    
    
}
