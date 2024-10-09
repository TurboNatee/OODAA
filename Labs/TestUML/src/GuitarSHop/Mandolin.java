package GuitarSHop;

public class Mandolin {
    private MandolinSpec spec;

    public Mandolin(String serialNumber, double price, MandolinSpec spec) {
        this.spec = spec;

    }

    public MandolinSpec getSpec(){return spec;}
    public void getSpec(InstrumentSpec newSpec){}
}
