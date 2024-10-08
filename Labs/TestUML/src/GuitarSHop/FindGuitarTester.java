package GuitarSHop;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up guitar inventory
        Inventory inventory = new Inventory();
        initialiseInventory(inventory);

        //what customer is looking for
        GuitarSpec whatLookingFor = new GuitarSpec(Builder.FENDER, Model.STRATOCASTOR,
                GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER, NumStrings.six);

        List matchingGuitars = inventory.search(whatLookingFor);
        listMatchingGuitars(matchingGuitars);


    }

    public static void listMatchingGuitars(List matchingGuitars) {
        if (matchingGuitars.isEmpty()) {
            System.out.println("Sorry, we have nothing for you.");
        } else {
            System.out.println("You might like this: ");
            for (Object matchingGuitar : matchingGuitars) {
                Guitar guitar = (Guitar) matchingGuitar;
                System.out.println(guitar.getSerialNumber() + " " + guitar.getPrice());
            }
        }
    }

    public static void initialiseInventory(Inventory inventory) {
        //add guitars to the inventory
        GuitarSpec spec1 = new GuitarSpec(
                Builder.FENDER,
                Model.STRATOCASTOR,
                GuitarType.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,
                NumStrings.six);

        GuitarSpec spec2 = new GuitarSpec(
                Builder.FENDER,
                Model.STRATOCASTOR,
                GuitarType.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER,
                NumStrings.six);

        GuitarSpec spec3 = new GuitarSpec(
                Builder.GIBSON,
                Model.STRATOCASTOR,
                GuitarType.ACOUSTIC,
                Wood.MAHOGANY,
                Wood.MAHOGANY,
                NumStrings.six);

        inventory.addGuitar("5517351", 1250, spec1);
        inventory.addGuitar("5517352", 1250, spec2);
        inventory.addGuitar("5517353", 1250, spec3);
    }
}
