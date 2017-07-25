public class FindLongest {
    public static void main(String[] args) {
        String [] list1 = {"sdcscsdc","sdcscscs","sdcfdvdfvsdv LONGEST"};

        int amount = 0;
        String longest = " ";
        int index = 0;



        for(int i = 0; i <  list1.length; i++){
            if(list1[i].length() > amount) {
                amount =  list1[i].length();
                longest = list1[i];
                index = i ;
            }

        }
        System.out.println(amount);
        System.out.println(longest);
        System.out.println(index);

    }
}
