package GuitarSHop;

public class Instrument {
    private String serialNumber;
    private double price;
    private InstrumentSpec instrumentSpec; // Use the base InstrumentSpec

    // Constructor
    public Instrument(String serialNumber, double price, InstrumentSpec instrumentSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.instrumentSpec = instrumentSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }
}
