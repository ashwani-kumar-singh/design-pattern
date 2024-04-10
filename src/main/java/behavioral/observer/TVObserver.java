package behavioral.observer;

public class TVObserver implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
