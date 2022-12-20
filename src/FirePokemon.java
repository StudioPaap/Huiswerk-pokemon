package src;

public class FirePokemon extends Pokemon{

    //instance Variabele

    private String powerSkill;
    private int evelutionAmount;

// constructor

    public FirePokemon(String nm, double weight, int hp, String powerSkill, int evelutionAmount) {
        super(nm, weight, hp);
        this.evelutionAmount = evelutionAmount;
        this.powerSkill = powerSkill;
    }

    //getter-setter

    public String getPowerSkill() {
        return powerSkill;
    }

    public void setPowerSkill(String powerSkill) {
        this.powerSkill = powerSkill;
    }

    public int getEvelutionAmount() {
        return evelutionAmount;
    }

    public void setEvelutionAmount(int evelutionAmount) {
        this.evelutionAmount = evelutionAmount;
    }

    //methods

    public void attack(String name){
        System.out.println( name + " uses his fireabbilities, it was very effectfull");
    }
    public void fightBack( String name, String powerSkill){
        System.out.println( name + "used his " + powerSkill + " and he won the battle!!");
    }

    @Override

    public void eat(){
        System.out.println("Firepokemons tend to have a love for spicy food");
    }

    @Override
    public void call(String name) {
        System.out.println("The call of this firepokemon sounds like his name : " + name);
    }

}