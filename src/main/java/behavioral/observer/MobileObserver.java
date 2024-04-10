package behavioral.observer;

public class MobileObserver implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("Mobile Display: Weather updated - " + weather);
    }
}
