package lenin.util.iterable;

import java.util.function.Function;

import lenin.util.iterator.Iterator;

public interface Iterable<E> {  

  /**
   * For each element in the iterator, executes the specified action.
   *
   * @param action the action to be executed on each element.
   */
  void forEach(Function<E, Void> action);

  /**
   * Gets an iterator over the elements in the iterator.
   *
   * @return an iterator over the elements in the iterator.
   */
  Iterator<E> iterator();
}
