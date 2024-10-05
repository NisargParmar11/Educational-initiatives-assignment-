package exercise1.behavioral;

public class User implements WeatherObserver {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String weather) {
        System.out.println(name + " received weather update: " + weather);
    }
}
