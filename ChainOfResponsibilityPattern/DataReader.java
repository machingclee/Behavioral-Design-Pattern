package ChainOfResponsibilityPattern;

import ChainOfResponsibilityPattern.AbstractHandler.AbstractHandler;

public class DataReader {

    private AbstractHandler handler;

    public DataReader(AbstractHandler handler) {
        this.handler = handler;
    }

    public void read(String fileName) {
        handler.handle(fileName);
    }
}
