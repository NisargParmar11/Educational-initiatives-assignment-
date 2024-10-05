package exercise1.behavioral;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        station.addObserver(user1);
        station.addObserver(user2);

        station.setWeather("Sunny");
        station.setWeather("Rainy");

	}

}
