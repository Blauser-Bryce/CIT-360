/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.PrintWriter;
import mvc_example.Main;

/**
 *
 * @author Bryce Blauser
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Main.getOutFile();
    
    public static void display(String className, String errorMessage) {
        errorFile.println(
                "-----------------------------------------------------------------------------"
               +"\n- ERROR - " + errorMessage
               +"\n-----------------------------------------------------------------------------");
    }
}
