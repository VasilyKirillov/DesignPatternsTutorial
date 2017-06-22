
package structural.bridge.foodExample;


public class Patty implements Food {

    private Ingridient ingridient;

    public Patty(Ingridient ingridient) {
        this.ingridient = ingridient;
    }
    
    @Override
    public void cook() {
        System.out.println("cooking patty " + ingridient.getIngridient());
    }
    
}
