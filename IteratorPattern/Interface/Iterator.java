package IteratorPattern.Interface;

public interface Iterator {
  boolean hasNext();

  Object current();

  void next();
}