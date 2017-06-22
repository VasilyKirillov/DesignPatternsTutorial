package structural.flyweight.inventory;

public class Order {

    private final int id;
    private final Item item;

    public Order(int id, Item item) {
        this.id = id;
        this.item = item;
    }

    void proccessOrder() {
        System.out.println("Ordering " + item + "for order id: " + id);
    }
}
