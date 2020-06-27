package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<T>{

    /**
     * List of all elements within the queue
     */
    private List<T> elements = new ArrayList<T>();

    /**
     * Determines the maximum size of the queue
     */
    private int maxSize;

    /**
     * Constructor of the queue which sets its maximum size
     *
     * @param maxSize to set the maximum size of the queue
     */
    public GenericQueue(int maxSize){
        this.maxSize = maxSize;
    }

    /**
     * Adds the element obj to the queue.
     * If the addition is successful, the method returns true else false.
     *
     * @param obj is a new element which which wants to get added to the queue
     * @return whether or not the element was added successfully
     */
    public boolean offer(T obj) {
        return false;
    }

    /**
     * Returns the head (first) element and also deletes it. That is, we cannot get it again.
     * If no element exists (when queue is empty), the method returns null.
     *
     * @return the first element of the queue
     */
    public T poll() {
        return null;
    }

    /**
     * It also returns and deletes the head element like poll(), but with a small difference.
     * This method throws NoSuchElementException if the queue is empty.
     *
     * @return the first element of the queue
     */
    public T remove() {
        return null;
    }

    /**
     * Returns the head element but it does not delete it. That is, we can get it again.
     * Returns null when the queue is empty.
     *
     * @return the first element of the queue
     */
    public T peek() {
        return null;
    }

    /**
     * It works similar to peek() but with a small difference (returns but does not delete the element).
     * It throws NoSuchElementException when the queue is empty.
     *
     * @return the first element of the queue
     */
    public T element() {
        return null;
    }
}
