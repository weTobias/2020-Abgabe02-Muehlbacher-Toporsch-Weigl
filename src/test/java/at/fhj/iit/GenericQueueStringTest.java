package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * Test class for GenericQueue unit tests.
 * Tests cover most operations that are possible with GenericQueue using the String class.
 *
 */
@DisplayName("Testing GenericQueue implementation using String objects")
public class GenericQueueStringTest {
    final int SIZE_1 = 5;
    final int SIZE_2 = 0;
    GenericQueue<String> queue1;
    GenericQueue<String> queue2;
    final String FIRST = "first";
    final String SECOND = "second";
    final String THIRD = "third";
    final String FOURTH = "fourth";
    final String FIFTH = "fifth";

    @BeforeEach
    @DisplayName("Setting everything up for testing")
    /**
     * Setup values for tests
     */
    void setup(){

        queue1 = new GenericQueue<String>(SIZE_1);
        queue2 = new GenericQueue<String>(SIZE_2);
    }

    //offer() method tests
    @Test
    @DisplayName("Testing basic functionality of offer() method")
    /**
     * Tests basic functionality of offer() method
     */
    public void testOffer(){
        assertTrue(queue1.offer(FIRST));
    }
    @Test
    @DisplayName("Testing multiple calls of offer() method")
    /**
     * Tests multiple offers
     */
    public void testMultipleOffer(){
        assertTrue(queue1.offer(FIRST));
        assertTrue(queue1.offer(SECOND));
        assertTrue(queue1.offer(THIRD));
        assertTrue(queue1.offer(FOURTH));
        assertTrue(queue1.offer(FIFTH));
    }
    @Test
    @DisplayName("Testing maxSize behaviour of offer() method")
    public void testMaxSizeOffer(){
        assertFalse(queue2.offer(FIRST));
    }

    //poll() method tests
    @Test
    @DisplayName("Testing basic functionality of poll() method")
    /**
     * Tests basic functionality of poll() method
     */
    public void testPoll(){
        queue1.offer(FIRST);
        assertEquals(FIRST, queue1.poll());
    }
    @Test
    @DisplayName("Testing if poll() method returns null on an empty queue")
    /**
     * Tests if poll() method returns null on an empty queue
     */
    public void testPollNull(){
        assertEquals(null, queue1.poll());
    }
    @Test
    @DisplayName("Testing if poll() method correctly removes header and returns second element after that")
    /**
     * Tests if poll() method correctly removes header and returns second element after that
     */
    public void testPollSecondElement(){
        queue1.offer(FIRST);
        queue1.offer(SECOND);
        queue1.poll();
        assertEquals(SECOND, queue1.poll());
    }

    //remove() method tests
    @Test
    @DisplayName("Testing basic functionality of remove() method")
    /**
     * Tests basic functionality of remove() method
     */
    public void testRemove(){
        queue1.offer(FIRST);
        assertEquals(FIRST, queue1.remove());
    }
    @Test
    @DisplayName("Testing if remove() method returns NoSuchElementException on an empty queue")
    /**
     * Tests if remove() method returns NoSuchElementException on an empty queue
     */
    public void testRemoveException(){
        assertThrows(NoSuchElementException.class, () -> {
            queue1.remove();
        });
    }
    @Test
    @DisplayName("Testing if remove() method correctly removes header and returns second element after that")
    /**
     * Tests if remove() method correctly removes header and returns second element after that
     */
    public void testRemoveSecondElement(){
        queue1.offer(FIRST);
        queue1.offer(SECOND);
        queue1.remove();
        assertEquals(SECOND, queue1.remove());
    }

    //peek() method tests
    @Test
    @DisplayName("Testing basic functionality of peek() method")
    /**
     * Tests basic functionality of peek() method
     */
    public void testPeek(){
        queue1.offer(FIRST);
        assertEquals(FIRST, queue1.peek());
    }
    @Test
    @DisplayName("Testing if peek() method returns null on empty queue")
    /**
     * Tests if peek() method returns null on empty queue
     */
    public void testPeekNull(){
        assertEquals(null, queue1.peek());
    }
    @Test
    @DisplayName("Testing if peek() method keeps element on queue")
    /**
     * Tests if peek() method keeps element on queue
     */
    public void testPeekRemove(){
        queue1.offer(FIRST);
        queue1.offer(SECOND);
        queue1.peek();
        assertEquals(FIRST, queue1.peek());
    }

    //element() method tests
    @Test
    @DisplayName("Testing basic functionality of element() method")
    /**
     * Tests basic functionality of element() method
     */
    public void testElement(){
        queue1.offer(FIRST);
        assertEquals(FIRST, queue1.element());
    }
    @Test
    @DisplayName("Testing if element() method returns NoSuchElementException on empty queue")
    /**
     * Tests if element() method returns NoSuchElementException on empty queue
     */
    public void testElementException(){
        assertThrows(NoSuchElementException.class, () -> {
            queue1.element();
        });
    }
    @Test
    @DisplayName("Testing if element() method keeps element on queue")
    /**
     * Tests if element() method keeps element on queue
     */
    public void testElementRemove(){
        queue1.offer(FIRST);
        queue1.offer(SECOND);
        queue1.element();
        assertEquals(FIRST, queue1.element());
    }


}