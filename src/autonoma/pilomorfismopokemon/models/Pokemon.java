/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 * Metdo abstracto de pokemon
 * @author valerie moreno
 * @since 3312025
 * @version 1.0
 */
public abstract class Pokemon {
    //////////////////////////////////////////////////////////////////////////////////
    ////Atrubutos
    //////////////////////////////////////////////////////////////////////////////////
    //// numero de pokemones
    private int numPokedex;
    //////////////////////////////////////////////////////////////////////////////////
    //// nombre del pokemon
    private String nombre;
    //////////////////////////////////////////////////////////////////////////////////
    //// peso del pokemon
    private float pesoPokemon;
    //////////////////////////////////////////////////////////////////////////////////
    //// saber en que temporada esta
    private String temporada;
    //////////////////////////////////////////////////////////////////////////////////
    ////constructor

    public Pokemon(int numPokedex, String nombre, float pesoPokemon, String temporada) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.pesoPokemon = pesoPokemon;
        this.temporada = temporada;
    }
    //////////////////////////////////////////////////////////////////////////////////
    ////metodos de acceso

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPesoPokemon() {
        return pesoPokemon;
    }

    public void setPesoPokemon(float pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    //////////////////////////////////////////////////////////////////////////////////
    ////metodos
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar plantaje y returna un string
    public abstract String atacarPlancaje ();
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con araniazo y returna un string
    public abstract String atacarAraniazo();
    //////////////////////////////////////////////////////////////////////////////////
    //// metodo de atacar con mordisco y returna un string
    public abstract String atacarMordisco();
}
