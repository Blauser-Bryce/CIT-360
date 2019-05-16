/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.UserControl;

/**
 *
 * @author Bryce Blauser
 */
public class StartProgramView extends View {
    
    private String user;
     
    public StartProgramView() {
        // prompt message and display banner        
        super("\nPlease enter your name (X to quit): ");
            
        // Display the banner
        this.displayBanner();
    }

    public void displayBanner() {
      console.println(
        "***************************************************************************************"
      + "\n*This is just a simple MVC example showing how the models, views and controllers      *"
      + "\n*interact with each other                                                             *"
      + "\n***************************************************************************************");
    }

    @Override
    public boolean doAction(String value) {
        UserControl userControl = new UserControl();   
        
        userControl.checkEntry(value);
        return false;
    }
    
    public void displayNextView(String user) {
        console.println("\n========================================="
                         + "\n Welcome to the MVC example " + user
                         + "\n=========================================");
       
        // Create MainMenu object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the main menu view
        mainMenuView.display();
                
    }
    
    public void displayResult(String result)
    {
        console.println(result);
    }
}
