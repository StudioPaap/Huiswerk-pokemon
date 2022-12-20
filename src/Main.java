package src;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        // Geinstantieerde pokemon nr1
        ElectricityPokemon jolteon = new ElectricityPokemon("Jolteon", 12.3, 2, "ground", true);
        System.out.println(jolteon.getWeaknesses());
        jolteon.eat();
        jolteon.electrify(jolteon.getName());
        jolteon.runAway(jolteon.getName());


        // Geinstantieerde pokemon nr2
        GrassPokemon oddish = new GrassPokemon("Oddish", 5.4 ,6, "In the Grass", false);
        System.out.println(oddish.getLivingArea());
        oddish.flyAway(oddish.getName());
        oddish.usesPoison(oddish.getName());

        // Geinstantieerde pokemon nr3
        FirePokemon tortunator = new FirePokemon("Turtonator", 212.0, 33, "Shell armor", 0);
        tortunator.eat();
        tortunator.attack(tortunator.getName());
        tortunator.fightBack(tortunator.getName(), tortunator.getPowerSkill());

        // Geinstantieerde pokemon nr4

        WaterPokemon goldduck = new WaterPokemon("Goldduck", 76.6, 12,  false, "blue");
        goldduck.eat();
        goldduck.foolingAsh(goldduck.getName());
        goldduck.Underwater(goldduck.getName(), goldduck.getWeight());
        goldduck.call(goldduck.getName());
    }
}