package ObserverPattern.Observer;

public class Chart implements IObeserver{
    @Override
    public void update(int value) {
        System.out.println("Chart got notified!"+value);
    }
}
