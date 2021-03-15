/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Adult extends Visitor {

    public Adult(String fName, String lName, String email, String phone) {
        super(fName, lName, email, phone);
    }
    
    public void exit() {
        System.out.println("\nAn adult visitor has exited");
    }    
}
