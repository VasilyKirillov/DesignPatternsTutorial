
package structural.flyweight.inventory;
/*
* Flyweight element
*/
public class Item {
    
    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
