package ObserverMediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private List<IObserver> observers = new ArrayList<>();

    public void attach(IObserver observer){
        observers.add(observer);
    }
    
    protected void notifyObservers(){
        for (IObserver obserevr: observers) {
            obserevr.update();
        }
    }
}
