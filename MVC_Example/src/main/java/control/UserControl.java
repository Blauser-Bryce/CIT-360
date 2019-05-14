/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.UserModel;
import mvc_example.Main;

/**
 *
 * @author Bryce Blauser
 */

public class UserControl {
        
    public static UserModel createUser(String name) {
        
        if (name == null) {
            return null;
        }
        
        UserModel user = new UserModel();
        user.setName(name);
        Main.setUser(user); // set the user
        
        return user;
    }
    
    public static String getUserName() {
        return Main.getUser().getName();
    }
    
}
