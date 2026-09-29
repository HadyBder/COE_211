import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        num1 = scan.nextInt();
        scan.nextLine();
        System.out.println("Input the operator:");
        operator = scan.nextLine();
        System.out.println("Input the second number:");
        num2 = scan.nextInt();

        String result;
        switch(operator){
        case "+":
            result = add(num1, num2);
            break;
        case "-":
            result = subtract(num1, num2);
            break;
        case "*":
            result = multiply(num1, num2);
            break;
        case "/":
            result = divide(num1, num2);
            break;
        default:
            result = "Unsupported operator. Use +, -, *, or /.";
            break;
        }
        System.out.println(result);
    }

    public String add(int a, int b) {
        return  (a+ "+" + b + "=" +(a+b));
    }

    public String subtract(int a, int b) {
        return  (a + "-" + b +"=" + (a-b));
    }

    public String multiply(int a, int b) {
        return  (a + "*" + b +"=" + (a*b));
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide by zero.";
        }
        return  (a + "/" + b +"=" + (a/b));

    }
}
