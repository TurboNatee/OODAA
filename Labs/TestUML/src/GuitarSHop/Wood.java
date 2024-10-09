package GuitarSHop;

public enum Wood {
    ALDER, MAHOGANY, CEDAR;

    @Override
    public String toString() {
        return switch (this) {
            case ALDER -> "Alder";
            case MAHOGANY -> "Mahogany";
            case CEDAR -> "Cedar";
        };
    }
}
