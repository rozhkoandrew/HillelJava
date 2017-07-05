/**
 * Created by andrejrozko on 04.07.17.
 */
public class ThreeBonachi {
     public int threeonachi(int number) {
        if (number < 2) {
            return 0;
        }
         else if (number < 4 | number > 2) {
            return 1;
        }

        else {
            return threeonachi(number - 1) + threeonachi(number - 2) + threeonachi(number - 3);
        }

    }

    public int threebonaciCycle(int number){
         int counter = 8;
         int result = 0;
         int first = 1;
         int second = 1;
         int third = 1;
         int fibonachi;
         while (counter < number){
             fibonachi = first + second + third;
             first = second;
             second += first  ;
             third = fibonachi;
             result = fibonachi;
             counter ++;
         }
         return result;

    }


}
