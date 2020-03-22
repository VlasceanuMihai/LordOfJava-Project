/**
 * Project: [Proiect] The Lord Of Java
 * Author: mihai
 * Date: 3/21/2020
 */

/*
    Clasa Parameters va stoca toti parametrii jocului
 */

public class Parameters {
    private String OS; // Sistemul de operare
    private String gamePATH; // Calea (PATH) in sistemul de fisiere catre locatia jocului.
    private String credentials; // Credentialele (de login) pentru contul utilizatorului.
    private int noLives; // Numarul de vieti ramase ale jucatorului.


    public Parameters(String OS, String gamePATH, String credentials, int noLives) {
        this.OS = OS;
        this.gamePATH = gamePATH;
        this.credentials = credentials;
        this.noLives = noLives;
    }


    @Override
    public String toString() {
        return "OS: " + this.OS + "\nGame Path: " + this.gamePATH +
                "\nCredentials: " + this.credentials +
                "\nNo. lives remaining: " + this.noLives;
    }
}


/*
OS: WindowsOS
Game Path: /Users/Applications/The Lord of Java.app
Credentials: df56df76sdf689889dfs79sfd8fsd98.md5sum
No. lives remaining: 5
 */