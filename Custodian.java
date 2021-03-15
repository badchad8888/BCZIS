/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Custodian extends Employee {
    
    public Custodian(String fName, String lName, String email, String phone, int SSN) {
        super(fName, lName, email, phone, SSN);
    }
    
    public void cleaned() {
        System.out.println("\nThe are has been marked as clean by the custodial worker named " + firstName + " " + lastName + ".");
    }
    
    public void atWork() {
        System.out.println("\nThe custodial worker named " + firstName + " " + lastName + " has arrived at work.");
    }
    
    public void off() {
        System.out.println("\nThe custodial worker named " + firstName + " " + lastName + " has departed from work.");
    }
    
}
