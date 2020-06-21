package ChainOfResponsibilityPattern.AbstractHandler;

public class NumberHandler extends AbstractHandler {

  public NumberHandler(AbstractHandler next) {
    super(next);
  }

  @Override
  protected boolean doHandle(String fileName) {
    if (fileName.endsWith(".numbers")) {
      System.out.println("Reading data from a Numbers spreadsheet.");
      return false;
    }
    return true;
  }

}