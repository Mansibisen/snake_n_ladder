import java.util.Random;
import java.util.Vector;

public class Grid {


    private final Cell[][] Grid = new Cell[10][10];
    Random rand = new Random();
    public  void setUp(){
        for(int i  =0 ;i < 10;i++){
            for(int j  =0 ; j < 10 ; j++){
                Grid[i][j] = new Cell(10*(i)+j+1);
            }
        }
        generateProps();
    }
    public void print(){
        for(int i  =0 ;i < 10;i++){
            for(int j  =0 ; j < 10 ; j++){
                System.out.println(Grid[i][j].getNumber());
                System.out.println(Grid[i][j].getItem());
            }
        }
    }

    private void generateProps(){
        // generate snakes from 1 to n
        // generate ladders from 1 to n

        int n = 6;
        int m = 3;

        int snake_max = rand.nextInt(n-m+1)+m;
        int ladder_max = rand.nextInt(n-m+1)+m;

        // snake should always have start > end;
        generateSnakes(snake_max);

        // ladder should always have start < end;
        generateLadders(ladder_max);

    }
    private void generateSnakes(int snake_max){
        System.out.println("snakes");
        for(int i =1 ; i <= snake_max ; i++){
            // check validity of start and end

            int start = rand.nextInt(100)+1;
            System.out.println(start);
            int end = rand.nextInt(start-1)+1;


            System.out.println(start +".................."+end);

            int start_row = (start-1)/10 ;
            int start_col =  (start-1)%10;

            int end_row = (end-1)/10 ;
            int end_col = (end-1)%10;

            Cell Startcell = Grid[start_row][start_col];
            Startcell.setPropsSnake(true , end);

            Cell Endcell = Grid[end_row][end_col];
            Endcell.setPropsSnake(false , end);



        }

    }

    private void generateLadders( int ladder_max){
        System.out.println("ladders");
        for(int i =1 ; i <= ladder_max ; i++){
            // check validity of start and end
            int start = rand.nextInt(100)+1;
            int end = rand.nextInt(100+1-start)+start;

            System.out.println(start +".................."+end);

            int start_row = (start-1)/10 ;
            int start_col =  (start-1)%10;

            int end_row = (end-1)/10 ;
            int end_col = (end-1)%10;

            Cell Startcell = Grid[start_row][start_col];
            Startcell.setPropsLadder(true , end);

            Cell Endcell = Grid[end_row][end_col];
            Endcell.setPropsLadder(false , end);



        }

    }

    public int calculatePosition(int pos ){

        System.out.println(pos);
        int i = (pos-1)/10 ;
        int j =  (pos-1)%10;

        System.out.println(i +"---" + j);



        Cell cell = Grid[i][j];
        int new_pos = cell.calculateCell();
        System.out.println("new pos" + new_pos);
        if(new_pos == -100){
            return pos;
        }
        return new_pos;


    }


}
