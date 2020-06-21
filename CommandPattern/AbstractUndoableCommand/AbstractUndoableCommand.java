package CommandPattern.AbstractUndoableCommand;

import CommandPattern.ContrastHistory;
import CommandPattern.Interfaces.ICommand;

public abstract class AbstractUndoableCommand implements ICommand {
   private ContrastHistory history;

   public AbstractUndoableCommand(ContrastHistory history) {
      this.history = history;
   }

   public void execute() {
      doExecute();
      history.push(this);
   }

   public abstract void doExecute();
};
