import org.jetbrains.annotations.NotNull;

/**
 * Created by andrejrozko on 10.07.17.
 */
public class MyComparableClass implements Comparable <MyComparableClass> {
        int day ;
        int month ;


    @Override
    public int compareTo(@NotNull MyComparableClass o) {
        int dayDif;
        int mountDiff;

        dayDif = this.day - o.day;
        mountDiff = (this.month * 30) - (o.month * 30);

        return mountDiff + dayDif;

    }
}
