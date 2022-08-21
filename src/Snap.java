import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame{
    CardGame game = new CardGame();
    Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    String previousCardSuit = "";
    String snap = "";
    boolean gameOver = false;
    public void play(){

        introduction();

        while(!gameOver){

            askToDealCard(player.getPlayerTurn());
            System.out.println(game.dealCard().toString());
            previousCardSuit = game.dealCard().getSuit();

            player.switchTurn();
            game.shuffleDeck();

            askToDealCard(player.getPlayerTurn());
            System.out.println(game.dealCard().toString());

            if(previousCardSuit.equals(game.dealCard().getSuit())){
                lookForSnap();
                gameOver = true;
            }

        }

    }

    public void introduction(){
        System.out.println();
        System.out.println("WELCOME TO SNAP");
        System.out.println();
    }

    public void askToDealCard(int player){
        System.out.println();
        System.out.println("Player " + player + " turn");
        System.out.println("PRESS ENTER —— Deal card");
        scanner.nextLine();
        System.out.println();
    }


    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            if(!snap.equalsIgnoreCase("snap")){
                lostMessage();
                System.exit(0);
            }
        }
    };


    public void lookForSnap(){
        //https://stackoverflow.com/questions/44038081/set-time-limit-on-user-input-scanner-java
        Timer timer = new Timer();
        timer.schedule(timerTask, 2000);
        snap = scanner.nextLine();
        timer.cancel();
        victoryMessage();

    }

    public void victoryMessage(){
        System.out.println();
        System.out.println("You Won");

    }

    public void lostMessage(){
        System.out.println();
        System.out.println("Too slow, you Lost");
    }

}
