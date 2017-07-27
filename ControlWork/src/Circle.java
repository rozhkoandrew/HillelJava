import com.sun.xml.internal.xsom.XSWildcard;
import org.jetbrains.annotations.NotNull;

/**
 * Created by andrejrozko on 27.07.17.
 */
public class Circle implements Shape {
    private int perimetr;
    private Colour colour;

    Circle(int p, Colour c) {
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
    public int compareTo(@NotNull Shape o) {
        return (int) ((this.size() * this.colour().coast) - (o.size() * o.colour().coast));
    }

}
