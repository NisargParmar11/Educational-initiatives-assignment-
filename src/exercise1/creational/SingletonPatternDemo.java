package exercise1.creational;

public class SingletonPatternDemo {

	public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.connect();

        // Both db1 and db2 refer to the same instance

	}

}
