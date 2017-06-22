
package structural.flyweight;


public class FlyWeightEverydayExample {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(5);
        Integer second = Integer.valueOf(5);
        Integer third = Integer.valueOf(10);
        
        System.out.println("first: " + System.identityHashCode(first));
        System.out.println("second: " + System.identityHashCode(second));
        System.out.println("third: " + System.identityHashCode(third));
    }
}
