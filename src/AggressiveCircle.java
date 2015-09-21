import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

import java.util.ArrayList;

/**
 * Created by Riley Shaw on 9/20/2015.
 */
public class AggressiveCircle extends Organism {
    private Organism curtarget;
    private ArrayList<Organism> organismList;
    public AggressiveCircle(){
        super();
        this.hitbox = new Rectangle((float)(xpos + (size/4)),(float)(ypos + (size/4)),size/2,size/2);
    }
    public AggressiveCircle(int size){
        super(size);
        this.hitbox = new Rectangle((float)(xpos + (size/4)),(float)(ypos + (size/4)),size/2,size/2);
    }
    public AggressiveCircle(int xpos, int ypos){
        this.organismList = World.OrganismList;//
        this.xpos = xpos;
        this.ypos = ypos;
        this.hitbox = new Rectangle((float)(this.xpos + (size/4)),(float)(this.ypos + (size/4)),size/2,size/2);
    }
    public AggressiveCircle(int xpos, int ypos, int size){
        this.hitbox = new Rectangle((float)(this.xpos + (size/4)),(float)(this.ypos + (size/4)),size/2,size/2);
        this.organismList = World.OrganismList;
        this.size = size;
        this.xpos = xpos;
        this.ypos = ypos;
}
    public void move() {
        if(curtarget == null){
             curtarget =  nextTarget();
        }else{
            if(curtarget.size > this.size){
                nextTarget();
                return;
            }
            double[] temp = PhysicsMethods.findNextMovement(this.xpos,this.ypos,curtarget.xpos,curtarget.ypos);
            this.xpos += temp[0] * this.speed * World.curDelta;
            this.ypos += temp[1] * this.speed * World.curDelta;
        }
        hitbox.setLocation((float)(this.xpos + (size/4)),(float)(this.ypos + (size/4)));
        if(hitbox.intersects(curtarget.hitbox)) {
            collisionMade();
        }
    }
    public Organism nextTarget() {
        return PhysicsMethods.findClosestOrganism(this);
    }
    public void collisionMade() {
        System.out.println(curtarget);
        organismList.remove(curtarget);
    }
}
