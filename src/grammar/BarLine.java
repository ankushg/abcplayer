package grammar;

public enum BarLine {
    SINGLE_BAR("|", "[|"), DOUBLE_BAR("||", "|]"), START_REPEAT("|:"), END_REPEAT(":|"), REPEAT_ONE("[1");

    private String[] strings;

    private BarLine(String... strings) {
        this.strings = strings;
    }

    public static BarLine getBarLine(String string) {
        for (BarLine barLine : values()) {
            for (String s : barLine.strings) {
                if (s.equals(string)) {
                    return barLine;
                }
            }
        }
        throw new IllegalArgumentException(String.format("invalid barline: \"%s\"", string));
    }
}
