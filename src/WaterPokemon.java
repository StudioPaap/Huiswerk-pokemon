package src;

public class WaterPokemon extends Pokemon {

    //instance variables
    boolean shield;
    String color;

    //constructor
    public WaterPokemon(String nm, double weight, int hp, boolean shield, String color) {
        super(nm, weight, hp);
        this.shield = shield;
        this.color = color;
    }
    // getter en setters

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Methods

    public void foolingAsh(String name){
        System.out.println( name + " is fooling ash and won't get out the pokeball");
    }
    public void Underwater( String name,  double weight){
        System.out.println("Oh no, " + name + " weighs" + weight + "kg and is too heavy and will sink to the bottom!");
    }

    @Override
    public void eat() {
        System.out.println("WaterPokemons do eat a lot of fish and smaller waterpokemons");
    }

    public void call(String name){
        System.out.println("The call of this waterpokemon sounds like his name : " + name);
    }
}
