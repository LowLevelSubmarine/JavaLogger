package com.lowlevelsubmarine.java_logger.listeners;

import com.lowlevelsubmarine.java_logger.AnsiColor;
import com.lowlevelsubmarine.java_logger.LogInfo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class PrintLogReceiver implements LogReceiver {

    private static final SimpleDateFormat SHORT_DATE_FORMAT = new SimpleDateFormat("HH:mm");
    private static final SimpleDateFormat LONG_DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd HH:mm");

    private final boolean shortTimestamp;

    public PrintLogReceiver() {
        this.shortTimestamp = false;
    }

    public PrintLogReceiver(boolean shortTimestamp) {
        this.shortTimestamp = shortTimestamp;
    }

    @Override
    public void onLog(LogInfo logInfo) {
        String timestamp = "[" + (shortTimestamp? SHORT_DATE_FORMAT : LONG_DATE_FORMAT).format(new Timestamp(logInfo.getTime())) + "] ";
        String clazz  = logInfo.getClazz() != null? "[" + logInfo.getClazz().getSimpleName() + "] " : "";
        String color = logInfo.getAnsiColor() != null? logInfo.getAnsiColor().getString() : "";
        System.out.println(AnsiColor.RESET + timestamp + clazz + color + logInfo.getText() + AnsiColor.RESET);
    }

}
