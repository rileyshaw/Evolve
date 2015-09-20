/**
 * Created by Riley Shaw on 9/6/2015.
 */
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.*;

public class World extends BasicGame{
    public double xpos = 300;
    public double ypos = 300;
    public double curDelta;
    private static long lastFrame;
    private Image img;

    public World(String gamename){
        super(gamename);
    }
    public static void main(String[] args){
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new World("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }
        catch (SlickException ex)
        {

        }
    }
    public void init(GameContainer gc) throws SlickException {
        img = new Image("res/circle.png");
        lastFrame = getTime();
    }
    public void update(GameContainer gc, int i) throws SlickException {
    }
    public void render(GameContainer gc, Graphics g) throws SlickException {
        curDelta = getDelta();
        pollInput();
        g.drawImage(img,(float)xpos,(float)ypos);
        System.out.println(xpos + " " + ypos);
    }
    public void pollInput(){
        if (Mouse.isButtonDown(0)) {
            int x = Mouse.getX();
            int y = Mouse.getY();
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_W)) {
            ypos -= .6 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_A)) {
            xpos -= .1 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_S)) {
            ypos += .1 * curDelta;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_D)) {
            xpos += .1 * curDelta;
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
