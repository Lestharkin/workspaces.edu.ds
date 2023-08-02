package edu.lesth.singly.linked;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.lesth.interfaces.linkedlist.LinkedListInterface;
import edu.lesth.interfaces.node.NodeInterface;
import edu.lesth.nodes.SinglyLinkedNode;

public class SinglyLinkedList<T> implements LinkedListInterface<T> {

  private SinglyLinkedNode<T> head;
  private SinglyLinkedNode<T> tail;
  private int size;

  @Override
  public boolean add(T object) {
    if (object != null) {
      try {
        if (isEmpty()) {
          tail = head = new SinglyLinkedNode<>(object);
        } else {
          tail.setNext(new SinglyLinkedNode<>(object));
          tail = tail.getNext();
        }
        size++;
        return true;
      } catch (Exception e) {
        Logger.getLogger(this.getClass().getName()).log(Level.WARNING, e.getMessage(), e);
      }
    }
    return false;
  }

  @Override
  public boolean add(NodeInterface<T> node, T object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add1'");
  }

  @Override
  public boolean add(NodeInterface<T> node, NodeInterface<T> next) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add2'");
  }

  @Override
  public boolean add(T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add3'");
  }

  @Override
  public boolean add(NodeInterface<T> node, T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add4'");
  }

  @Override
  public boolean addOnHead(T object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addOnHead'");
  }

  @Override
  public boolean addOnHead(T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addOnHead'");
  }

  @Override
  public boolean clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public LinkedListInterface<T> cloneList() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cloneList'");
  }

  @Override
  public boolean contains(T object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public NodeInterface<T> nodeOf(T object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'nodeOf'");
  }

  @Override
  public boolean isEmpty() {
    return this.head == null;
  }

  @Override
  public T get() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public T[] get(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public T getPrevious(NodeInterface<T> node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPrevious'");
  }

  @Override
  public T getFromEnd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFromEnd'");
  }

  @Override
  public T[] getFromEnd(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFromEnd'");
  }

  @Override
  public T pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  @Override
  public boolean remove(T object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean remove(NodeInterface<T> node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean removeAll(T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
  }

  @Override
  public boolean retainAll(T[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public LinkedListInterface<T> subList(NodeInterface<T> from, NodeInterface<T> to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subList'");
  }

  @Override
  public T[] toArray() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toArray'");
  }

  @Override
  public boolean sortObjectsBySize() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'sortObjectsBySize'");
  }

  @Override
  public Iterator<NodeInterface<T>> iterator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'iterator'");
  }
}
