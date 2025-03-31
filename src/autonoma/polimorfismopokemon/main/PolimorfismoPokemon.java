/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.polimorfismopokemon.main;

import autonoma.pilomorfismopokemon.models.Bulbasaur;
import autonoma.pilomorfismopokemon.models.Charmander;
import autonoma.pilomorfismopokemon.models.Pikachu;
import autonoma.pilomorfismopokemon.models.Pokemon;
import autonoma.pilomorfismopokemon.models.PokemonAgua;
import autonoma.pilomorfismopokemon.models.PokemonElectrico;
import autonoma.pilomorfismopokemon.models.Squirtle;

/**
 *
 * @author usuario
 */
public class PolimorfismoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Charmander charmander = new Charmander (4, "Charmander",(float) 2.8,"Primera temporada");
        Pokemon pokemonC= new Charmander (2,"Charmander", (float) 4.2,"Segunda temporada");
        Pokemon pokemon =new Bulbasaur (8,"Bulbasaur", (float) 8,"Primera temporada");
        PokemonAgua pokemonA = new Squirtle (14, "Squirtle", (float) 1.2,"Primera temporada");
        PokemonElectrico pokemonE = new Pikachu (3, "Pikachu", (float) 5.6, "Primera temporada");
        System.out.println (charmander.atacarAcusas()+ "\n") ;
        System.out.println (pokemonC.atacarPlancaje()+ "\n") ;
        System.out.println (pokemon.atacarMordisco()+ "\n");
        System.out.println (pokemonA.atacarHidroBomba()+"\n");
        System.out.println (pokemonE.atacarPunioTrueno()+ "\n");
    }
    
}
