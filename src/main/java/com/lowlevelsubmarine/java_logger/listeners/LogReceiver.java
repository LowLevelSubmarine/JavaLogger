package com.lowlevelsubmarine.java_logger.listeners;

import com.lowlevelsubmarine.java_logger.LogInfo;

public interface LogReceiver {

    void onLog(LogInfo logInfo);

}
