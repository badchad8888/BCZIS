/*
 Program created by: Chad Marshall
 Brevard County Zoo Information System
 */
package bczis;


public class Environment {
    String type;
    String size; //small, medium, large, etc.
    String security;
    String uses;
    String name;
    
    public Environment(String type, String size, String security, String uses, String name) {
        this.type = type;
        this.size = size;
        this.security = security;
        this.uses = uses;
        this.name = name;
    }
    
    public void close() {
        System.out.println("\nThe environment called " + name + " has been closed.");
    }
    
    public void open() {
        System.out.println("\nThe environment called " + name + " has opened.");
    }
    
    public void secure() {
        System.out.println("\nThe environment called " + name + " has been secured.");
    }
    
    public void fireSuppresion() {
        System.out.println("\nSprinklers are engaged! Fire has been detected!");
    }
    
}
