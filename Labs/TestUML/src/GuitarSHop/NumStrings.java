package GuitarSHop;

public enum NumStrings {
    six, twelve;

    @Override
    public String toString() {
        return switch (this) {
            case six -> "6";
            case twelve -> "7";
        };
        }
}
