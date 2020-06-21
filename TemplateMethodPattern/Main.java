package TemplateMethodPattern;

import TemplateMethodPattern.AbstractClasses.AbstractWindow;

public class Main {
  public static void main(String[] args) {
    AbstractWindow window = new Window("My new new window");
    window.execute();
  }
}