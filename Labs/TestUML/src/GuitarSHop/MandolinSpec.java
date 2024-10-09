package GuitarSHop;

public class MandolinSpec extends InstrumentSpec {
    private Styles style;

    public MandolinSpec(Styles style, Builder builder, Model model, GuitarType type, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood); // Call the parent constructor
        this.style = style;
    }

    public Styles getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec spec) {
        if (!(spec instanceof MandolinSpec)) {
            return false; // Ensure we're comparing with MandolinSpec
        }
        MandolinSpec mandolinSpec = (MandolinSpec) spec;
        return style == mandolinSpec.style && super.matches(spec);
    }
}
