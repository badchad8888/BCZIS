/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Animal {
    String type;
    String environment; //name associated with environment
    String age; //6 months, 2 years, etc.
    String sex; 
    String food;
    String activity;
    
    public Animal(String type, String env, String age, String sex, String food, String activity) {
        this.type = type;
        environment = env;
        this.age = age;
        this.sex = sex;
        this.food = food;
        this.activity = activity;
    }
    
    public void feed() {
        
        System.out.println("\nThe " + type + " has been feed.");
    }
    
    public void sick() {
        
        System.out.println("\nThe " + type + " is sick.");
    }    
    public void info() {
        System.out.println("The animal has the following information:");
        System.out.println("Type: " + type);
        System.out.println("Environment: " + environment);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
        System.out.println("Food: " + food);
        System.out.println("Activity: " + activity);
    }
    
}
