package hw3_static_final_access_modificators;

public class GameSettings {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Крокодил", 10);
        GameSettings game2 = new GameSettings("Бинго", 5);

        GameSettings.setMaxPlayers(10);

        game1.addPlayer();
        game1.printGameStatus();

        game2.addPlayer();
        game2.printGameStatus();
    }

    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int newMax) {
        maxPlayers = newMax;
    }

    public void addPlayer() {
        if(currentPlayers < maxPlayers) {
            currentPlayers +=1;
        } else {
            System.out.println("Достигнуто максимальное количество игроков.");
        }

    }

    public void printGameStatus() {
        System.out.println("Название игры: " + gameName + ", текущее количество игроков: " + currentPlayers + ", максимальное количество игроков: " + maxPlayers);
    }

}
