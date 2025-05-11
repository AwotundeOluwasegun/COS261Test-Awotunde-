//Sub_Class of Teacher
package inheritance;
public class Teacher extends Person{
    String personId;
    // Constructor for initializing values
    public Teacher(String name, int age, String personId) {
        super(name, age);  // Call to superclass constructor
        this.personId = personId;
    }
    // Method to display student details
    public void displayPersonInfo() {
        super.displayInfo();  // Calling the Person Class
        System.out.println("ID: " + personId);
    }
    // Main method to display Person
    public static void main(String[] args) {
        Teacher person = new Teacher("OKORO", 20, "df4446g");
        person.displayPersonInfo();
    }   
}
