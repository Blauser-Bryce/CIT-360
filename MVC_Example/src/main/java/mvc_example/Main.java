/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.UserModel;
import model.NumberModel;
import view.StartProgramView;

/**
 *
 * @author Bryce Blauser
 */
public class Main {
    
    public static PrintWriter outFile = null;
    public static BufferedReader inFile = null;
    
    private static UserModel user = null;
    private static NumberModel number = null;
    
    public static void main(String[] args) {
        try {
            
            // Open character stream files for end user input and output
            Main.inFile = new BufferedReader(new InputStreamReader(System.in));
            Main.outFile = new PrintWriter(System.out, true);
                        
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return;
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString() +
                    "\nCause: " + e.getCause() +
                    "\nMessage: " + e.getMessage());
        } finally {
            try {
                if (Main.inFile != null)
                    Main.inFile.close();
                
                if (Main.outFile != null)
                    Main.outFile.close();
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
        Main.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static UserModel getUser() {
        return user;
    }

    public static void setUser(UserModel user) {
        Main.user = user;
    }
    
    public static void setNumber(NumberModel number) {
        Main.number = number;
    }
}
