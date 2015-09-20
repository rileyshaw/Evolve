/**
 * Created by Riley Shaw on 9/20/2015.
 */
public class AggressiveCircle extends Organism {
    private Organism curtarget;

    public AggressiveCircle(){
        super();
    }
    public AggressiveCircle(int size){
        this.size = size;
    }
    public AggressiveCircle(int xpos, int ypos){

    }
    public AggressiveCircle(int xpos, int ypos, int size){

    }
    public move() {
        if(!curtarget){
            nextTarget();
        }
    }
    public nextTarget() {

    }
}
