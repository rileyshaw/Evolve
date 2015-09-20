import java.util.ArrayList;

/**
 * Created by Riley Shaw on 9/20/2015.
 */
public class PhysicsMethods {
    public static double[] findNextMovement(double x1, double y1, double x2, double y2) {
        double temp[] = new double[2];
        temp[0] = (x2-x1)/(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        temp[1] = (y2-y1)/(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        return temp;
    }
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static Organism findClosestOrganism(ArrayList<Organism> organisms){
        int lowestIndex = 0;
        double lowestDistance;
        for(int i = 0; i < organisms.size();i++){
            
        }
        return null;
    }
}
