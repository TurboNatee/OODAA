package GuitarSHop;

import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        InstrumentSpec whatLookingFor = new InstrumentSpec(Builder.FENDER, Model.STRATOCASTOR,
                GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER) {
        };

        List matchingInstruments = inventory.search(whatLookingFor);
        listMatchingGuitars(matchingInstruments);


    }

    public static void listMatchingGuitars(List matchingInstruments) {
        if (matchingInstruments.isEmpty()) {
            System.out.println("Sorry, we have nothing for you.");
        } else {
            System.out.println("You might like this: ");
            for (Object matchingInstrument : matchingInstruments) {
                Instrument instrument = (Instrument) matchingInstruments;
                System.out.println(instrument.getSerialNumber() + " " + instrument.getPrice());
            }
        }
    }

    public static void initialiseInventory(Inventory inventory) {
        //add guitars to the inventory

        InstrumentSpec spec1 = new InstrumentSpec(Builder.FENDER, Model.STRATOCASTOR, GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addInstrument("5517351", 1250, spec1);
    }
}
