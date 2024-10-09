package GuitarSHop;

public class Guitar extends Instrument {
    private GuitarSpec spec; // Specific guitar spec

    // Constructor
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        super(serialNumber, price, spec); // Call the parent constructor with the GuitarSpec
        this.spec = spec;
    }

    public GuitarSpec getSpec() {
        return spec;
    }
}
