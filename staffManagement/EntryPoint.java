import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String firstName;
		String lastName;
		int age ;
		double monthlySalary;

		System.out.println("Please input the employee's first name:");
		firstName = scan.nextLine();
		System.out.println("Please input the employee's last name:");
		lastName = scan.nextLine();
		System.out.println("Please input the employee's age:");
		age = scan.nextInt();
		System.out.println("Please input the employee's monthly salary:");
		monthlySalary = scan.nextDouble();
		System.out.println("Employee information:" + firstName +","+" "+ lastName + ","+" " + age +"," + " " + monthlySalary);
		Employee employee = new Employee(firstName, lastName, age, monthlySalary);
	}
}