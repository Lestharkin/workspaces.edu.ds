package lenin.util.node;

public interface Node<E> {
  /**
   * Sets an element in the node.
   * 
   * @param element the element to be set in the node.
   */
  void set(E element);

  /**
   * Gets the element contained in the node.
   * 
   * @return the element in the node or null.
   */
  E get();

  /**
   * Gets a string representation of the node.
   * 
   * @return a string representation of the node.
   */
  String toString();
}
