package exercise1.structural;

public class VoltageAdapter implements EuropeanPlug {
    private USPlug usPlug;

    public VoltageAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void plugIn() {
        usPlug.plugInUS();
        System.out.println("Adapter converts to 220V (EU) socket");
    }
}
