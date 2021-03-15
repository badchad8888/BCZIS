/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Employee {
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    int SSN;
    
    public Employee(String fName, String lName, String email, String phone, int SSN) {
        firstName = fName;
        lastName = lName;
        this.email = email;
        phoneNumber = phone;
        this.SSN = SSN;   
    }
    
    public void view() {
            System.out.println("\nThe location of employee " + firstName + " " + lastName + " is now visible on the map");
        }
    
    public void message(String message) {
        System.out.println("\nThe following message has been sent to employee " + firstName + " " + lastName + ":");
        System.out.println(message);
    }         
}
