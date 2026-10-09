import java.util.*;
import java.io.*;

public class ExpensesTracker {
    public static void main(String[] args) throws IOException {
        String name, object, answer, summary, b;
        double money;
        try (Scanner scan = new Scanner(System.in);
             FileWriter fw = new FileWriter(new File("expenses.txt"))) {
            do {
                System.out.println("Input your name: ");
                name = scan.nextLine();
                System.out.println("What did you purchase?");
                object = scan.nextLine();
                while (true) {
                    System.out.println("How much did you pay? (in USD)");
                    String input = scan.nextLine();
                    try {
                        money = Double.parseDouble(input);
                        if (Double.isFinite(money) && money >= 0) {
                            break;
                        }
                    } catch (NumberFormatException ignored) {
                        // Ask again without losing the rest of the input.
                    }
                    System.out.println("Please enter a valid, nonnegative amount.");
                }
                b = name + " purchased " + object + " for " + money + " US dollars.";
                fw.write(b + System.lineSeparator());
                System.out.println("Would you like to log another purchase? (y/n)");
                answer = scan.nextLine();
            } while (answer.equals("y"));

            System.out.println("Get off of ZoodMall!");
            fw.flush();

            System.out.println("Would you like to read a summary of your purchases?(y/n)");
            summary = scan.nextLine();
            if (summary.equals("y")) {
                try (Scanner readit = new Scanner(new File("expenses.txt"))) {
                    while (readit.hasNextLine()) {
                        System.out.println(readit.nextLine());
                    }
                }
            }
            System.out.println("Get off of ZoodMall!");
        } catch (IOException c) {
            System.out.println("An error occurred.");
            c.printStackTrace();
        }
    }
}
