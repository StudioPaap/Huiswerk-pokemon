package src;

public class GrassPokemon extends Pokemon{


    //instance variables
    private String livingArea;
    private boolean evolutesInFlyingPokemon;

    //constructor

    public GrassPokemon(String nm, double weight, int hp, String livingArea, boolean evolutesInFlyingPokemon) {
        super(nm, weight, hp);
        this.evolutesInFlyingPokemon = evolutesInFlyingPokemon;
        this.livingArea = livingArea;
    }

    // getter en setters

    public String getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(String livingArea) {
        this.livingArea = livingArea;
    }

    public boolean isEvolutesInFlyingPokemon() {
        return evolutesInFlyingPokemon;
    }

    public void setEvolutesInFlyingPokemon(boolean evolutesInFlyingPokemon) {
        this.evolutesInFlyingPokemon = evolutesInFlyingPokemon;
    }

    //Methods

    public void usesPoison(String name){
        System.out.println( name + " uses poison, it's very effective" );
    }
    public void flyAway(String name){
        System.out.println("Oh no " + name + " flies away");
    }

    @Override
    public void eat() {
        System.out.println("All grasspokemons, don't like eating grass");

    }

    public void call(String name){
        System.out.println("The call of this Grasspokemon sounds like his name : " + name);
    }


}
