
package structural.bridge.foodExample;


public class Pie implements Food {

    private Ingridient ingridient;

    public Pie(Ingridient ingridient) {
        this.ingridient = ingridient;
    }
    
    @Override
    public void cook() {
        System.out.println("cooking pie " + ingridient.getIngridient());
    }
    
}
