/**
 * Created by andrejrozko on 27.07.17.
 */

import org.jetbrains.annotations.NotNull;

import java.lang.Math;

public class Squre implements Shape {

    int side;
    Colour colour;

    Squre(int s) {
        this.side = s;
    }

    public Squre(int i, Colour c) {
        this.side = i;
        this.colour = c;
    }

    @Override
    public double size() {
        return Math.pow(this.side, 2);
    }

    @Override
    public Colour colour() {
        return this.colour;
    }

    @Override
    public String toString() {
        return "Squre{" +
                "side=" + side +
                ", colour=" + colour +
                '}';
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return (int) (this.size() * this.colour().coast - size() * colour().coast);
    }

//    @Override
//    public int compareTo(Object o){
//        return (int) (this.size() + this.colour().coast - size() + colour().coast);
//    }


}