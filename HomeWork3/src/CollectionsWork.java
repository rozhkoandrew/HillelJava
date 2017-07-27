/**
 * Created by andrejrozko on 27.07.17.
 */
import java.util.ArrayList;
import java.util.List;

 class CollectionsWork {

    List<String> FindNumbersOfSum(int[] list, int number) {
        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.length - 1; i++) {
            for (int y = 0; y < list.length - 1; y++) {
                if (list[i] == list[y]) {
                    continue;
                } else if (list[i] + list[y] == number) {
                    newList.add("(" + list[i] + " + " + list[y] + ")");
                }
            }
        }
        return newList;
    }
}
