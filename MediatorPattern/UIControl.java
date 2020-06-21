package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

import MediatorPattern.Interfaces.IObserver;
import MediatorPattern.Interfaces.IObserverable;

public abstract class UIControl implements IObserverable {
  private List<IObserver> observers = new ArrayList<IObserver>();

  public void addObserver(IObserver observer) {
    observers.add(observer);
  };

  @Override
  public void notifyChanges() {
    for (var observer : observers) {
      observer.update();
    }
  }

}
