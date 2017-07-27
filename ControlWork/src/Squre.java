/**
 * Created by andrejrozko on 27.07.17.
 */
import java.lang.Math;
public class Squre implements Shape {

    int side;
    Colour colour;

    Squre(int s){
        this.side = s;
    }

    public Squre(int i, Colour blue) {
    }

    @Override
    public double size() {
        return Math.pow(this.side, 2);
    }

    @Override
    public Colour colour() {
        return this.colour;
    }
}
