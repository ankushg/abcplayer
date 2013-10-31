package grammar;

public enum BarLine {
    MEASURE("|", "[|"), START_REPEAT("|:", "[2", "||", "|]"), END_REPEAT(":|"), REPEAT_ONE("[1"), LYRIC_BARLINE;

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
