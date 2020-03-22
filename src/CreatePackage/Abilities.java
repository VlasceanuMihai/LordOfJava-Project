package CreatePackage;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

/*
    Clasa Abilities reprezinta esenta oricarei creaturi fabuloase, aceasta caracterizand puterea fiecarui individ.
    Cu cat un personaj are valori mai mari ale abilitatilor personale, cu atat el este mai puternic.
 */

public class Abilities implements Comparable<Abilities>{
    private double stamina; // Puterea fizica a individului
    private double speed; // Viteza personajului
    private int agility; // Agilitatea personala, capacitatea de a se feri, riposta


    public Abilities(double stamina, double speed, int agility) {
        this.stamina = stamina;
        this.speed = speed;
        this.agility = agility;
    }


    @Override
    public int compareTo(Abilities o) {
        if (this.stamina != o.stamina) {
            return (int) (this.stamina - o.stamina);
        } else if (this.speed != o.speed) {
            return (int) (this.speed - o.speed);
        }

        return this.agility - o.agility;
    }


    // Aduna la valorile actuale ale abilitatilor valorile specifice primite ca parametru
    public void update(double stamina, double speed, int agility) {
        this.stamina += stamina;
        this.speed += speed;
        this.agility += agility;
    }


    // Diferenta de putere dintre 2 personaje
    public int powerDifferenceApprox(Abilities o){
        return (int) (Math.abs(this.stamina - o.stamina));
    }


    @Override
    public String toString() {
        return "CreatePackage.Abilities{" +
                "stamina=" + stamina +
                ", speed=" + speed +
                ", agility=" + agility +
                '}';
    }
}
