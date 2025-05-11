package multiplicationtable;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        // declaring a variable name
        int num = 0; 
        Scanner input = new Scanner(System.in);
        // requesting the multiplication table to print
        System.out.print("multiplication table: ");
        num = input.nextInt(); // input
        //repeating multiplication until count set is met
        for(int i = 1; i <= 12; i++ ){ 
            //result
             System.out.println(num + " x " + i + " = " + (num * i));
        }       
    }
    
}
