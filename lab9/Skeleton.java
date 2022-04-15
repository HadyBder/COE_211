import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int attendance, midterm;

        // Initialize array of integers
        int[] arr = new int[5];

        // for loop to get user input & store in array
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input the grade of assignment " + i);
            arr[i - 1] = scan.nextInt();
        }

        System.out.println("Input the number of attended labs");
        attendance = scan.nextInt();
        System.out.println("Input the midterm grade");
        midterm = scan.nextInt();

        // for loop to iterate over the array & perform calculations
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int overallAssignment = (int) ((sum / 5.0) * 0.3);
        int overallAttendance = (int) (((attendance * 100) * 0.05) / 7.0);
        int overallMidterm = (int) (midterm * 0.3);

        // display output to user
        System.out.println("Assignments (30%): " + overallAssignment);
        System.out.println("Attendance (5%): " + overallAttendance);
        System.out.println("Midterm (30%): " + overallMidterm);

    }
}