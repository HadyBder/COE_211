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
        System.out.println("Input the operator:");
        operator = scan.nextLine();
        System.out.println("Input the second number:");
        num2 = scan.nextInt();
        switch(operator){
        case "+": 
            add(num1, num2);
            System.out.println(add(num1, num2));
        case "-":
            subtract(num1,num2);
            System.out.println(subtract(num1, num2));
        case "*":
            multiply(num1, num2);
            System.out.println(multiply(num1, num2));
        case "/":
            divide(num1, num2);
            System.out.println(divide(num1, num2));
        }
    }
}

    public String add(int a, int b) {
        return a+ "+" + b + "="+(a+b);
    }

    public String subtract(int a, int b) {
        return a + "-" + b +"=" + (a-b);
    }

    public String multiply(int a, int b) {
        return a + "*" + b +"=" + (a*b);
    }

    public String divide(int a, int b) {
        return a + "/" + b +"=" + (a/b);
}