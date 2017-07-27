import org.jetbrains.annotations.NotNull;

/**
 * Created by andrejrozko on 27.07.17.
 */
public class Circle implements Shape {
    int perimetr;
    Colour colour;

    Circle(int p, Colour c){
        this.perimetr = p;
        this.colour = c;
    }


    @Override
    public double size() {
        return Math.pow(this.perimetr, 2) * 3.141592653;
    }

    @Override
    public Colour colour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimetr=" + perimetr +
                ", colour=" + colour +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
//
//    @Override
//    public int compareTo(Object o){
//        return (int) (this.size() + this.colour().coast - size() + colour().coast);
//    }
}
