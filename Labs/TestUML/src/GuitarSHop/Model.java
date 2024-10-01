package GuitarSHop;

public enum Model {
    STRATOCASTOR, WARLOCK;

    @Override
    public String toString() {
        return switch (this) {
            case STRATOCASTOR -> "STRATOCASTOR";
            case WARLOCK -> "WARLOCK";
            default -> "STRATOCASTOR";
        };
    }
}
