/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Veterinarian extends Employee {
    
    public Veterinarian(String fName, String lName, String email, String phone, int SSN) {
        super(fName, lName, email, phone, SSN);
    }
    
    public void instructions() {
        System.out.println("\nInstructions for the animal's care have been updated by " + firstName + " " + lastName + ".");
    }
}
