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
}
