package behavioral.memento;

public class Client {

    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 12);

        //save memento
        ConfigurationMemento memento = originator.createMemento();
        System.out.println("Current Memento: " + memento);

        // add it to history
        careTaker.addMemento(memento);

        //update state of memento
        originator.setHeight(10);
        originator.setWidth(30);

        //save memento
        System.out.println("**** Update Height and Width ******");
        ConfigurationMemento memento1 = originator.createMemento();
        System.out.println("Current Memento: " + memento1);

        // add it to history
        careTaker.addMemento(memento1);

        //update state of memento
        originator.setHeight(13);
        originator.setWidth(21);
        System.out.println("**** Update Height and Width  ******");
        System.out.println("Height: " + originator.getHeight() + " Width: " + originator.getWidth());

        ConfigurationMemento lastMemento = careTaker.undo();
        // restore the last saved memento
        originator.restoreMemento(lastMemento);
        System.out.println("**** After Undo Operation ******");
        System.out.println("Height: " + originator.getHeight() + " Width: " + originator.getWidth());
    }
}
