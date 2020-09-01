package com.lowlevelsubmarine.java_logger.listeners;

import com.lowlevelsubmarine.java_logger.LogInfo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogReceiver implements LogReceiver {

    private final FileWriter fileWriter;

    public FileLogReceiver(File file) throws IOException {
        this.fileWriter = new FileWriter(file);

    }

    @Override
    public void onLog(LogInfo logInfo) {
    }

}
