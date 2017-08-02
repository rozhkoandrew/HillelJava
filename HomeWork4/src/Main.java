/**
 * Created by andrejrozko on 02.08.17.
 */
public class Main {
    public static void main(String[] args) {
        ContainerCreator creator5 = new ContainerCreatorMethod();
        System.out.println(" *******************Deaful case*******************");
        System.out.println();
        Container h = creator5.create();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(6);
        h.add(7);
        h.add(8);
        System.out.println(h.get());
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println();

        ContainerCreator creator2 = new ContainerCreatorMethod();
        System.out.println(" *******************Normal Case*******************");
        System.out.println();
        Container c = creator2.create(3);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(8);
        System.out.println(c.get());
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println();

        ContainerCreator creator3 = new ContainerCreatorMethod();
        System.out.println(" *******************Empty List case*******************");
        System.out.println();
        Container v = creator3.create(5);

        System.out.println(v.get());
        System.out.println();
        System.out.println("***************************************************************");
        System.out.println();

        ContainerCreator creator = new ContainerCreatorMethod();
        System.out.println(" *******************In case of 0 index list*******************");
        System.out.println();
        Container f = creator.create(0);
        f.add(1);
        f.add(2);
        f.add(3);
        f.add(4);
        f.add(5);
        f.add(6);
        f.add(7);
        f.add(8);
        System.out.println(f.get());


    }
}
