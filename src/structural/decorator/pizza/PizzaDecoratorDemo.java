package structural.decorator.pizza;


public class PizzaDecoratorDemo {
    
   
    public static void main(String[] args) {
         Pizza pizza = new TomatoDecorator(new CheeseDecorater(new SimplePizza()));
         System.out.println(pizza.make());
    }
            
            
            
}
