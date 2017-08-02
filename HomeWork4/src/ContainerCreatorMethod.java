/**
 * Created by andrejrozko on 02.08.17.
 */
public class ContainerCreatorMethod implements ContainerCreator{
    private int size1 = 5;

    @Override
    public Container create(int size) {
        return new Container(size);

    }

    @Override
    public Container create() {
        return new Container(this.size1);

    }

}
