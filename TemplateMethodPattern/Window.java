package TemplateMethodPattern;

import TemplateMethodPattern.AbstractClasses.AbstractWindow;

public class Window extends AbstractWindow {

  public Window(String windowName) {
    super(windowName);
  }

  @Override
  protected void excuteBeforeClose() {
    System.out.println("I am doing something before closing " + this.windowName);
  }

  @Override
  protected void excuteAfterClose() {
    System.out.println("I am doing something after closing " + this.windowName);
  }
}
