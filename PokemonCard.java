public class PokemonCard extends GamingCard {
    String typeOfPokemon;
    int pokemonPokedex;
    String pokemonAbility;

// default constructor for a Pokemon card. Extends the parent class (GamingCard)
// and therefore uses GamingCard's default constructor through the means of super().
    public PokemonCard(String characterName, String image, String category, String game,
                       String pokemonType, int pokedex, String ability) {
        super(characterName, image, category, game);
        typeOfPokemon = pokemonType;
        pokemonPokedex = pokedex;
        pokemonAbility = ability;
    }
    public void setType(String pokemonType) { // sets the type of Pokemon (fire/ bug/ poison)
        typeOfPokemon = pokemonType;
    }
    public void setPokedex(int pokedex) { // sets the Pokedex. (number associated with specific Pokemon)
        pokemonPokedex = pokedex;
    }
    public void setAbility(String ability) { // sets the Pokemon's ability. (blaze /swarm or swiper/ friend gaurd)
        pokemonAbility = ability;
    }

    // all Getter methods below return the appropriate values set through the above setter methods.

    public String getType() {
        return typeOfPokemon;
    }
    public int getPokedex() {
        return pokemonPokedex;
    }
    public String getAbility() {
        return pokemonAbility;
    }
    // Overridden toString() method, specifically tailored to fit an instance of the PokemonCard class
    @Override
    public String toString() {
        return super.toString() + ", " + getPokedex() + ", a " + getType() + "-type with "
                + getAbility() + " ability.";
    }
}
