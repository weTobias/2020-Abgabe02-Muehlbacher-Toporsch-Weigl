package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class for StringQueue unit tests.
 * Tests cover most operations that are possible with String Queue
 *
 * TO IMPLEMENT
 */
@DisplayName("Testing StringQueue implementation")
class StringQueueTest {

    @BeforeEach
    @DisplayName("Setting everything up for testing")
    /**
     * Setup values for tests
     */
    void setup(){}

    //offer() method tests
    @Test
    @DisplayName("Testing basic functionality of offer() method")
    /**
     * Tests basic functionality of offer() method
     */
    public void testOffer(){}
    @Test
    @DisplayName("Testing multiple calls of offer() method")
    /**
     * Tests multiple offers
     */
    public void testMultipleOffer(){}

    //poll() method tests
    @Test
    @DisplayName("Testing basic functionality of poll() method")
    /**
     * Tests basic functionality of poll() method
     */
    public void testPoll(){}
    @Test
    @DisplayName("Testing if poll() method returns null on an empty queue")
    /**
     * Tests if poll() method returns null on an empty queue
     */
    public void testPollNull(){}
    @Test
    @DisplayName("Testing if poll() method correctly removes header and returns second element after that")
    /**
     * Tests if poll() method correctly removes header and returns second element after that
     */
    public void testPollSecondElement(){}

    //remove() method tests
    @Test
    @DisplayName("Testing basic functionality of remove() method")
    /**
     * Tests basic functionality of remove() method
     */
    public void testRemove(){}
    @Test
    @DisplayName("Testing if remove() method returns NoSuchElementException on an empty queue")
    /**
     * Tests if remove() method returns NoSuchElementException on an empty queue
     */
    public void testRemoveException(){}
    @Test
    @DisplayName("Testing if remove() method correctly removes header and returns second element after that")
    /**
     * Tests if remove() method correctly removes header and returns second element after that
     */
    public void testRemoveSecondElement(){}

    //peek() method tests
    @Test
    @DisplayName("Testing basic functionality of peek() method")
    /**
     * Tests basic functionality of peek() method
     */
    public void testPeek(){}
    @Test
    @DisplayName("Testing if peek() method returns null on empty queue")
    /**
     * Tests if peek() method returns null on empty queue
     */
    public void testPeekNull(){}
    @Test
    @DisplayName("Testing if peek() method keeps element on queue")
    /**
     * Tests if peek() method keeps element on queue
     */
    public void testPeekRemove(){}

    //element() method tests
    @Test
    @DisplayName("Testing basic functionality of element() method")
    /**
     * Tests basic functionality of element() method
     */
    public void testElement(){}
    @Test
    @DisplayName("Testing if element() method returns NoSuchElementException on empty queue")
    /**
     * Tests if element() method returns NoSuchElementException on empty queue
     */
    public void testElementException(){}
    @Test
    @DisplayName("Testing if element() method keeps element on queue")
    /**
     * Tests if element() method keeps element on queue
     */
    public void testElementRemove(){}


}