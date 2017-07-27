/**
 * Created by andrejrozko on 27.07.17.
 */
import java.util.ArrayList;
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

        System.out.println();

    }


    private double calculateCoast (List<Shape> shapes,Colour filterColour){
        double coast = 0;
        for (Shape elem : shapes){
            coast += elem.size() * filterColour.coast;

        }
        return coast;
    }

    private int findMostExpensive (List<Shape> shapes){
        int moxtExpensive = 0;

        for (int i = 0 ; i < shapes.size()-1; i ++){
            if (shapes.get(i).compareTo(shapes.get(i + 1)) > moxtExpensive) {
                moxtExpensive = (int )shapes.get(i).size();

            }

        }
        return moxtExpensive;
    }


}
