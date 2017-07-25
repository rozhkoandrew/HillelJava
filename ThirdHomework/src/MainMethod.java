import java.util.Arrays;
public class MainMethod {
    public static void main(String[] args) {

        Integer [] list3 = new Integer[] {5, 4, 0, 37, 0, 0, 10};
        Integer [] list2 = new Integer[] {5, 4, 0, 37, 0, 0, 10};

        ListMethod <Integer> firstList = new ListMethod<>(list3);
        ListMethod<Integer> secondList = new ListMethod<>(list2);

//        firstList.lstV = list3;
//        secondList.lstV = list2;

        System.out.println(firstList.hashCode());

        boolean x = firstList.equals(secondList);
        if (x) {
            System.out.println("1st " + Arrays.toString(firstList.lstV) + " and  2nd" + Arrays.toString(secondList.lstV) + " objects are equal");
        } else {
            System.out.println("1st " + Arrays.toString(firstList.lstV) + " and  2nd" + Arrays.toString(secondList.lstV) + " objects are NOT equal");
        }
        System.out.println();

        System.out.println("List  " + Arrays.toString(list3));
        System.out.println();
        System.out.println("Summ of list = " + firstList.countSum());
        System.out.println();

        System.out.println("Lenght of list = " + firstList.countlengh());
        System.out.println();

        System.out.println("Avarage number is " + firstList.countAvarage());
        System.out.println();

    }
}