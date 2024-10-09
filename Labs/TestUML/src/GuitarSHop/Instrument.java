package GuitarSHop;

public class Instrument {

        private String serialNumber;
        private double price;
        private InstrumentSpec instrumentSpec;

    public static void main(String[] args) {
        Instrument instrument = new Instrument();
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public  double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return instrumentSpec;
    }
}
