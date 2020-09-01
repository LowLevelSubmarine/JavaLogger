package com.lowlevelsubmarine.java_logger;

//Shortcut class
public class JL extends JavaLogger {

    public static void w(String text) {
        warn(text);
    }
    public static void w(Object obj, String text) {
        warn(obj, text);
    }
    public static void w(Class<?> clazz, String text) {
        warn(clazz, text);
    }
    public static void w(String text, AnsiColor ansiColor) {
        warn(text, ansiColor);
    }
    public static void w(Object obj, String text, AnsiColor ansiColor) {
        warn(obj, text, ansiColor);
    }
    public static void w(Class<?> clazz, String text, AnsiColor ansiColor) {
        warn(clazz, text, ansiColor);
    }

    public static void i(String text) {
        info(text);
    }
    public static void i(Object obj, String text) {
        info(obj, text);
    }
    public static void i(Class<?> clazz, String text) {
        info(clazz, text);
    }
    public static void i(String text, AnsiColor ansiColor) {
        info(text, ansiColor);
    }
    public static void i(Object obj, String text, AnsiColor ansiColor) {
        info(obj, text, ansiColor);
    }
    public static void i(Class<?> clazz, String text, AnsiColor ansiColor) {
        info(clazz, text, ansiColor);
    }

    public static void d(String text) {
        debug(text);
    }
    public static void d(Object obj, String text) {
        debug(obj, text);
    }
    public static void d(Class<?> clazz, String text) {
        debug(clazz, text);
    }
    public static void d(String text, AnsiColor ansiColor) {
        debug(text, ansiColor);
    }
    public static void d(Object obj, String text, AnsiColor ansiColor) {
        debug(obj, text, ansiColor);
    }
    public static void d(Class<?> clazz, String text, AnsiColor ansiColor) {
        debug(clazz, text, ansiColor);
    }

}
