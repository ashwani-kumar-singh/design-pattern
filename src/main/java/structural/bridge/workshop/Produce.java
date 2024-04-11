package structural.bridge.workshop;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println(" Produced");
    }
}
