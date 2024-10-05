package exercise1.structural;

public class CaramelDecorator extends CoffeeDecorator{
	public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Caramel";
    }

    @Override
    public double cost() {
        return super.cost() + 2.0;
    }
}
