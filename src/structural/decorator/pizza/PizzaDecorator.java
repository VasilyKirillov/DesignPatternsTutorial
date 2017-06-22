package structural.decorator.pizza;

public class PizzaDecorator implements Pizza{

    protected Pizza typeOfPizza;

    public PizzaDecorator(Pizza typeOfPizza) {
        this.typeOfPizza = typeOfPizza;
    }
    
    @Override
    public String make() {
        return typeOfPizza.make();
    }
    
}
