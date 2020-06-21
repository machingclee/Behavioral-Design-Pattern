package CommandPattern;

import java.util.ArrayDeque;
import java.util.Deque;

import CommandPattern.Interfaces.ICommand;

public class ContrastHistory {
  private Deque<ICommand> history = new ArrayDeque<ICommand>();

  public void push(ICommand setContrastCommand) {
    history.add(setContrastCommand);
  }

  public ICommand pop() {
    return history.removeLast();
  }

  public int size() {
    return history.size();
  }
}