package GuitarSHop;

public class GuitarSpec {
    private NumStrings numStrings;


    public NumStrings getNumStrings() {
        return numStrings;
    }


    public boolean matches(GuitarSpec Spec) {


        if (numStrings != Spec.numStrings) {
            return false;
        }
        return true;
    }
}
