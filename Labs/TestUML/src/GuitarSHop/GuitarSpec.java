package GuitarSHop;

public class GuitarSpec {
    private Builder builder;
    private Model model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;
    private NumStrings numStrings;

    public GuitarSpec(Builder builder, Model model, GuitarType type, Wood backWood, Wood topWood, NumStrings numStrings) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public NumStrings getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(NumStrings numStrings) {
        this.numStrings = numStrings;
    }

    public boolean matches(GuitarSpec Spec) {
        if (builder != Spec.builder) {
            return false;
        }

        if ((model != null) && (!model.equals("")) && (!model.equals(Spec.model))) {
            return false;
        }

        if (type != Spec.type) {
            return false;
        }

        if (numStrings != Spec.numStrings) {
            return false;
        }


        if (backWood != Spec.backWood) {
            return false;
        }


        if (topWood != Spec.topWood) {
            return false;
        }
        return true;
    }
}
