/**
 * Created by andrejrozko on 27.07.17.
 */
public enum  Colour {
    RED(25),
    GREEN(40),
    BLUE(30);

    //get coast
    int coast;


    Colour(int c){
        this.coast = c;
    }

    @Override
    public String toString(){
        return this.coast != 0 ? String.valueOf(this.coast) : " ";
    }
}
