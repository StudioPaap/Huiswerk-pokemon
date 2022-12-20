package src;

public class  ElectricityPokemon extends Pokemon {

    //instance variables
    private String weaknesses;
    private boolean male;


    // Constructor
    public ElectricityPokemon(String nm, double weight, int hp, String weaknesses, boolean male) {
        super(nm, weight, hp);
        this.weaknesses = weaknesses;
        this.male = male;
    }



    // Getters en setters

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    // methods
    public void electrify(String name){
        System.out.println(name +" uses electricity, it's very effectfull");
    }
    public void runAway(String name) {
        System.out.println("Oh nee, " + name + " is gevlucht!");
    }

    @Override
    public void eat() {
        System.out.println("electricy pokemons eat a lot of different stuff, but they like to be out in the thunder");
    }

    public void call(String name) {
        System.out.println("The call of this electricitypokemon sounds like his name : " + name);
    }


}

