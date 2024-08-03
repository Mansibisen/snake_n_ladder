public class Cell {

    private int number;
    private props item;

    public Cell(int num) {
        this.number = num;

    }
    public void setPropsSnake(Boolean start , int destination){
        this.item = new snake(start  , destination );
    }
    public void setPropsLadder(Boolean start , int destination){
        this.item = new ladder(start  , destination );
    }

    public int getNumber() {
        return number;
    }



    public props getItem() {
        return item;
    }

    public  int calculateCell(){
        props item = this.item;
        System.out.println(item);
        if(item == null || !item.getStart()){
            return -100;
        }
        return item.getDestination();

    }
}
