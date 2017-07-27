import org.jetbrains.annotations.NotNull;

/**
 * Created by andrejrozko on 27.07.17.
 */
public interface Shape extends Comparable<Shape> {
    @Override
    int compareTo(@NotNull Shape o);

    double size();
    Colour colour();


}
