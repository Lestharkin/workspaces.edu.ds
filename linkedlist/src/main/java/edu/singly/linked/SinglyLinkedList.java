package edu.singly.linked;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.interfaces.linkedlist.LinkedListInterface;
import edu.interfaces.node.NodeInterface;
import edu.nodes.SinglyListNode;

public class SinglyLinkedList<T> implements LinkedListInterface<T> {

  private SinglyListNode<T> head;
  private SinglyListNode<T> tail;
  private SinglyListNode<T> inode;
  private int size;

  @Override
  public boolean add(T object) {
    if(object != null) {
        try {
          if(isEmpty()){
            tail = head = new SinglyListNode<>(object);
          } else {
            tail.setNext(new SinglyListNode<>(object));
            tail = tail.getNext();
          }
          size++;
          return true;
        } catch (Exception e) {
          // TODO: handle exception
        }
    }
    return false;
  }

  @Override
  public boolean add(NodeInterface node, Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean add(NodeInterface node, NodeInterface next) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean add(Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean add(NodeInterface node, Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }

  @Override
  public boolean addOnHead(Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addOnHead'");
  }

  @Override
  public boolean addOnHead(Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addOnHead'");
  }

  @Override
  public boolean clear() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'clear'");
  }

  @Override
  public LinkedListInterface cloneList() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cloneList'");
  }

  @Override
  public boolean contains(Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public boolean contains(Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'contains'");
  }

  @Override
  public NodeInterface nodeOf(Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'nodeOf'");
  }

  @Override
  public boolean isEmpty() {
    return this.head == null;
  }

  @Override
  public Object get() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public Object[] get(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public Object getPrevious(NodeInterface node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getPrevious'");
  }

  @Override
  public Object getFromEnd() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFromEnd'");
  }

  @Override
  public Object[] getFromEnd(int n) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFromEnd'");
  }

  @Override
  public Object pop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pop'");
  }

  @Override
  public boolean remove(Object object) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean remove(NodeInterface node) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public boolean removeAll(Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
  }

  @Override
  public boolean retainAll(Object[] objects) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'retainAll'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public LinkedListInterface subList(NodeInterface from, NodeInterface to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'subList'");
  }

  @Override
  public Object[] toArray() {
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
    inode = head;

    return new Iterator<NodeInterface<T>>() {

      public boolean hasNext() {
        return inode != null;
      }

      public NodeInterface<T> next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        NodeInterface<T> node = inode;
        inode = inode.getNext();
        return node;
      }
    };
  }
  
}
