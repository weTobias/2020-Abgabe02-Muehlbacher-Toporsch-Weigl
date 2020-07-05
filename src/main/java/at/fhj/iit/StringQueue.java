package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue <String>{

  /**
   * List of all elements within the queue
   */
  private List<String> elements = new ArrayList<String>();

  /**
   * Determines the maximum size of the queue
   */
  private int maxSize;

  /**
   * Constructor of the queue which sets its maximum size
   *
   * @param maxSize to set the maximum size of the queue
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * Adds the element obj to the queue.
   * If the addition is successful, the method returns true else false.
   *
   * @param obj is a new element which wants to get added to the queue
   * @return whether or not the element was added successfully
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize){
      elements.add(obj);
      return true;
    }
    return false;
  }

  /**
   * Returns the head (first) element and also deletes it. That is, we cannot get it again.
   * If no element exists (when queue is empty), the method returns null.
   *
   * @return the first element of the queue
   */
  @Override
  public String poll() {
    if (elements.size() != 0){
      String element = peek();
      elements.remove(0);
      return element;
    }
    return null;
  }

  /**
   * It also returns and deletes the head element like poll(), but with a small difference.
   * This method throws NoSuchElementException if the queue is empty.
   *
   * @throws NoSuchElementException when the queue is empty
   *
   * @return the first element of the queue
   */
  @Override
  public String remove() {
    String element = peek();
    if (element == null){
      throw new NoSuchElementException("The queue is empty");
    }
    elements.remove(0);
    return element;
  }

  /**
   * Returns the head element but it does not delete it. That is, we can get it again.
   * Returns null when the queue is empty.
   *
   * @return the first element of the queue
   */
  @Override
  public String peek() {
    if (elements.size() > 0){
      return elements.get(0);
    }
    return null;
  }

  /**
   * It works similar to peek() but with a small difference (returns but does not delete the element).
   * It throws NoSuchElementException when the queue is empty.
   *
   * @throws NoSuchElementException when the queue is empty
   *
   * @return the first element of the queue
   */
  @Override
  public String element() {
    if (peek() == null){
      throw new NoSuchElementException("The queue is empty");
    }
    return peek();
  }

}