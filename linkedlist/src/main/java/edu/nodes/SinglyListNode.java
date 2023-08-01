package edu.nodes;

public class SinglyListNode<T> extends Node<T>{
  
  SinglyListNode<T> next;

  public SinglyListNode() {
    super();
    this.next = null;
  }

  public SinglyListNode(T object) {
    super(object);
    this.next = null;
  }

  public SinglyListNode(T object, SinglyListNode<T> next) {
    super(object);
    this.next = next;
  }

  public SinglyListNode<T> getNext() {
    return this.next;
  }

  public void setNext(SinglyListNode<T> next) {
    this.next = next;
  }

}
