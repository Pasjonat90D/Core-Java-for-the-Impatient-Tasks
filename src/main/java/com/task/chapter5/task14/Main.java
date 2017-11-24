package com.task.chapter5.task14;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {


    public static void main(String[] args) throws IOException {
        Logger.getGlobal().info("Logger");
       Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fHandler = new FileHandler("LOGGED.xml");
        fHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(fHandler);
        logger.info("WHAT");

    }
}
