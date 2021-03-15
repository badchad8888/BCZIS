/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Visitor {
    String firstName;
    String lastName;
    String email;
    String phoneNumber; 
    
    public Visitor(String fName, String lName, String email, String phone) {
        firstName = fName;
        lastName = lName;
        this.email = email;
        phoneNumber = phone;
    }
    
    public void entrance() {
        System.out.println("\nA visitor has entered");
    }
    
    public void exit() {
        System.out.println("\nA visitor has exited");
    }
    
    public void info() {
        System.out.println("\nThe visitor has the following information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
