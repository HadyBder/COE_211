import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int x;
       String y= "y";
        do{ 
            System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+ "\n" +"[2]: Advanced week visualizer"+ "\n"+"[3]: Basic calculator"+ "\n" +"[4]: Employee repertoire");
         x = scan.nextInt();
    while (x<1 || x>4){
        System.out.println("Please make sure you pick a number between 1 and 4");
        System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+ "\n" +"[2]: Advanced week visualizer"+ "\n"+"[3]: Basic calculator"+ "\n" +"[4]: Employee repertoire");
        x = scan.nextInt();

    }switch(x){
        case 1:BasicWeek basic = new BasicWeek();
         basic.printDays();
         x= x+4;
         break;


        case 2:AdvancedWeek adv = new AdvancedWeek();
       adv.printDays();
       x= x+4;
       break;

        case 3: Calculator calc = new Calculator();
            x = x+4;
            
            break;

        case 4: Employee emp = new Employee();
            System.out.println(emp);
            x = x+4;
            break;
}if(x>4){
                 y = scan.nextLine();
                System.out.println("Would you like to perform another operation? (y/n)");
                y = scan.nextLine();
                }}while(y.equals("y"));
}
}