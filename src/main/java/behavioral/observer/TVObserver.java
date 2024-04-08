package behavioral.observer;

public class TVObserver implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("TV Display: Weather updated - " + weather);
    }
}
