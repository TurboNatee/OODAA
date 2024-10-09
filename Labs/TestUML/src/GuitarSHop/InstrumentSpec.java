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

    public boolean matches(InstrumentSpec spec) {
        if (builder != spec.builder) {
            return false;
        }
        if ((model != null) && !model.equals(spec.model)) {
            return false;
        }
        if (type != spec.type) {
            return false;
        }
        if (backWood != spec.backWood) {
            return false;
        }
        if (topWood != spec.topWood) {
            return false;
        }
        return true;
    }
}
