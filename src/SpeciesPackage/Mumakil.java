package SpeciesPackage;

import CreatePackage.Creature;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

public class Mumakil extends Creature {
    public Mumakil(double stamina, double speed, int agility, String nickname, long score) {
        super(stamina, speed, agility, nickname, score);
    }


    @Override
    public void powerUp(double newStamina, double newSpeed, int newAgility){
        super.powerUp(0.75 * newStamina, (newSpeed + 10), newAgility);
    }


    @Override
    public String toString(){
        return super.toString() + "\nA creature of type Mumakil.";
    }
}
