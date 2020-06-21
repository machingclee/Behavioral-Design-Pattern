package MediatorPattern.Interfaces;

public interface IObserverable {
  public void notifyChanges();

  public void addObserver(IObserver observer);

}