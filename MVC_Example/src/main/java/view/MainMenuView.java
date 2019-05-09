/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Bryce Blauser
 */
public class MainMenuView extends View {
        
    public MainMenuView() {
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
        GuessView guessMenu = new GuessView();
        guessMenu.display();
    }

}
