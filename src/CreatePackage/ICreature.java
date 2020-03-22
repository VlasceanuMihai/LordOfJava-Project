package CreatePackage;

/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */
public interface ICreature {
    // get nickname
    String getNickname();

    // set nickname
    void setNickname(String nickname);

    // update score
    void updateScore(long amount) throws NumberFormatException;

    // power up abilities
    void powerUp(double stamina, double speed, int agility);
}
