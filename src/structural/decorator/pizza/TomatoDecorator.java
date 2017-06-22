package structural.decorator.pizza;

public class TomatoDecorator extends PizzaDecorator {

    public TomatoDecorator(Pizza typeOfPizza) {
        super(typeOfPizza);
    }

    public String make() {
        return typeOfPizza.make() + addTomatos();
    }

    private String addTomatos() {
        return " tomatos";
    }
}
