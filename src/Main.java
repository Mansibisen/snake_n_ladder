import java.util.Random;

public class Main {


    // 10X10 grid
    // 100 cells  --> class (number )
    // snake start or snake end or ladder start or ladder end or nothing  --> props
    // function to roll the dice ( 1-6)
    // user class -->( color of player , name , currPos)
    // Class props extends  snake . ladder
    // snake, ladder --->(startpos , endpos)

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // setup the grid;
        Grid board = new Grid();
        board.setUp();

       // board.print();


        User user1 = new User("mansi" , Color.YELLOW , 0);
        User user2 = new User("nehal" , Color.RED , 0);

        int total_players = 2;

        // play the game;
        int chance = 0;
        while(true){

            chance = (chance+1) % total_players;
            int dice = dice_throw();

            if(chance== 0) {
                int pos = user1.getCurrPos();
                pos += dice;

                if (pos >= 100) {
                    System.out.println("YAYYYYY.............Winner is " + user1.getName());
                    break;
                }

                int new_pos = board.calculatePosition(pos);

                user1.setCurrPos(new_pos);

                if (new_pos >= 100) {
                    System.out.println("YAYYYYY.............Winner is " + user1.getName());
                    break;
                }

            }else{
                int pos = user2.getCurrPos();
                pos += dice;

                if (pos >= 100) {
                    System.out.println("YAYYYYY.............Winner is " + user2.getName());
                    break;
                }

                int new_pos = board.calculatePosition(pos);

                user2.setCurrPos(new_pos);

                if (new_pos >= 100) {
                    System.out.println("YAYYYYY.............Winner is " + user2.getName());
                    break;
                }
            }



        }


    }

    private static int dice_throw(){
        Random rand = new Random();
        return rand.nextInt(6-1+1)+1;
    }
}