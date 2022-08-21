public class Player {
    static int playerTurn = 0;
    public static void switchTurn(){
        playerTurn = playerTurn == 0 ? 1 : 0;
    }

    public static int getPlayerTurn() {
        return playerTurn;
    }

}
