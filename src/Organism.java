/**
 * Created by Riley Shaw on 9/6/2015.
 */

public class Organism {
    public int size = 10;
    public double speed = .1;
    public double xpos;
    public double ypos;
    public Organism(){

    }
    public Organism(int size){
        System.out.println("her");
        this.size = size;
        xpos = (int)(Math.random() * 1800);
        ypos = (int)(Math.random() * 900);
    }
    public Organism(int xpos, int ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public Organism(int xpos, int ypos, int size){
        this.size = size;
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public void move() {
        System.out.println("wrong method bruh");
    }
}
