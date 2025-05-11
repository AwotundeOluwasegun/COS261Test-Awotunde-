package modulocomparison;
import java.util.Scanner;
public class ModuloComparison {
    public static void main(String[] args) {
        int num=0;
        String comparison;
        Scanner input = new Scanner(System.in);
        System.out.print("input an integer number to determine oddness or eveness: ");
        num = input.nextInt();
        if(num % 2 == 1){
           comparison = "The is an odd integer";
        }else{
            comparison = "This is an even integer";
        }
        System.out.println("result: " + comparison);               
    }
    
}
