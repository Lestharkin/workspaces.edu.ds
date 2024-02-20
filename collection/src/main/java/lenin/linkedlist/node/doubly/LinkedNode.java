package lenin.linkedlist.node.doubly;

import lenin.util.node.AbstractNode;

public class LinkedNode<E> extends AbstractNode<E> {

  private LinkedNode<E> next;
  private LinkedNode<E> prev;

  /**
   * Constructs a LinkedNode with a null element.
   */
  public LinkedNode() {
    super();
    this.next = null;
    this.prev = null;
  }

  /**
   * Constructs a LinkedNode with the specified element.
   *
   * @param element the element to be stored in the node
   */
  public LinkedNode(E element) {
    super(element);
    this.next = null;
    this.prev = null;
  }

  /**
   * Constructs a LinkedNode with the specified element, next node, and prev
   * node.
   *
   * @param element  the element to be stored in the node.
   * @param next     the next node in the linked list.
   * @param prev the prev node in the linked list.   * 
   */
  public LinkedNode(E element, LinkedNode<E> next, LinkedNode<E> prev) {
    super(element);
    this.next = next;
    this.prev = prev;
  }

  /**
   * Returns the next node in the linked list.
   *
   * @return the next node.
   */
  public LinkedNode<E> getNext() {
    return next;
  }

  /**
   * Sets the next node in the linked list.
   *
   * @param next the next node to be set.
   */
  public void setNext(LinkedNode<E> next) {
    this.next = next;
  }

  /**
   * Returns the previos node in the linked list.
   *
   * @return the prev node.
   */
  public LinkedNode<E> getPrev() {
    return prev;
  }

  /**
   * Sets the prev node in the linked list.
   *
   * @param prev the previos node to be set.
   */
  public void setPrev(LinkedNode<E> prev) {
    this.prev = prev;
  }

  @Override
  public String toString() {
    return "LinkedNode [next=" + next + ", prev=" + prev + "]";
  } 
  
}
