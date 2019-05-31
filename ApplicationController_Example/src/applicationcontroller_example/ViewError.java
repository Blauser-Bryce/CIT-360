/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import java.io.PrintWriter;

/**
 *
 * @author Bryce Blauser
 */
public class ViewError {
    
    private static final PrintWriter errorFile = ApplicationController_Example.getOutFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                "-----------------------------------------------------------------------------"
               +"\n- ERROR - " + errorMessage
               +"\n-----------------------------------------------------------------------------");
    }
}
