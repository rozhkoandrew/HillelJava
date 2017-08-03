/**
 * Created by andrejrozko on 03.08.17.
 */
import java.util.List;
import java.util.ArrayList;
public class AddLists {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();


        for(int i = 1; i < 11 ; i++){
            firstList.add(i);
            secondList.add(i);
        }

        System.out.println(firstList);
        System.out.println(secondList);


        for (int i = 0; i < (firstList.size() < secondList.size() ? firstList.size() : secondList.size()) ; i ++ ){
            finalList.add(firstList.get(i));
            finalList.add(secondList.get(i));
        }

        System.out.println(finalList);

    }

}
