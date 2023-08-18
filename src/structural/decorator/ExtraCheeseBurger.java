package structural.decorator;

public class ExtraCheeseBurger extends BurgerDecorator{

    private Burger burger;

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double cost() {
        return burger.cost() + 20.0;
    }

    @Override
    public String description() {
        return burger.description() + "with extra cheese";
    }
}
