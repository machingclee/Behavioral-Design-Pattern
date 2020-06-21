package CommandPattern;

import CommandPattern.Interfaces.IUndoCommand;

public class UndoCommand implements IUndoCommand {

  private ContrastHistory history;

  public UndoCommand(ContrastHistory history) {
    this.history = history;
  }

  @Override
  public void undo() {
    var length = history.size();
    if (length > 0) {
      history.pop().unexecute();
    }
  }

}