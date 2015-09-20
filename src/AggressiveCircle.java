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
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public AggressiveCircle(int xpos, int ypos, int size){
        this.size = size;
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public void move() {
        if(curtarget == null){
            nextTarget();

        }else{
            if(curtarget.size > this.size){
                nextTarget();
                return;
            }
            double[] temp = PhysicsMethods.findNextMovement(this.xpos,this.ypos,curtarget.xpos,curtarget.ypos);
            this.xpos += temp[0] * this.speed * curdelta;
            this.ypos += temp[1]
        }
    }
    public Organism nextTarget() {
        return null;
    }
}
