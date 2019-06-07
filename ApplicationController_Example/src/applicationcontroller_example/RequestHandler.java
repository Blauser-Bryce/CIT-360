/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller_example;

import java.util.HashMap;

/**
 *
 * @author Bryce Blauser
 */
public class RequestHandler {
    
    public static HashMap<String, View> request = new HashMap<String, View>();
    
    public static View handleRequest(String selection) {
               
        request.put("N", new ViewGuess());
        request.put("X", new ViewMainMenu());
        
        return request.get(selection);
    }
}
