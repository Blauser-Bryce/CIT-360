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
public class Number {
    private Integer number;
    
    public Number() {
        number = -1;
    }
    
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
        ApplicationController_Example.setNumber(this);
    }   
}
