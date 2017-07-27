import org.jetbrains.annotations.NotNull;

/**
 * Created by andrejrozko on 27.07.17.
 */
public interface Shape  extends Comparable{
    double size();
    Colour colour();


//    @Override
//    default int compareTo(@NotNull Object o){
//        return (int) (this.size() + this.colour().coast - size() + colour().coast);
//    }


}
