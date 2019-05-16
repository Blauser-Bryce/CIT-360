/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import mvc_example.Main;

/**
 *
 * @author Bryce Blauser
 */

public class UserModel {
    
    private String name;
    
    public UserModel() {
        name = "Unknown";
    }
    
    public String getName() {
        return Main.getUser().name;
    }

    public void setName(String name) {
        this.name = name;
        Main.setUser(this); // set the user
    }
    
}
