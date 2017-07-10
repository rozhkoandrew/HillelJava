/**
 * Created by andrejrozko on 04.07.17.
 */
import java.util.Random;
import java.util.ArrayList;
public class MainMethod {
    public static void main(String[] args) {
        //--------------------------------------------------------------------
        System.out.println("*************COMPARETO implements**********************");
        System.out.println();
        MyComparableClass ed = new MyComparableClass();
        ed.day = 20;
        ed.month = 5;

        MyComparableClass ed2 = new MyComparableClass();
        ed2.day = 10;
        ed2.month = 6;

        System.out.println(ed.compareTo(ed2) + " days defference betwen comparing to first data");
        System.out.println();
        System.out.println("**************************************************");
        //--------------------------------------------------------------------

        //--------------------------------------------------------------------
        System.out.println("*************Find min 3 values**********************");
        System.out.println();
        ArrayList<Integer> arrlist1 = new ArrayList<Integer>(10);
        Random rand = new Random();
        //rand.setSeed(System.currentTimeMillis());
        for (int i=0; i<10; i++)
        {
            Integer r = rand.nextInt() % 10;
            arrlist1.add(r);
        }

        System.out.println("Before" + arrlist1);

        FindMinThreeValues findValues = new FindMinThreeValues();
        System.out.println("After " + findValues.return3MinValue(arrlist1));
        System.out.println();
        System.out.println("**************************************************");
        //--------------------------------------------------------------------
        System.out.println();


        //--------------------------------------------------------------------
        System.out.println("**********************Remove element by index ********************************");
        System.out.println();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        RemoveByIndex removeByIndex = new RemoveByIndex();
        arrlist.add(33);
        arrlist.add(44);
        arrlist.add(55);
        arrlist.add(15);

        System.out.println("Size of list: " + arrlist.size());

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        removeByIndex.removeByIndex(arrlist,2);

        System.out.println("Now, Size of list: " + arrlist.size());

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }
        System.out.println();
        System.out.println("**************************************************");
        //--------------------------------------------------------------------
        System.out.println();

        //--------------------------------------------------------------------
        System.out.println("*************Comparable**********************");
        System.out.println(" Empty");
        System.out.println("**************************************************");
        //----------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------
        System.out.println("*************Devision**********************");
        System.out.println();
        DeviderCycle devC = new DeviderCycle();
        devC.devideNumbers(13,22);
        System.out.println(22 % 13 + " Cheking");
        System.out.println(22 / 13 +  " Cheking");
        System.out.println();
        System.out.println("**************************************************");
        //----------------------------------------------------------------------
        System.out.println();
        //--------------------------------------------------------------------
        System.out.println("*************Thereebonachi**********************");
        System.out.println();
        ThreeBonachi bonachi = new ThreeBonachi();
        long startRecursionTime = System.currentTimeMillis();
        System.out.println(bonachi.threeonachi(8));
        long endRecursionTime = System.currentTimeMillis();
        System.out.print("Recursion threebonachi working time: ");
        System.out.println(endRecursionTime - startRecursionTime + " MS");

        long startCycleTime = System.currentTimeMillis();
        System.out.println(bonachi.threebonaciCycle(8));
        long endCycleTime = System.currentTimeMillis();
        System.out.print("Recursion threebonachi working time: ");
        System.out.println(endCycleTime - startCycleTime + " MS");
        System.out.println();
        System.out.println("**************************************************");
        //----------------------------------------------------------------------

    }
}