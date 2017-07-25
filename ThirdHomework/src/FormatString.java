/**
 * Created by andrejrozko on 21.07.17.
 */
import java.time.LocalDate;

public class FormatString {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 7, 17);

        // Output must be 17 July 2017
        System.out.println(String.format("%1$te %1$tb %1$tY", date));
    }
}
