package behavioral.state;

public class DeliveredState implements PackageState {
    @Override
    public void next(Package pkg) {
        pkg.setPackageState(new ReceivedState());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setPackageState(new OrderedState());
    }

    @Override
    public void displayStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }
}
