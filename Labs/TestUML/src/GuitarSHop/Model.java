package GuitarSHop;

public enum Model {
    STRATOCASTOR, WARLOCK;

    @Override
    public String toString() {
        return switch (this) {
            case STRATOCASTOR -> "Stratocaster"; // Capitalized for readability
            case WARLOCK -> "Warlock"; // Capitalized for readability
        };
    }
}
