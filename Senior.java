/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Senior extends Visitor {

    public Senior(String fName, String lName, String email, String phone) {
        super(fName, lName, email, phone);
    }
    
    
    public void exit() {
        System.out.println("\nA senior visitor has exited");
    }
    
}
