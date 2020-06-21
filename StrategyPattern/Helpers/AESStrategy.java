package StrategyPattern.Helpers;

import StrategyPattern.Interface.IEncryptionStrategy;

public class AESStrategy implements IEncryptionStrategy {

  @Override
  public void encrypt(String message) {
    System.out.println("Encrypting message using AES");
  }

}