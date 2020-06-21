package ChainOfResponsibilityPattern.AbstractHandler;

public class QBWHandler extends AbstractHandler {

  public QBWHandler(AbstractHandler next) {
    super(next);
  }

  @Override
  protected boolean doHandle(String fileName) {
    if (fileName.endsWith(".qbw")) {
      System.out.println("Reading data from a QuickBooks file.");
      return false;
    }
    return true;
  }

}