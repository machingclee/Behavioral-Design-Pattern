package StrategyPattern;

import StrategyPattern.Helpers.AESStrategy;

public class Main {
  public static void main(String[] args) {

    var chatClient = new ChatClient(new AESStrategy());

    chatClient.send("hello!");
  }
}