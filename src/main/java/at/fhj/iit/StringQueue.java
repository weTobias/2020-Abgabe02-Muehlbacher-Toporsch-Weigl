package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue <String>{

  private List<String> elements = new ArrayList<String>();
  private int maxSize;

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize){
      elements.add(obj);
      return true;
    }
    return false;
  }

  @Override
  public String poll() {
    if (elements.size() != 0){
      String element = peek();
      elements.remove(0);
      return element;
    }
    return null;
  }

  @Override
  public String remove() {
    String element = peek();
    if (element == null){
      throw new NoSuchElementException("The queue is empty");
    }
    elements.remove(0);
    return element;
  }

  @Override
  public String peek() {
    if (elements.size() > 0){
      return elements.get(0);
    }
    return null;
  }

  @Override
  public String element() {
    if (peek() == null){
      throw new NoSuchElementException("The queue is empty");
    }
    return peek();
  }

}