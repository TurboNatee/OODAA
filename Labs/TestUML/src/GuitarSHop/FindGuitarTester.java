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
        Guitar whatLookingFor = new Guitar("", 0, Builder.FENDER, Model.STRATOCASTOR,
                GuitarType.ELECTRIC, Wood.ALDER, Wood.ALDER);

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
        inventory.addGuitar("V00001",
                1499.99,
                Builder.FENDER,
                Model.STRATOCASTOR,
                GuitarType.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00002",
                1699.99,
                Builder.FENDER,
                Model.STRATOCASTOR,
                GuitarType.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER);

        inventory.addGuitar("V00003",
                899.99,
                Builder.GIBSON,
                Model.STRATOCASTOR,
                GuitarType.ACOUSTIC,
                Wood.MAHOGANY,
                Wood.MAHOGANY);
    }
}
