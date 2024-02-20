package lenin.util.list;

import lenin.util.collection.AbstractCollection;

public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {

  protected int size;

  protected AbstractList() {
    size = 0;
  }

  @Override
  public int size() {
    return size;
  }
  
}
