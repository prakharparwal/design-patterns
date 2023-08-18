package structural.decorator;

public class Performer {

    public static void main(String[] args) {

        Burger burger = new VegBurger();
        System.out.println(burger.cost() +"  "+burger.description());

        Burger extraSpicyBurger = new SpicyBurger(burger);
        System.out.println(extraSpicyBurger.cost() +"  "+extraSpicyBurger.description());

        Burger extraCheeseBurger = new ExtraCheeseBurger(burger);
        System.out.println(extraCheeseBurger.cost()+ "  "+extraCheeseBurger.description());
    }
}
