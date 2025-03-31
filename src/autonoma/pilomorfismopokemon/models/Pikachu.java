/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    //////////////////////////////////////////////////////////////////////
    /////////////constructor
    public Pikachu(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
//////////////////////////////////////////////////////////////////////
    /////////////metodos 
    @Override
    public String atacarPlancaje() {
        return "Soy Pikachu y estoy atacando con plancaje ";
    }

    @Override
    public String atacarAraniazo() {
        return "Soy Pikachu y estoy atacando con Araniazo ";
    }

    @Override
    public String atacarMordisco() {
       return "Soy Pikachu y estoy atacando con mordisco ";
    }

    @Override
    public String atacarImpactruno() {
        return "Soy Pikachu y estoy atacando con impactrueno ";
    }

    @Override
    public String atacarPunioTrueno() {
       return "Soy Pikachu y estoy atacando con punio trueno ";
    }

    @Override
    public String atacarRayoCarga() {
       return "Soy Pikachu y estoy atacando con rayo carga ";
    }
    
}
