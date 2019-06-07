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
public class User {
    private String name;
    
    public User() {
        name = "Unknown";
    }
    
    public String getName() {
        return ApplicationController_Example.getUser().name;
    }

    public void setName(String name) {
        this.name = name;
        ApplicationController_Example.setUser(this); // set the user
    }    
    
    public boolean checkEntry (String value){
        
        ViewStartProgram view = new ViewStartProgram();
        
        if (value.length() < 2) {
            view.displayResult("\nInvalid user name:"
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createUser() control function
        if (this.createUser(value) == null) { // if unsuccessful
            view.displayResult("\nError creating user.");
            return false;
        }
                
        // display next view
        view.displayNextView(this.getUserName());
        return true;
    }
    
    public static User createUser(String name) {
        
        if (name == null) {
            return null;
        }
        
        User user = new User();
        user.setName(name);

        return user;
    }
    
    public static String getUserName() {
        User user = new User();
        return user.getName();
    }
}
