package TemplateMethodPattern.AbstractClasses;

public abstract class AbstractWindow {
  public String windowName;

  public AbstractWindow() {
    this.windowName = "New Window";
  }

  public AbstractWindow(String windowName) {
    this.windowName = windowName;
  }

  public void execute() {
    excuteBeforeClose();
    System.out.println("Removing the window from the screen");
    excuteAfterClose();
  }

  protected abstract void excuteBeforeClose();

  protected abstract void excuteAfterClose();

}