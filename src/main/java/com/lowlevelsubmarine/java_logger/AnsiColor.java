package com.lowlevelsubmarine.java_logger;

public enum AnsiColor {

    RESET(0),
    BLACK(30),
    RED(31),
    GREEN(32),
    YELLOW(33),
    BLUE(34),
    PURPLE(35),
    CYAN(36),
    WHITE(37);

    private static final String STRING_START = "\u001B[";
    private static final String STRING_END = "m";

    private final int colorCode;

    AnsiColor(int code) {
        this.colorCode = code;
    }

    public String getString() {
        return STRING_START + this.colorCode + STRING_END;
    }

    @Override
    public String toString() {
        return getString();
    }

}
