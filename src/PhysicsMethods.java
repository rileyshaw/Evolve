/**
 * Created by Riley Shaw on 9/20/2015.
 */
public class PhysicsMethods {
    public static double[] findNextMovement(double x1, double y1, double x2, double y2) {
        double temp[] = new double[2];
        temp[0] = (x2-x1)/(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        temp[1] = (y2-y1)/(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
        System.out.println("x:" + temp[0] + " y:" + temp[1]);
        return temp;
    }
}
