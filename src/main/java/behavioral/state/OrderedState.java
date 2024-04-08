package behavioral.state;

public class OrderedState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setPackageState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is in root state");
    }

    @Override
    public void displayStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }
}
