/**
 * Created by andrejrozko on 27.07.17.
 */
public class Circle implements Shape {
    int perimetr;
    Colour colour;

    Circle(int p, Colour blue){
        this.perimetr = p;
    }


    @Override
    public double size() {
        return Math.pow(this.perimetr, 2) * 3.141592653;
    }

    @Override
    public Colour colour() {
        return colour;
    }
}
