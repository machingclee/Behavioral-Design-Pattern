package ChainOfResponsibilityPattern.AbstractHandler;

public class XlsHandler extends AbstractHandler {

  public XlsHandler(AbstractHandler next) {
    super(next);
  }

  @Override
  protected boolean doHandle(String fileName) {
    if (fileName.endsWith(".xls")) {
      System.out.println("Reading data from an Excel spreadsheet.");
      return false;
    }
    return true;
  }

}