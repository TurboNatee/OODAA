package GuitarSHop;

public enum GuitarType {
    ELECTRIC, ACOUSTIC;

    @Override
    public String toString() {
        return switch (this) {
            case ELECTRIC -> "Electric";
            case ACOUSTIC -> "Acoustic";
            default -> "Electric";
        };
    }
}
