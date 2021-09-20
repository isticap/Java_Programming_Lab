/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ats60
 */
public class PrintGreeting {
    private String name; //'name' here is an attribute
    
    public PrintGreeting(String name){ //constructor method... 'name' is considered a PARAMETER
        this.name = name; //this refers to the instance of the object we are currently working with
    }
    
    public void print() {
        System.out.println("Hello " + name + "!");
    }
}

//what is the header for the main method?
