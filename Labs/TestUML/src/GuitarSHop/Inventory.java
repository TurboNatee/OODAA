package GuitarSHop;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        //Guitar guitar = new Guitar(serialNumber, price, model, type, builder, backwood , topwood);
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); ((Iterator) i).hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec Spec) {
        List<Guitar> matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            //ignore serialNumber since it is unique
            //ignore price since it is irrelevant
            if (Spec.getBuilder() != guitar.getSpec().getBuilder())
                continue;
            String model = (Spec.getModel().toString().toUpperCase());
            if (model != null && !model.equals(model.toUpperCase()))
                continue;

            GuitarType type = Spec.getType();
            if (!Spec.equals("")) {
                if ((type != null) && (!type.equals(guitar.getSpec().getType()))) {
                    continue;
                }
            }

            Wood backWood = Spec.getBackWood();
            if (backWood != null && !backWood.equals(guitar.getSpec().getBackWood()))
                continue;
            Wood topWood = Spec.getBackWood();
            if (topWood != null && !topWood.equals(guitar.getSpec().getBackWood()))
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }

}
