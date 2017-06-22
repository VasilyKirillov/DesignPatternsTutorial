package structural.flyweight.inventory;

/**
 * Client which requests for flyweight object
 */
public class FlyweightInventoryDemo {

    public static void main(String[] args) {
        InventorySystem inventory = new InventorySystem();

        inventory.takeOrder("software", 10);
        inventory.takeOrder("design", 20);
        inventory.takeOrder("pattern", 30);
        inventory.takeOrder("software", 40);
        inventory.takeOrder("design", 50);
        inventory.takeOrder("pattern", 60);
        inventory.takeOrder("design", 70);
        inventory.takeOrder("software", 80);
        inventory.takeOrder("pattern", 90);
        inventory.takeOrder("design", 100);
        inventory.takeOrder("pattern", 110);
        inventory.takeOrder("design", 120);
        inventory.takeOrder("software", 130);
        inventory.takeOrder("pattern", 140);
        
        inventory.proccess();
        
        System.out.println(inventory.report());
    }

}
