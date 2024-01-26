package lenin.util.iterator;

/**
 * An interface for an iterator.
 * @param <E> the type of elements returned by the iterator.
 */
public interface Iterator<E> {

  /**
   * Determines if the iterator has more elements.
   * @return true if the iteration has more elements.
   */
  public boolean hasNext();

  /**
   * Gets the next element in the iteration.
   * @return the next element in the iteration.
   */
  public E next();
}
