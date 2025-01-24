package com.alesandro.holamundodockerjavafx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.info("Iniciando aplicación");
        HelloApplication.main(args);
    }
}
