package GuitarSHop;

public class InstrumentSpec {
    private Builder builder;
    private Model model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public InstrumentSpec(Builder builder, Model model, GuitarType type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Model getModel() {
        return model;
    }

    public GuitarType getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec Spec) {
        if (builder != Spec.builder) {
            return false;
        }

        if ((model != null) && (!model.equals("")) && (!model.equals(Spec.model))) {
            return false;
        }

        if (type != Spec.type) {
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
