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
        
        NumberControl numberControl = new NumberControl();
        
        numberControl.guessNumber(choice);
        return false;
    }
    
    public void displayResult(String result)
    {
        console.println(result);
    }
    
}
