package io.esuau.tutorial.console;

import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;
import io.esuau.tutorial.business.Fibonacci;
import twitter4j.*;

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

        System.out.println("//// Searching tweets #Fibonacci ////");
        Twitter twitter = new TwitterFactory().getInstance();
        try {
            Query query = new Query("#fibonacci");
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    String t = "@" + tweet.getUser().getScreenName() + " - " + tweet.getText();
                    System.out.println(t);
                    logger.info(t);
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            logger.error(te.getStackTrace());
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }

}
