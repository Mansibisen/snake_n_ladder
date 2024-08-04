import java.util.Random;
import java.util.Scanner;



// should not add previously existing snake or ladder , should add all correct ones







public class Main {


    // 10X10 grid
    // 100 cells  --> class (number )
    // snake start or snake end or ladder start or ladder end or nothing  --> props
    // function to roll the dice ( 1-6)
    // user class -->( color of player , name , currPos)
    // Class props extends  snake . ladder
    // snake, ladder --->(startpos , endpos)

    public static void main(String[] args) {
        System.out.println("Starting the game....................!");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number of players");
        int numberOfPlayers = scanner.nextInt();

        Grid board = new Grid();
        board.setUp();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter player name");
            String pName = scanner.next();

            User player =  new User(pName , 0);

            board.addPlayers(player);
        }

        board.play();






        // play the game;



    }


}