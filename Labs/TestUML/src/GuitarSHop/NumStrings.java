package GuitarSHop;

public enum NumStrings {
    SIX, TWELVE;

    @Override
    public String toString() {
        return switch (this) {
            case SIX -> "6";
            case TWELVE -> "12"; // Corrected to return "12"
        };
    }
}
