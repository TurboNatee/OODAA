package GuitarSHop;

public enum Styles {
    A, F;

    @Override
    public String toString() {
        return switch (this)
        {
            case A -> "A";
            case F -> "F";
        };
    }
}
