/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.UserModel;
import view.StartProgramView;

/**
 *
 * @author Bryce Blauser
 */

public class UserControl {
    
    public boolean checkEntry (String value){
        
        StartProgramView view = new StartProgramView();
        
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
    
    
    public static UserModel createUser(String name) {
        
        if (name == null) {
            return null;
        }
        
        UserModel user = new UserModel();
        user.setName(name);

        return user;
    }
    
    public static String getUserName() {
        UserModel user = new UserModel();
        return user.getName();
    }
    
}
