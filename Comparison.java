package comparison;
public class Comparison {
    public static void main(String[] args) {       
        String first = new String("hello");    
        String second= new String("hello");
        System.out.println("Using == : " + (first == second) );         // false
        System.out.println("Using .equals(): " + first.equals(second)); // true

    }
    
}
