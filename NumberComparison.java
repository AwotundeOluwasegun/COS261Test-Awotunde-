package numbercomparison;
import java.util.Scanner;
public class NumberComparison {
 
    public static void main(String[] args) {
        double num1=0, num2=0, num3=0, largestNum=0; //declaring variables
        Scanner input = new Scanner(System.in);
        System.out.print("input first number: ");  // requesting first input
        num1 = input.nextDouble();   // first input
        System.out.print("input second number: "); //requesting second input
        num2 = input.nextDouble();   //second input 
        System.out.print("input third number: ");  //requesting third input
        num3 = input.nextDouble();  //third input
        //Comparison
        if(num1>=num2 && num1>= num3){
           largestNum = num1;
        }else if(num2>=num1 && num2>=num3){
           largestNum = num2;
        }else{
            largestNum = num3;     
        }
        System.out.println("The largest of the three input is: " + largestNum); //
    }
    
}
