package lenin.linkedlist.node.singly;

import lenin.util.node.AbstractNode;

public class LinkedNode<E> extends AbstractNode<E> {

  private LinkedNode<E> next;

  /**
   * Constructs an empty LinkedNode.
   */
  public LinkedNode() {
    super();
    this.next = null;
  }

  /**
   * Constructs a LinkedNode with the specified element.
   *
   * @param element the element to be stored in the node
   */
  public LinkedNode(E element) {
    super(element);
    this.next = null;
  }

  /**
   * Constructs a LinkedNode with the specified element and next node.
   *
   * @param element the element to be stored in the node
   * @param next    the next node in the linked list
   */
  public LinkedNode(E element, LinkedNode<E> next) {
    super(element);
    this.next = next;
  }

  /**
   * Returns the next node in the linked list.
   *
   * @return the next node
   */
  public LinkedNode<E> getNext() {
    return next;
  }

  /**
   * Sets the next node in the linked list.
   *
   * @param next the next node to be set
   */
  public void setNext(LinkedNode<E> next) {
    this.next = next;
  }

  /**
   * Returns a string representation of the node.
   *
   * @return a string representation of the node
   */
  @Override
  public String toString() {
    return "LinkedNode{" +
        "element=" + get().toString() +
        ", next=" + next +
        '}';
  }

}
