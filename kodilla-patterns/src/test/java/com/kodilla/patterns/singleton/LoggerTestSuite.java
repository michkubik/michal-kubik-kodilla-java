package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

  /*  @BeforeAll
        public static void openNewLog() {
        logger = new Logger();
    }
    @AfterAll
        public static void closeNewLog() {
        logger.getLastLog();
    }*/

    @Test
    void testGetLastLog() {

        //Given
        Logger logger = new Logger();

        //When
        logger.log("Log 1: Change font");
        logger.log("Log 2: Change style");
        logger.log("Log 3: Save current settings");

        //Then
        assertEquals("Log 3: Save current settings", logger.getLastLog());


    }





}
