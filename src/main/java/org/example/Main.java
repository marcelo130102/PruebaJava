package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        // log messages using log(Level level, String msg)
        logger.log(Level.INFO, "This is message 1");
        logger.log(Level.WARNING, "This is message 2");

    }
}