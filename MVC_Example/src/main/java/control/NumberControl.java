/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.util.Random;

import model.NumberModel;
import view.GuessView;


/**
 *
 * @author Bryce Blauser
 */

public class NumberControl {
    
    private Integer intChoice;
                
    public void guessNumber (String choice) {
        
        choice = choice.toUpperCase(); // convert to upper
        
        GuessView view = new GuessView();
        
        if (choice.matches("[1-9]|10")) {
            intChoice = Integer.parseInt(choice);
                
            NumberModel num = new NumberModel();

            Random random = new Random();

            num.setNumber(random.nextInt(10) + 1);

            if (intChoice == num.getNumber()) {
                view.displayResult("Correct!  You guessed my number.");
                return;
            } 

            view.displayResult("Sorry, you guessed [" + choice + "], but my number was [" + num.getNumber() + "]");
        } else {
            view.displayResult("\n*** Invalid selection.  Must be between 1 and 10. *** Try again");
        }
        
    }
}
