package edu.nodes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import edu.mockobject.MockObject;

public class NodeTest {
  @Test
  void testGetClone() {
    Node<MockObject> node = new Node<MockObject>();
    
    // Test case 1: Should return null if the object in the node is null.    
    assertNull(node.getClone());
    
    char [] charArray = {'a','b','c','d','e'};
    MockObject mockObject = new MockObject(1,"2", charArray);
    node.setObject(mockObject);

    // Test case 2: Should return a clone of the node.
    assertEquals(node.getClone().toString(), node.toString());  
  }

  @Test
  void testIsEquals() {

  }
}
