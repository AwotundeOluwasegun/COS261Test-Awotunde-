package methodoverload;   
public class MethodOverload {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        // Create object of MethodOverload class
        MethodOverload calc = new MethodOverload();
        //it call the different versions of add method
        System.out.println("Addition of 24 and 8: " + calc.add(24, 8));
        System.out.println("Addition of 6, 4 and 6: " + calc.add(6, 4, 6));
        System.out.println("Addition of 29.5 and 12.5: " + calc.add(29.5, 12.5));
    }
    
}
