package structural.decorator;

public class VegBurger extends Burger{

    @Override
    public double cost() {
        return 50.0;
    }

    @Override
    public String description() {
        return "Basic veg burger";
    }
}
