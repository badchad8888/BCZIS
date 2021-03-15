/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Child extends Visitor {

    public Child(String fName, String lName, String email, String phone) {
        super(fName, lName, email, phone);
    }
    
    public void exit() {
        System.out.println("\nA child visitor has exited");
    }    
}
