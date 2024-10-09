package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        instruments.add(guitar);
    }

    public void addMandolin(String serialNumber, double price, MandolinSpec mandolinSpec) {
        Mandolin mandolin = new Mandolin(serialNumber, price, mandolinSpec);
        instruments.add(mandolin);
    }

    public List<Instrument> search(InstrumentSpec instrument) {
        List<Instrument> matchingInstruments = new LinkedList<>();
        for (Iterator<Instrument> i = instruments.iterator(); i.hasNext(); ) {
            Instrument currentInstrument = i.next();
            if (currentInstrument.getInstrumentSpec().matches(instrument)) {
                matchingInstruments.add(currentInstrument);
            }
        }
        return matchingInstruments;
    }
}
