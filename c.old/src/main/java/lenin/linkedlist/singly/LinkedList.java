package lenin.linkedlist.singly;

import java.util.function.Function;

import lenin.linkedlist.node.singly.LinkedNode;
import lenin.util.collection.Collection;
import lenin.util.iterator.Iterator;
import lenin.util.list.AbstractList;

public class LinkedList<E> extends AbstractList<E> {

  private LinkedNode<E> head;
  private LinkedNode<E> tail;
  private LinkedNode<E> inode;

  public LinkedList() {
    super();
    head = null;
    tail = null;
    inode = null;
  }

  public LinkedList(E element) {
    super();
    add(element);
  }

  @Override
  public boolean add(E element) {
    try {
      LinkedNode<E> node = new LinkedNode<>(element);
      if (isEmpty()) {
        head = node;
        tail = node;
        size++;
      } else {
        tail.setNext(node);
        tail = node;
        size++;
      }
      return true;
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
    return false;
    

  }

  @Override
  public boolean clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public boolean contains(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean isEmpty() {
    return head == null && tail == null && inode == null && size == 0;
  }

  @Override
  public boolean reverse() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reverse'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public void forEach(Function<E, Void> action) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'forEach'");
  }

  @Override
  public Iterator<E> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }

}
