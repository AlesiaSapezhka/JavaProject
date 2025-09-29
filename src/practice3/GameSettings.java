package practice3;

public class GameSettings {

    static int maxPlayers = 5;
    final String gameName;
    int currentPlayers;

    static {
        maxPlayers = 10;
    }

    GameSettings(String gameName, int currentPlayers){
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers){
        maxPlayers = newMaxPlayers;
    }

    int addPlayer() {
        if (currentPlayers<=maxPlayers){
            return currentPlayers++;
        } else {
            return currentPlayers;
        }
    }

    void printGameStatus(){
        System.out.println("Game Name: " + this.gameName + ". Current Players: " + this.currentPlayers + ". Max Players: " + maxPlayers);
    }
}
