import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
       Scanner scan = new Scanner(System.in);
       int x;
         System.out.println("Which service would you like to use?"+"\n"+"[1]: Basic week visualizer"+ "\n" +"[2]: Advanced week visualizer"+ "\n"+"[3]: Basic calculator"+ "\n" +"[4]: Employee repertoire");
         x = scan.nextInt();
       while(x>=1 && x<=4){
        switch(x){
        case 1:BasicWeek basic = new BasicWeek();
         basic.printDays();
         x= x+4;
         break;


        case 2:AdvancedWeek adv = new AdvancedWeek();
       adv.printDays();
       x= x+4;
       break;

        case 3: Calculator calc = new Calculator();






        } 
    }
}
}