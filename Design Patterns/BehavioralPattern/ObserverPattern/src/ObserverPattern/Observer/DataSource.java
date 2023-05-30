package ObserverPattern.Observer;

public class DataSource extends ObservableSubject {
    private  int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObserver(value);
    }
}