/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

/**
 *
 * @author Bryce Blauser
 */
public class ViewGuess extends View {
        
    public ViewGuess() {
        super("\n"
                + "\n----------------------------------"
                + "\n| Guess a number between 1 and 10 |"
                + "\n----------------------------------"
                + "\nEnter a number, or X to exit"
                + "\n----------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert to upper
        
        Number number = new Number();
        displayResult(number.guessNumber(choice));

        return false;
    }
    
    public void displayResult(String result)
    {
        console.println(result);
    }
    
}
