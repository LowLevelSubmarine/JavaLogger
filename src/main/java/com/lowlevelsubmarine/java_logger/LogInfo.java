package com.lowlevelsubmarine.java_logger;

public class LogInfo {

    private final LogLevel logLevel;
    private final Class<?> clazz;
    private final String text;
    private final AnsiColor ansiColor;
    private final long time;

    public LogInfo(LogLevel logLevel, Class<?> clazz, String text, AnsiColor ansiColor, long time) {
        this.logLevel = logLevel;
        this.clazz = clazz;
        this.text = text;
        this.ansiColor = ansiColor;
        this.time = time;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public String getText() {
        return text;
    }

    public AnsiColor getAnsiColor() {
        return ansiColor;
    }

    public long getTime() {
        return time;
    }

}
