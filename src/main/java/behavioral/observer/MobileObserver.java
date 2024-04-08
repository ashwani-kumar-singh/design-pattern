package behavioral.observer;

public class MobileObserver implements Observer {

    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        System.out.println("Mobile Display: Weather updated - " + weather);
    }
}
