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
public class ViewMainMenu extends View {
        
    public ViewMainMenu() {
        super("\n"
                + "\n--------------------------------"
                + "\n| Main Menu                    |"
                + "\n--------------------------------"
                + "\nN - Number Guesser"
                + "\nX - Exit"
                + "\n--------------------------------");
        
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // converto to upper
        
        switch (choice) {
            case "N":
                this.displayGuessMenu();
                break;
            default:
                console.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void displayGuessMenu() {
        // display the guess menu
        ViewGuess guessMenu = new ViewGuess();
        guessMenu.display();
    }

}
