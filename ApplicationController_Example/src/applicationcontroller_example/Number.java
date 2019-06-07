/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import java.util.Random;

/**
 *
 * @author Bryce Blauser
 */
public class Number {
    
    private Integer intChoice;
    private Integer number;
    
    public Number() {
        number = -1;
    }
    
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
        ApplicationController_Example.setNumber(this);
    }   
    
    public String guessNumber (String choice) {
        
        if (choice.matches("[1-9]|10")) {
            intChoice = Integer.parseInt(choice);
                
            Number num = new Number();

            Random random = new Random();

            num.setNumber(random.nextInt(10) + 1);

            if (intChoice == num.getNumber()) {
                return "Correct!  You guessed my number.";
            } 

            return "Sorry, you guessed [" + choice + "], but my number was [" + num.getNumber() + "]";
        } else {
            return "\n*** Invalid selection.  Must be between 1 and 10. *** Try again";
        }
        
    }
}
