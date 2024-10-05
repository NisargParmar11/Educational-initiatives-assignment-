package exercise1.structural;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        coffee = new WhippedCreamDecorator(coffee);
        coffee = new CaramelDecorator(coffee);

        System.out.println(coffee.getDescription() + " costs $" + coffee.cost());

	}

}
