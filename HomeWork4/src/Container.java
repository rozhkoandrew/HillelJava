
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

class Container {

    private int size;
    private List<Integer> newList2 = new ArrayList<>(this.size);


    Container(int s){
        this.size = s;
    }

    void add(int elem) {
        if (this.newList2.size() >= this.size) {
            try {
                this.newList2.remove(0);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println(" List have a fix 0 size");
                System.out.println();
                System.out.println("***************************************************************");
                System.exit(0);
            }
        }
        this.newList2.add(elem);
    }

    List<Integer> get() throws IndexOutOfBoundsException{
        if (this.newList2.size() == 0) {
            try {
                return this.newList2.subList(3, 4);
            } catch (IndexOutOfBoundsException e) {
                System.out.print("This list is empty -- ");
                return this.newList2;
            }
        } else {
            return this.newList2;
        }
    }
}