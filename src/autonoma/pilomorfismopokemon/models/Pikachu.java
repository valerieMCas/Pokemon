/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 * clase que genera el pokemon pikacu y sus metodos 
 * @author valerie moreno
 * @since 3312025
 * @version 1.0
 */
public class Pikachu extends Pokemon implements PokemonElectrico{
    //////////////////////////////////////////////////////////////////////
    /////////////constructor
    public Pikachu(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        super(numPokedex, nombre, pesoPokemon, temporada);
    }
//////////////////////////////////////////////////////////////////////
    /////////////metodos 
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar plantaje y returna un string
    @Override
    public String atacarPlancaje() {
        return "Soy Pikachu y estoy atacando con plancaje ";
    }
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con araniazo y returna un string
    @Override
    public String atacarAraniazo() {
        return "Soy Pikachu y estoy atacando con Araniazo ";
    }
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con mordisco y returna un string
    @Override
    public String atacarMordisco() {
       return "Soy Pikachu y estoy atacando con mordisco ";
    }
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con impactrueno 
    //////////////@returna un string
    @Override
    public String atacarImpactruno() {
        return "Soy Pikachu y estoy atacando con impactrueno ";
    }
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con punio trueno 
    /////////@returna un string
    @Override
    public String atacarPunioTrueno() {
       return "Soy Pikachu y estoy atacando con punio trueno ";
    }
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con rayo carga 
    ////////////@returna un string
    @Override
    public String atacarRayoCarga() {
       return "Soy Pikachu y estoy atacando con rayo carga ";
    }
    
}
