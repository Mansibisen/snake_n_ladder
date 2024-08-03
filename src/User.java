import java.security.PublicKey;

public class User {

    private  String name;
    private Color  color;
    private int currPos;


    public User(String name, Color color, int currPos) {
        this.name = name;
        this.color = color;
        this.currPos = currPos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrPos() {
        return currPos;
    }

    public void setCurrPos(int currPos) {
        this.currPos = currPos;
    }
}



