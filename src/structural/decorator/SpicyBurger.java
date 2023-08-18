package structural.decorator;

public class SpicyBurger extends BurgerDecorator {

    private Burger burger;

    public SpicyBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + 30.0;
    }

    @Override
    public String description() {
        return burger.description() + "with spicy burger";
    }
}
