package ObserverPattern.Observer;


import java.util.ArrayList;
import java.util.List;

public class ObservableSubject {

    private List<IObeserver> observers = new ArrayList<>();
    public  void addObserver(IObeserver observer){
        observers.add(observer);
    }
    public  void removeObserver(IObeserver observer){
        observers.remove(observer);
    }
    public  void notifyObserver(int value){
        for (IObeserver observer: observers
             ) {
            observer.update(value);
        }
    }
}
