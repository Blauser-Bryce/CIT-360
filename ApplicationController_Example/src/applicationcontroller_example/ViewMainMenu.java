/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import static applicationcontroller_example.RequestHandler.handleRequest;

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
        
        // Handle the request
        View view = handleRequest(choice);
        view.display();

        return false;
    }

}
