package GuitarSHop;

public enum Builder {
    FENDER, GIBSON, COLLINS;

    @Override
    public String toString() {
        return switch (this) {
            case FENDER -> "Fender";
            case GIBSON -> "Gibson";
            case COLLINS -> "Collins";
        };
    }
}
