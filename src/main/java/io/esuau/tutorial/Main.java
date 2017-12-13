package io.esuau.tutorial;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class.getName());

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
            String str = i + ": " + fibonacci(i);
            System.out.println(str);
            logger.info(str);
        }
    }

    private static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
