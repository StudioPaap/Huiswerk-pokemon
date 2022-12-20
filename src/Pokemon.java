package src;

public abstract class Pokemon {

    //instance variables
    private String name;
   private double weight;
    public int hp;

// constructor
    public Pokemon(String nm, double weight, int hp){
        this.name = nm;
        this.weight = weight;
        this.hp = hp;
    }

    //getters en setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setLevel(int level) {
        this.weight = level;
    }


    //Methods

    public abstract void eat();

    public abstract void call(String name);

}

