/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;
import model.NumberModel;
import mvc_example.Main;

/**
 *
 * @author Bryce Blauser
 */

public class NumberControl {
        
    public String guessNumber (Integer choice) {
                
        NumberModel num = new NumberModel();
        
        Random random = new Random();
        
        num.setNumber(random.nextInt(10) + 1);
        Main.setNumber(num);
        
        if (choice == num.getNumber()) {
            return "Correct!  You guessed my number.";
        } 
        
        return "Sorry, you guessed [" + choice + "], but my number was [" + num.getNumber() + "]";
    }
}
