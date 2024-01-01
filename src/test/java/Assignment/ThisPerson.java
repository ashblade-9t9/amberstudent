package Assignment;

public class ThisPerson {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    public ThisPerson(String name, int age) {
        // Use 'this' to refer to instance variables
        this.name = name;
        this.age = age;
    }

    // Method using 'this'
    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Create an instance of the Person class
        ThisPerson person = new ThisPerson("John", 25);

        // Call the displayInfo method
        person.displayInfo();
    }
}