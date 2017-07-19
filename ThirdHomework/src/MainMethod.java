import java.util.Arrays;
public class MainMethod {
    public static void main(String[] args) {
        int[] list3 = new int[]{5, 4, 0, 37, 0, 0, 10};
        int[] list2 = new int[]{5, 4, 0, 38, 0, 0, 10};
        ListMethod firstList = new ListMethod();
        ListMethod secondList = new ListMethod();

        firstList.lstV = list3;
        secondList.lstV = list2;

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
        System.out.println("Summ of list = " + firstList.countSum(firstList.lstV));
        System.out.println();

        System.out.println("Lenght of list = " + firstList.countlengh(firstList.lstV));
        System.out.println();

        System.out.println("Avarage number is " + firstList.countAvarage(firstList.lstV));
        System.out.println();

    }
}
