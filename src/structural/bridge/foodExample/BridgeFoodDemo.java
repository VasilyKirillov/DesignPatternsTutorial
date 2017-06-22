package structural.bridge.foodExample;


public class BridgeFoodDemo {
   public static void main(String[] args){ 
   
       Cherry cherry = new Cherry();
       Cheese cheese = new Cheese();
       
       Cocktail cherryCocktail = new Cocktail(cherry);
       Patty cheesePatty = new Patty(cheese);
       Pie cherryPie = new Pie(cherry);
       
       Food[] foods = {cherryCocktail,cheesePatty,cherryPie};
       
       for (Food food: foods){
           food.cook();
       }
              
   }
}
