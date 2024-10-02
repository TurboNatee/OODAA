package GuitarSHop;

public class GuitarSpec {
    private Builder builder;
    private Model model;
    private GuitarType type;
    private Wood backWood;
    private Wood topWood;

    public GuitarSpec(Builder builder, Model model, GuitarType type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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
}
