package org.sudip.logging;

import java.util.logging.Logger;
import java.util.logging.Level;

public class SimpleLogging {
    private static final Logger logger = Logger.getLogger(SimpleLogging.class.getName());
    
    public static void main(String[] args) {
        logger.log(Level.SEVERE, "This is an error message");
        logger.log(Level.WARNING, "This is a warning message");
        System.out.println("Logging messages sent successfully!");
    }
}
