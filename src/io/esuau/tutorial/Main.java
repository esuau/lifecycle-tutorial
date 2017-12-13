package io.esuau.tutorial;

import java.util.Scanner;

public class Main {

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
        for (int i = 1; i <= n; i++)
            System.out.println(i + ": " + fibonacci(i));
    }

    private static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
