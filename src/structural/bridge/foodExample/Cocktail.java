
package structural.bridge.foodExample;


public class Cocktail implements Food{
    private Ingridient ingridient;

    public Cocktail(Ingridient ingridient) {
        this.ingridient = ingridient;
    }

    @Override
    public void cook() {
        System.out.println("cooking cocktail " + ingridient.getIngridient());
    }
    
}
