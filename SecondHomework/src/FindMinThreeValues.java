/**
 * Created by andrejrozko on 05.07.17.
 */
import java.util.ArrayList;
class FindMinThreeValues {
    ArrayList<Integer> return3MinValue(ArrayList<Integer> array) {
        int maxValue;
        int minValue2;
        int minValue3;
        int minValue1;
        maxValue = 0;
        ArrayList<Integer> newList = new ArrayList<Integer>(3);
        for (Integer value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        minValue1 = maxValue;
        minValue2 = maxValue;
        minValue3 = maxValue;
        for (Integer value : array) {
            if (value < minValue1) {
                minValue1 = value;
            } else if (value < minValue2 ) {
                minValue2 = value;
            } else if (value < minValue3) {
                minValue3 = value;
            }
        }
        newList.add(minValue1);
        newList.add(minValue2);
        newList.add(minValue3);
        return newList;
    }
}

