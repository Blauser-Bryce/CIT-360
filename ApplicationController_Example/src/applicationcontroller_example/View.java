/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author Bryce Blauser
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = ApplicationController_Example.getInFile();
    protected final PrintWriter console = ApplicationController_Example.getOutFile();
        
    public View() {
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        boolean done = false; // set flag for not done
        
        //console.println(this.menu);
        
        do {
            // prompt for and get menu input
            String value = this.getInput();
            if (value.toUpperCase().equals("X")) // user wants to exit
                return;
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
    }
    
    @Override
    public String getInput() {
        
        String value = null; // value to be returned
        boolean valid = false; // initialize to not valid
        try {
            while (!valid) { // loop while invalid value is entered

                // Prompt with message
                this.console.println("\n" + this.displayMessage);

                value = this.keyboard.readLine(); // get next line typed on the keyboard
                value = value.trim(); // trim off the leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ViewError.display(this.getClass().getName(),"You must enter a value");
                    continue;
                }
                break; // end the loop
            }
        } catch (Exception e) {
            ViewError.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
        }
        return value;
    }
}
