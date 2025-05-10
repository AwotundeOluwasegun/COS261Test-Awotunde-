package addition;
import java.util.Scanner;
public class Addition {   
    public static void main(String[] args) {
        int num1=0, num2=0, add=0; // Declaring variable names
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer number: "); //requesting first int value
        num1 = input.nextInt(); //input
        System.out.print("Input second integer number: "); //requesting second int value
        num2 = input.nextInt(); //input
        add = num1 + num2; // adding the int values
        System.out.println("The sum of the integer is: " + add); //display add output 
    }
    
}
