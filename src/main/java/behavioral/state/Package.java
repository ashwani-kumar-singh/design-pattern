package behavioral.state;

public class Package {
    private PackageState state = new OrderedState();

    public void setPackageState(PackageState packageState) {
        this.state = packageState;
    }

    public void nextState() {
        state.next(this);
    }

    public void prevState() {
        state.prev(this);
    }

    public void printStatus() {
        state.displayStatus();
    }
}
