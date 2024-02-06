package lenin.linkedlist.singly;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lenin.util.iterator.Iterator;

class LinkedListTest {


  @Test
  @DisplayName("ADD: Add an element to the list.")
  void testAdd() {
    LinkedList<Integer> list = new LinkedList<>();
    assertTrue(list.add(23));
    assertTrue(list.add(30));
    assertTrue(list.add(20));
    assertTrue(list.add(null));
    assertEquals(4, list.size());

    Object[] expected = {23, 30, 20, null};
    int i = 0;
    for(Iterator<Integer> it = list.iterator(); it.hasNext();) {
      assertEquals(expected[i++], it.next());
    }

  }

  @Test
  void testClear() {

  }

  @Test
  void testContains() {

  }

  @Test
  void testContains2() {

  }

  @Test
  void testContains3() {

  }

  @Test
  void testForEach() {

  }

  @Test
  void testIsEmpty() {

  }

  @Test
  void testIterator() {

  }

  @Test
  void testReverse() {

  }

  @Test
  void testSize() {

  }
}
