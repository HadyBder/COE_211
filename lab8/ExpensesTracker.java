import java.util.*;
import java.io.*;
public class ExpensesTracker {
    public static void main(String[] args) throws IOException {
        String name, object, answer, summary, display, a ,b;
        double money;
        try {
            // Create FileWriter & Scanner objects & y/n string
            Scanner scan = new Scanner(System.in);
            FileWriter fw = new FileWriter(new File("expenses.txt"));

            // Start gathering information inside the loop you will start
            do {

                System.out.println("Input your name: ");
                name = scan.nextLine();
                System.out.println("What did you purchase?");
                object = scan.nextLine();
                System.out.println("How much did you pay? (in USD)");
                money = scan.nextDouble();
                scan.nextLine();
                b = name +" "+ "purchased" +" "+ object +" "+ "for"+" "+ money +" "+ "US dollars.";
                fw.write(b);
                System.out.println("Would you like to log another purchase? (y/n)");
                answer = scan.nextLine();


            } while (answer.equals("y"));

            System.out.println("Get off of ZoodMall!");
            fw.close();

            System.out.println("Would you like to read a summary of your purchases?(y/n)");
            summary = scan.nextLine();

            FileReader reader = new FileReader("expenses.txt");
            Scanner readit = new Scanner(new File("expenses.txt"));

            if (summary.equals("y")) {
                int data = reader.read();
                
                while (readit.hasNext()) {
                    System.out.println(readit.nextLine());
                }

            }
            System.out.println("Get off of ZoodMall!");

            // Close ClassWriter & Scanner objects
            fw.close();

            scan.close();
            reader.close();

            // If you have already have a expenses.txt file, you need to delete it
            // before you compile your code again
        } catch (IOException c) {
            System.out.println("An error occurred.");
            c.printStackTrace();
        }
    }
}