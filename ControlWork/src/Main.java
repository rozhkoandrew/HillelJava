/**
 * Created by andrejrozko on 27.07.17.
 */
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Shape first = new Circle(20,Colour.BLUE);
        Shape second = new Squre(20,Colour.GREEN);
        Shape third = new Squre(20,Colour.RED);


        List<Shape> list1 = new ArrayList<>();

        list1.add(first);
        list1.add(second);
        list1.add(third);

        System.out.println(calculateCoast(list1, Colour.BLUE));
        System.out.println(findMostExpensive(list1));

    }


    private static double calculateCoast (List<Shape> shapes,Colour filterColour){
        double coast = 0;
        for (Shape elem : shapes){
            coast += elem.size() * filterColour.coast;

        }
        return coast;
    }

    private static Shape findMostExpensive (List<Shape> shapes){

        Collections.sort(shapes);
        return shapes.get(0);


            }



}
