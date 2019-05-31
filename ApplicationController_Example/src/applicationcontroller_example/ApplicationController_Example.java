/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Bryce Blauser
 */
public class ApplicationController_Example {

    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    
    private static User user = null;
    private static Number number = null;
    
    public static void main(String[] args) {
        try {
            
            // Open character stream files for end user input and output
            ApplicationController_Example.inFile = new BufferedReader(new InputStreamReader(System.in));
            ApplicationController_Example.outFile = new PrintWriter(System.out, true);
                        
            ViewStartProgram startProgramView = new ViewStartProgram();
            startProgramView.display();
            return;
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        } finally {
            try {
                if (ApplicationController_Example.inFile != null)
                    ApplicationController_Example.inFile.close();
                
                if (ApplicationController_Example.outFile != null)
                    ApplicationController_Example.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        ApplicationController_Example.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static User getUser() {
        return user;
    }

    public static void setUser(User user) {
        ApplicationController_Example.user = user;
    }
    
    public static void setNumber(Number number) {
        ApplicationController_Example.number = number;
    }
}
    

