package GuitarSHop;

import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        // Searching for guitars
        InstrumentSpec whatLookingForGuitar = new InstrumentSpec(Builder.FENDER, Model.STRATOCASTOR,
                GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List<Instrument> matchingGuitars = inventory.search(whatLookingForGuitar);
        listMatchingInstruments(matchingGuitars);

        // Searching for mandolins
        MandolinSpec whatLookingForMandolin = new MandolinSpec(
                Styles.F, Builder.GIBSON, Model.WARLOCK, GuitarType.ACOUSTIC,
                Wood.MAHOGANY, Wood.CEDAR);
        List<Instrument> matchingMandolins = inventory.search(whatLookingForMandolin);
        listMatchingInstruments(matchingMandolins);
    }

    public static void listMatchingInstruments(List<Instrument> matchingInstruments) {
        if (matchingInstruments.isEmpty()) {
            System.out.println("Sorry, we have nothing for you.");
        } else {
            System.out.println("You might like this: ");
            for (Instrument instrument : matchingInstruments) {
                System.out.println(instrument.getSerialNumber() + " " + instrument.getPrice());
            }
        }
    }

    public static void initialiseInventory(Inventory inventory) {
        // Add guitars to the inventory
        GuitarSpec guitarSpec = new GuitarSpec(Builder.FENDER, Model.STRATOCASTOR, GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("5517351", 1250, guitarSpec);

        // Add mandolins to the inventory
        MandolinSpec mandolinSpec = new MandolinSpec(Styles.F, Builder.GIBSON, Model.WARLOCK, GuitarType.ACOUSTIC, Wood.MAHOGANY, Wood.CEDAR);
        inventory.addMandolin("1234567", 800, mandolinSpec);
    }
}
