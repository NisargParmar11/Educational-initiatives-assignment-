package exercise1.structural;

public class AdapterPatternDemo {

	public static void main(String[] args) {
        USPlug usPlug = new USPlug();
        EuropeanPlug adapter = new VoltageAdapter(usPlug);

        adapter.plugIn(); // Output: Plugged into 120V (US) socket; Adapter converts to 220V (EU) socket

	}

}
