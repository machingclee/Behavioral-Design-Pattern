package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

import IteratorPattern.Interface.Iterator;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator() {
    return new CollectionIterator(this);
  }

  public class CollectionIterator implements Iterator {
    private ProductCollection productCollection;
    private int index = 0;

    public CollectionIterator(ProductCollection productCollection) {
      this.productCollection = productCollection;
    }

    @Override
    public boolean hasNext() {
      var length = products.size();

      if (length == 0)
        return false;

      return index < products.size();
    }

    @Override
    public Product current() {
      return productCollection.products.get(index);
    }

    @Override
    public void next() {
      index++;
    }
  }
}
