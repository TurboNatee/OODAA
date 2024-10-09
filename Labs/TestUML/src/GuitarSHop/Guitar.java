package GuitarSHop;

public class Guitar {
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.spec = spec;

    }

    public GuitarSpec getSpec(){return spec;}
    public void getSpec(GuitarSpec newSpec){}

}
