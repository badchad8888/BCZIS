/*
Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;

/*
 Driver program class
 */
public class BCZIS {

    /*
     Brevard County Zoo Information System Driver simulating map interaction 
     */
    public static void main(String[] args) {
         
        // Brief explanation
        System.out.println("The is a brief demonstration of some of the classes"
                + " created for Brevard County Zoo Information System.\n\n"
                + "The first object created is a visitor and the second is"
                + " a senior which is a specific visitor.\n"
                + "With all objects, there will be methods. There are three for"
                + " a visitor: entrance, exit, and info.\n\n");
        
        Visitor visitor = new Visitor("Average", "Joe", "testemail@test.com", "1+(234)567-8910");
        visitor.info();// method call
        
        visitor.entrance();// method call
        
        System.out.println("\n");
        
        Senior senior = new Senior("Old", "Man", "oldmanemail@old.com", "1+(234)568-9101");
        senior.info();// method call
        
        visitor.exit();// method call
        
        System.out.println("\nThe second part of the demonstration will create"
                + " an animal object.\nAgain this will be the process for"
                + " all of the classes. Create an object and use it's "
                + "methods.");
        
        Animal animal = new Animal("Tiger", "jungle", "four years", "male", "meat", "hunt");
        animal.info();// method call
        
        animal.feed();// method call
        animal.sick();// method call
        
        System.out.println("\nEvery class created could be demonstrated with "
                + "the same methods of creating an object and then calling its methods."
                + "\nThis program has simulated what the map would do when "
                + "inputs were generated and combined with this program.");
        
        
    }
    
}
