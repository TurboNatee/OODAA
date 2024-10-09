package GuitarSHop;

public class MandolinSpec {
    private Styles style;
    private InstrumentSpec instrument;

    public Styles getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec Spec) {


        return style == Spec.style;
    }
}
