/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class FoodWorker extends Employee {
    
    public FoodWorker(String fName, String lName, String email, String phone, int SSN) {
        super(fName, lName, email, phone, SSN);
    }
    
    public void atWork() {
        System.out.println("\nThe food worker named " + firstName + " " + lastName + " has arrived at work.");
    }
    
    public void off() {
        System.out.println("\nThe food worker named " + firstName + " " + lastName + " has departed from work.");
    }
}
