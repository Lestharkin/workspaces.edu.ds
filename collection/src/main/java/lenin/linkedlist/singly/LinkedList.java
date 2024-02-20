package lenin.linkedlist.singly;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import lenin.linkedlist.node.singly.LinkedNode;
import lenin.util.collection.Collection;
import lenin.util.iterator.Iterator;
import lenin.util.list.AbstractList;
import lenin.util.list.List;

public class LinkedList<E> extends AbstractList<E> {

  private LinkedNode<E> head;
  private LinkedNode<E> tail;

  public LinkedList() {
    super();
    head = null;
    tail = null;
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
    return head == null && tail == null && size == 0;
  }

  @Override
  public boolean reverse() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'reverse'");
  }

  @Override
  public void forEach(Function<E, Void> action) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'forEach'");
  }

  @Override
  public Iterator<E> iterator() {
    return new Iterator<E>() {
      LinkedNode<E> inode = head;  

      public boolean hasNext() {
        return inode != null;
      }

      public E next() {
        if(!hasNext()) {
          throw new NoSuchElementException("No more elements in the list.");
        }
        E element = inode.get();
        inode = inode.getNext();
        return element;
      }
    };
  }

  @Override
  public boolean add(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean add(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean addFirst(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
  }

  @Override
  public boolean addFirst(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
  }

  @Override
  public boolean addFirst(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addFirst'");
  }

  @Override
  public E peek() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

  @Override
  public E peekLast() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peekLast'");
  }

  @Override
  public E[] peekArray(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peekArray'");
  }

  @Override
  public E[] peekLastArray(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peekLastArray'");
  }

  @Override
  public List<E> peekCollection(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peekCollection'");
  }

  @Override
  public List<E> peekLastCollection(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peekLastCollection'");
  }

  @Override
  public E poll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'poll'");
  }

  @Override
  public E pollLast() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollLast'");
  }

  @Override
  public E[] pollArray(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollArray'");
  }

  @Override
  public E[] pollLastArray(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollLastArray'");
  }

  @Override
  public List<E> pollCollection(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollCollection'");
  }

  @Override
  public List<E> pollLastCollection(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pollLastCollection'");
  }

  @Override
  public boolean remove(E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean remove(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean remove(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean remove(Predicate<E> filter) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean replace(E element, E newElement, Predicate<E> comparator) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'replace'");
  }

  @Override
  public boolean replace(E[] array, E[] newArray, Predicate<E> comparator) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'replace'");
  }

  @Override
  public boolean replace(Collection<E> collection, Collection<E> newCollection, Predicate<E> comparator) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'replace'");
  }

  @Override
  public boolean retain(E[] array) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'retain'");
  }

  @Override
  public boolean retain(Collection<E> collection) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'retain'");
  }

  @Override
  public boolean set(E index, E element) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'set'");
  }

  @Override
  public boolean sort(ToIntFunction<E> toInt) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sort'");
  }

  @Override
  public List<E> subList(E from, E to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subList'");
  }

  @Override
  public E[] toArray() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

}
