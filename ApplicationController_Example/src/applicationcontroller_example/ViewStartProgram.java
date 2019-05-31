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
public class ViewStartProgram extends View {
    
    private String user;
     
    public ViewStartProgram() {
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
        //UserControl userControl = new UserControl();   
        
        //userControl.checkEntry(value);
        
        //////  HANDLE REQUEST
        
        return false;
    }
    
    public void displayNextView(String user) {
        console.println("\n========================================="
                         + "\n Welcome to the MVC example " + user
                         + "\n=========================================");
       
        // Create MainMenu object
        ViewMainMenu mainMenuView = new ViewMainMenu();
        
        // Display the main menu view
        mainMenuView.display();
                
    }
    
    public void displayResult(String result)
    {
        console.println(result);
    }
}
