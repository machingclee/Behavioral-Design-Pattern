package ChainOfResponsibilityPattern.AbstractHandler;

public abstract class AbstractHandler {
  private AbstractHandler next;

  public AbstractHandler(AbstractHandler next) {
    this.next = next;
  }

  public void handle(String fileName) {
    boolean doContinue = doHandle(fileName);

    if (doContinue == false)
      return;

    if (next == null)
      throw new UnsupportedOperationException("File format not supported.");
    else
      next.handle(fileName);
  }

  protected abstract boolean doHandle(String fileName);
}