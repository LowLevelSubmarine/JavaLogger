package com.lowlevelsubmarine.java_logger;

import com.lowlevelsubmarine.java_logger.listeners.LogReceiver;

import java.util.LinkedList;

public class JavaLogger {

    private static final LinkedList<LogReceiver> receivers = new LinkedList<>();

    public void initiate() {

    }

    public static void addListener(LogReceiver logReceiver) {
        receivers.add(logReceiver);
    }

    public static void log(LogLevel logLevel, Class<?> clazz, String text, AnsiColor ansiColor) {
        LogInfo logInfo = new LogInfo(logLevel, clazz, text, ansiColor, System.currentTimeMillis());
        for (LogReceiver receiver : receivers) {
            receiver.onLog(logInfo);
        }
    }

    public static void warn(String text) {
        log(LogLevel.WARNING, null, text, null);
    }
    public static void warn(Object obj, String text) {
        log(LogLevel.WARNING, obj.getClass(), text, null);
    }
    public static void warn(Class<Object> clazz, String text) {
        log(LogLevel.WARNING, clazz, text, null);
    }
    public static void warn(String text, AnsiColor ansiColor) {
        log(LogLevel.WARNING, null, text, ansiColor);
    }
    public static void warn(Object obj, String text, AnsiColor ansiColor) {
        log(LogLevel.WARNING, obj.getClass(), text, ansiColor);
    }
    public static void warn(Class<?> clazz, String text, AnsiColor ansiColor) {
        log(LogLevel.WARNING, clazz, text, ansiColor);
    }

    public static void info(String text) {
        log(LogLevel.INFO, null, text, null);
    }
    public static void info(Object obj, String text) {
        log(LogLevel.INFO, obj.getClass(), text, null);
    }
    public static void info(Class<Object> clazz, String text) {
        log(LogLevel.INFO, clazz, text, null);
    }
    public static void info(String text, AnsiColor ansiColor) {
        log(LogLevel.INFO, null, text, ansiColor);
    }
    public static void info(Object obj, String text, AnsiColor ansiColor) {
        log(LogLevel.INFO, obj.getClass(), text, ansiColor);
    }
    public static void info(Class<?> clazz, String text, AnsiColor ansiColor) {
        log(LogLevel.INFO, clazz, text, ansiColor);
    }

    public static void debug(String text) {
        log(LogLevel.DEBUG, null, text, null);
    }
    public static void debug(Object obj, String text) {
        log(LogLevel.DEBUG, obj.getClass(), text, null);
    }
    public static void debug(Class<Object> clazz, String text) {
        log(LogLevel.DEBUG, clazz, text, null);
    }
    public static void debug(String text, AnsiColor ansiColor) {
        log(LogLevel.DEBUG, null, text, ansiColor);
    }
    public static void debug(Object obj, String text, AnsiColor ansiColor) {
        log(LogLevel.DEBUG, obj.getClass(), text, ansiColor);
    }
    public static void debug(Class<?> clazz, String text, AnsiColor ansiColor) {
        log(LogLevel.DEBUG, clazz, text, ansiColor);
    }

}
