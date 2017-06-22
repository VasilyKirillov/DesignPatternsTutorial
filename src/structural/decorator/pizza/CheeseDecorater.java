
package structural.decorator.pizza;

public class CheeseDecorater extends PizzaDecorator{
    
    public CheeseDecorater(Pizza typeOfPizza) {
        super(typeOfPizza);
    }
    
    public String make() {
        return typeOfPizza.make() + addCheese();
    }

    private String addCheese() {
        return " swiss cheese";
    }
}
