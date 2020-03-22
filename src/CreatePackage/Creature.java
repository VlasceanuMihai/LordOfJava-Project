package CreatePackage;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

/*
    Specie are trasaturi individuale, toate fapturile mistice au numeroase trasaturi comune, ce vor fi modelate printr-o
    entitate abstracta, cu nume intuitiv: Creature
 */

public abstract class Creature implements ICreature, Comparable<Creature>{
    private Abilities abilities; //Trasaturile unei creaturi, exprimate prin: putere, viteza si respectiv agilitate.
    private String nickname; // Username
    private long score; // Scorul acumulat de creatura respectiva in cadrul jocului.


    public Creature(double stamina, double speed, int agility, String nickname, long score) {
        this.abilities = new Abilities(stamina, speed, agility);
        this.nickname = nickname;
        this.score = score;
    }


    @Override
    public int compareTo(Creature o) {
        return this.abilities.compareTo(o.abilities);
    }

    @Override
    public String getNickname() {
        return this.nickname;
    }


    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    @Override
    public void updateScore(long amount) throws NumberFormatException {
        if (amount < 0){
            throw new NumberFormatException("Expecting positive bonus value, got: " + amount);
        }

        this.score += amount;
    }


    @Override
    public void powerUp(double stamina, double speed, int agility) {
        this.abilities.update(stamina, speed, agility);
    }


    @Override
    public String toString() {
        return "Nickname: " + this.nickname + "\nScore: " + this.score +
                "\nAbilities: " + this.abilities;
    }
}
