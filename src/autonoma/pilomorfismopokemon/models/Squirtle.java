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
    // Método abstracto para el atacarPlancaje
    // @return String
    @Override
    public String atacarPlancaje() {
        return "soy Squitle y estoy atacando con plancaje";
    }
    // Método abstracto para el atacarAraniazo
    // @return String
    @Override
    public String atacarAraniazo() {
        return "soy Squitle y estoy atacando con araniazo";
    }
    // Método abstracto para el atacarMordisco
    // @return String
    @Override
    public String atacarMordisco() {
        return "soy Squitle y estoy atacando con mordisco";
    }
    // Método abstracto para el ataque "Hidro Bomba"
    // @return String
    @Override
    public String atacarHidroBomba() {
        return "soy Squitle y estoy atacando con Hidro bomba";

    }
    // Método abstracto para el atacarPistolaAgua
    // @return String
    @Override
    public String atacarPistolaAgua() {
        return "soy Squitle y estoy atacando con pistola agua";
    }
    // Método abstracto para el atacarBurguja
    // @return String
    @Override
    public String atacarBurguja() {
        return "soy Squitle y estoy atacando con burbuja ";
    }
    // Método abstracto para el atacarHidroPulso
    // @return String
    @Override
    public String atacarHidroPulso() {
        return "soy Squitle y estoy atacando con hidro pulso";
    }
    
    
}
