import java.util.Scanner;

public class EntryPoint {
    private static final String MENU = "Which service would you like to use?"
            + "\n[1]: Basic week visualizer"
            + "\n[2]: Advanced week visualizer"
            + "\n[3]: Basic calculator"
            + "\n[4]: Employee repertoire";

    private static int readMenuChoice(Scanner scan) {
        while (true) {
            System.out.println(MENU);
            if (scan.hasNextInt()) {
                int choice = scan.nextInt();
                scan.nextLine();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                }
            } else {
                scan.nextLine();
            }
            System.out.println("Please make sure you pick a number between 1 and 4");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            int choice = readMenuChoice(scan);
            switch (choice) {
                case 1:
                    BasicWeek basic = new BasicWeek();
                    basic.printDays();
                    break;
                case 2:
                    AdvancedWeek advanced = new AdvancedWeek();
                    advanced.printDays();
                    break;
                case 3:
                    new Calculator();
                    break;
                case 4:
                    Employee employee = new Employee();
                    System.out.println(employee);
                    break;
                default:
                    throw new IllegalStateException("Unexpected menu choice: " + choice);
            }

            System.out.println("Would you like to perform another operation? (y/n)");
            answer = scan.nextLine();
        } while (answer.equalsIgnoreCase("y"));
    }
}
