


public class props {

    private Boolean start;
    private int destination;

    public props(Boolean start, int destination) {
        this.start = start;
        this.destination = destination;
    }

    public Boolean getStart() {
        return start;
    }

    public void setStart(Boolean start) {
        this.start = start;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }
}

class snake extends props{
    public snake(Boolean start, int destination) {
        super(start, destination);
    }  //Inherits parent class methods

}

class ladder extends props{
    public ladder(Boolean start, int destination) {
        super(start, destination);
    }  //Inherits parent class methods

}



