
package adt;


public class Counter {

    private String name = null;
    private int value = 0;
    
    private void doesSomething(){
    // Nothing because it is private
    }

    public Counter(String str) {
        this.name = str;
    }
    
    public void increment(){
        value++;
    }
    
    public int getCurrentValue(){
        return value;
    }

    @Override
    public String toString() {
        return "Counter{" + "name=" + name + ", value=" + value + '}';
    }
    

    
    
    
}
