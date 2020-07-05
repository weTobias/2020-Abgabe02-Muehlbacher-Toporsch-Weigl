# Generics #

Generics allow type(Integer, Boolean etc.) to be a parameter to classes, methods or interfaces.
Therefore you can declear that a variable or a class allows any type to be used for acessing the variable or method.
This allows a class or variable to be multifunctional.

## Example ##
An generic method would for example look like this:
```Java
public boolean offer(T obj) {
       if (elements.size() != maxSize){
           elements.add(obj);
           return true;
       }
       return false;
   }
   ```
