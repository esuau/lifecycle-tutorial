package io.esuau.tutorial.console;

import java.util.Scanner;
import org.apache.log4j.Logger;
import io.esuau.tutorial.business.*;

public class Console {

    private final static Logger logger = Logger.getLogger(Console.class.getName());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("//// Fibonacci ////");
        System.out.print("Enter n: ");
        int n;
        try {
            n = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            n = 5;
        }
        logger.info("n = " + n);
        for (int i = 1; i <= n; i++) {
            String str = i + ": " + Fibonacci.fibonacci(i);
            System.out.println(str);
            logger.info(str);
        }
    }

}
