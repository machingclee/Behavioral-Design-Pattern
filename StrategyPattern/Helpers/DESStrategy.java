package StrategyPattern.Helpers;

import StrategyPattern.Interface.IEncryptionStrategy;

public class DESStrategy implements IEncryptionStrategy {

  @Override
  public void encrypt(String message) {
    System.out.println("Encrypting message using DES");
  }

}