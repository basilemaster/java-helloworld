package com.mbali.primetechno.it.helloword;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String greeting = "Basile";
        greet(greeting);

        greeting = "to all the team";
        greet(greeting);

        int number = 5;
        int doubled = doubleNumber(number);

        System.out.println("The double number is: " + doubled);

    }

    private static void greet(String greeting) {
        LOGGER.warn ("Hello, " + greeting + " !!!");
    }

    public static int doubleNumber(int input) {
        return 2 * input;
    }
}
