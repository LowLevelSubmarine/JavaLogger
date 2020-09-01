package com.lowlevelsubmarine.java_logger;

import com.lowlevelsubmarine.java_logger.listeners.PrintLogReceiver;

public class Testing {

    public static void main(String[] args) {
        JavaLogger.addListener(new PrintLogReceiver());
        JL.d(Testing.class, "Test", AnsiColor.GREEN);
    }

}
