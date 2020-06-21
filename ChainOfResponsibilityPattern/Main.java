package ChainOfResponsibilityPattern;

import ChainOfResponsibilityPattern.AbstractHandler.NumberHandler;
import ChainOfResponsibilityPattern.AbstractHandler.QBWHandler;
import ChainOfResponsibilityPattern.AbstractHandler.XlsHandler;

public class Main {
  public static void main(String[] args) {
    var qbwHandler = new QBWHandler(null);
    var numberHandler = new NumberHandler(qbwHandler);
    var xlsHandle = new XlsHandler(numberHandler);

    var dataReader = new DataReader(xlsHandle);
    dataReader.read("programmer_is_fun.numbers");
  }
}