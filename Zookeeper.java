/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Zookeeper extends Employee {
    
    public Zookeeper(String fName, String lName, String email, String phone, int SSN) {
        super(fName, lName, email, phone, SSN);
    }
            
    public void cleaned() {
        System.out.println("\nThe are has been marked as clean by the zookeeper named " + firstName + " " + lastName + ".");
    }
    
    public void atWork() {
        System.out.println("\nThe zookeeper named " + firstName + " " + lastName + " has arrived at work.");
    }
    
    public void off() {
        System.out.println("\nThe zookeeper named " + firstName + " " + lastName + " has departed from work.");
    }
    
    public void open() {
        System.out.println("\nThe zookeeper named " + firstName + " " + lastName + " has updated the animal's exhibit as open.");
    }
    
    public void close() {
        System.out.println("\nThe zookeeper named " + firstName + " " + lastName + " has updated the animal's exhibit as closed.");
    }
    
    public void feed() {
        System.out.println("\nThe zookeeper named " + firstName + " " + lastName + " fed the animal five pounds of hay.");
    }
    
}
