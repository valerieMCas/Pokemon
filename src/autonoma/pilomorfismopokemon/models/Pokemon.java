/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.pilomorfismopokemon.models;

/**
 *
 * @author usuario
 */
public abstract class Pokemon {
    //////////////////////////////////////////////////////////////////////////////////
    ////Atrubutos
    private int numPokedex;
    private String nombre;
    private float pesoPokemon;
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
    public void atacarPlancaje (){
        
    }
    public void atacarAraniazo(){
        
    }
    public void atacarMordisco(){
        
    }
}
