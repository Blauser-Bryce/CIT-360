/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.NumberControl;

/**
 *
 * @author Bryce Blauser
 */
public class GuessView extends View {
    
    String result;
    
    public GuessView() {
        super("\n"
                + "\n----------------------------------"
                + "\n| Guess a number between 1 and 10 |"
                + "\n----------------------------------"
                + "\nEnter a number, or X to exit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // converto to upper
        
        if (choice.matches("[1-9]|10")) {
            //console.println(choice); 
            this.guess(choice);
        } else {
            console.println("\n*** Invalid selection.  Must be between 1 and 10. *** Try again");
        }
        
        return false;
    }
    
    private void guess(String choice) {
        
        NumberControl numberControl = new NumberControl();
        result = numberControl.guessNumber(Integer.parseInt(choice));
        
        console.println(result);
    }
    
}
