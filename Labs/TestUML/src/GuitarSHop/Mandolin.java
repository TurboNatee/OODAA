package GuitarSHop;

public class Mandolin extends Instrument {
    private MandolinSpec spec; // Specific mandolin spec

    // Constructor
    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        super(serialNumber, price, spec); // Call the parent constructor with the MandolinSpec
        this.spec = spec;
    }

    public MandolinSpec getSpec() {
        return spec;
    }
}
