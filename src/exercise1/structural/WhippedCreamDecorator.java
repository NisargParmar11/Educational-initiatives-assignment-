package exercise1.structural;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Whipped Cream";
    }

    @Override
    public double cost() {
        return super.cost() + 1.5;
    }
}
