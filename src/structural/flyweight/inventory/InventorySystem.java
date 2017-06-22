
package structural.flyweight.inventory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private List<Order> orders = new CopyOnWriteArrayList<>();
    
    void takeOrder(String itemName, int id){
        Item item = catalog.lookup(itemName);
        Order order = new Order(id, item);
        orders.add(order);        
    }
    void proccess(){
        for(Order order : orders){
            order.proccessOrder();
            orders.remove(order);
        }
    }
    String report(){
        return "\nTotal Item objects made: " + catalog.totalItemsMade();
    }
}
