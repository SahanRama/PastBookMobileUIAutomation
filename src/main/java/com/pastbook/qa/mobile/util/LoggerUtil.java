package com.pastbook.qa.mobile.util;


import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUtil {
    private LoggerUtil(){}
    private static Logger logger = Logger.getAnonymousLogger();

    public static void logINFO(String logMessage) {
        logger.log(Level.INFO, logMessage);
    }

    public static void logERROR(String logMessage, Throwable throwable) {
        if (throwable != null) {
            logger.log(Level.SEVERE, logMessage, throwable);
        } else {
            logger.log(Level.SEVERE, logMessage);
        }
    }

    public static void log(String logMessage) {
            Logger logger = Logger.getLogger("logger");
            logger.info(logMessage);

    }

}
