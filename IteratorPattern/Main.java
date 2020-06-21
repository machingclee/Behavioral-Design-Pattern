package IteratorPattern;

import IteratorPattern.Interface.Iterator;

public class Main {
  public static void main(String[] args) {
    var productCollection = new ProductCollection();

    productCollection.add(new Product(1, "ice-scream"));
    productCollection.add(new Product(2, "banana"));
    productCollection.add(new Product(3, "FinalFantasy XIV ShadowBringer"));
    productCollection.add(new Product(4, "ice-scream"));
    productCollection.add(new Product(5, "banana"));
    productCollection.add(new Product(6, "FinalFantasy XIV ShadowBringer"));
    productCollection.add(new Product(7, "ice-scream"));
    productCollection.add(new Product(8, "banana"));
    productCollection.add(new Product(9, "FinalFantasy XIV ShadowBringer"));
    productCollection.add(new Product(10, "ice-scream"));
    productCollection.add(new Product(11, "banana"));
    productCollection.add(new Product(12, "FinalFantasy XIV ShadowBringer"));

    Iterator iterator = productCollection.createIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.current().toString());
      iterator.next();
    }
  }
}