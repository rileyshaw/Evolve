/**
 * Created by Riley Shaw on 9/6/2015.
 */
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.Sys;
import org.newdawn.slick.*;

import java.util.ArrayList;

public class World extends BasicGame{


    public static int horizSize = 1400;
    public static int vertSize = 700;


    public double curDelta;
    private static long lastFrame;
    private Image img;
    private ArrayList<Organism> OrganismList;

    public World(String gamename){
        super(gamename);
    }
    public static void main(String[] args){
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new World("Game"));
            appgc.setDisplayMode(horizSize, vertSize, false);
            appgc.start();

        }
        catch (SlickException ex)
        {

        }
    }
    public void init(GameContainer gc) throws SlickException {
        img = new Image("res/circle.png");
       // gc.setVSync(true);
        lastFrame = getTime();
        OrganismList = new ArrayList<>();
        OrganismList.add(new AggressiveCircle(10,10,20));
        OrganismList.add(new AggressiveCircle(100,500,20));
    }
    public void update(GameContainer gc, int i) throws SlickException {
        curDelta = getDelta();
        for(int j = 0; j < OrganismList.size(); j++) {
          // OrganismList.get(i).
        }
        pollInput();
    }
    public void render(GameContainer gc, Graphics g) throws SlickException {
        for(int i = 0; i < OrganismList.size(); i++) {
            g.fillOval((int)OrganismList.get(i).xpos, (int)OrganismList.get(i).ypos,OrganismList.get(i).size,OrganismList.get(i).size);
        }

    }
    public void pollInput(){
        if (Mouse.isButtonDown(0)) {
            int x = Mouse.getX();
            int y = Mouse.getY();
            System.out.println("x:" + x + " y:" + y);
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            //ypos -= .2 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            //xpos -= .2 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
           // ypos += .2 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
           // xpos += .2 * curDelta;
        }
    }
    private static long getTime() {
        return (Sys.getTime() * 1000) / Sys.getTimerResolution();
    }
    private static double getDelta() {
        long currentTime = getTime();
        double delta = (double) currentTime - (double) lastFrame;
        lastFrame = getTime();
        return delta;
    }

}
