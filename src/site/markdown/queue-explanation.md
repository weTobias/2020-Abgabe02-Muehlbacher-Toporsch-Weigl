# What is a Queue #
A queue is a collection of entities that are maintained in a sequence and they can be modified by the addition of an entity at one end of the queue and the removal of an entity from the other end of the sequence.

A queue provides the following methods: offer, poll,remove, peek and element.

## Example ##
In our GenericQueue they look like this:

```Java
public boolean offer(T obj) {
        if (elements.size() != maxSize){
            elements.add(obj);
            return true;
          }
          return false;
      }

public T poll() {
        if (elements.size() != 0){
            T element = peek();
            elements.remove(0);
            return element;
          }
          return null;
      }    

public T remove() {
        T element = peek();
        if (element == null){
            throw new NoSuchElementException("The queue is empty");
          }
          elements.remove(0);
          return element;
    }

public T peek() {
        if (elements.size() > 0){
            return elements.get(0);
        }
        return null;
    }

public T element() {
        if (peek() == null){
            throw new NoSuchElementException("The queue is empty");
          }
          return peek();
      }
```
