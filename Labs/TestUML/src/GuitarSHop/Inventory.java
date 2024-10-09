package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> instruments;

    public Inventory() {
        instruments = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instrument) {



    }



    public List search(InstrumentSpec instrument) {
        List<Instrument> matchingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator(); i.hasNext(); ) {
            Instrument instruments = (Instrument) i.next();
            if (instruments.getInstrumentSpec().matches(instrument)) {
                matchingInstruments.add(instruments);
            }
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant


        }
        return matchingInstruments;
    }


}
