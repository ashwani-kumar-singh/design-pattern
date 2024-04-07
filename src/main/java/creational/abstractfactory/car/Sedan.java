package creational.abstractfactory.car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan");
    }
}
