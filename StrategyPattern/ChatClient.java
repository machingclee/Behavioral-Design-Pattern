package StrategyPattern;

import StrategyPattern.Interface.IEncryptionStrategy;

public class ChatClient {

  private IEncryptionStrategy encryptionStrategy;

  public ChatClient(IEncryptionStrategy encryptionStrategy) {
    this.encryptionStrategy = encryptionStrategy;
  }

  public void send(String message) {
    encryptionStrategy.encrypt(message);
  }

  // public void send(String message) {
  // if (encryptionAlgorithm == "DES")
  // System.out.println("Encrypting message using DES");
  // else if (encryptionAlgorithm == "AES")
  // System.out.println("Encrypting message using AES");
  // else
  // throw new UnsupportedOperationException("Unsupported encryption algorithm");

  // System.out.println("Sending the encrypted message...");
  // }

}
