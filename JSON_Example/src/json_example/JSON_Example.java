/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.quickconnect.json.JSONException;
import org.quickconnect.json.JSONInputStream;
import org.quickconnect.json.JSONOutputStream;
import org.quickconnect.json.JSONUtilities;

/**
 *
 * @author Bryce Blauser
 */

public class JSON_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("JSON Example");
        
        try {            
////// ----------------------------------------------------------------------------------------------- /////
//////  QCJSON example
////// ----------------------------------------------------------------------------------------------- /////
            FileOutputStream fout = new FileOutputStream("Files\\JSON_OUT.txt");
            FileInputStream fin = new FileInputStream("Files\\JSON_IN.txt");

            JSONOutputStream jsonOut = new JSONOutputStream(fout);
            JSONInputStream jsonIn = new JSONInputStream(fin);            
            
            // Read the file in
            HashMap parsedJSONMap = (HashMap) jsonIn.readObject();
            
            // Loop through the map and check values
            Iterator hmIterator = parsedJSONMap.entrySet().iterator();
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
            }
            
            QCJSONObject readObject = new QCJSONObject(parsedJSONMap);

            String jsonString = JSONUtilities.stringify(readObject);
            System.out.println("JSON IN: "+jsonString);
            
            Date exampleDate = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

            Map<String, String> map = new HashMap<>();
            map.put("name", "Test McTesterson");
            map.put("age","0");
            map.put("birthdate",  dateFormat.format(exampleDate));
            
            jsonOut.writeObject((Serializable) map);

            jsonString = JSONUtilities.stringify((Serializable) map);
            System.out.println("JSON OUT: " + jsonString);
                                    
////// ----------------------------------------------------------------------------------------------- /////
//////  Gson example
////// ----------------------------------------------------------------------------------------------- /////

            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Student.class, new StudentDeserializer());
            gsonBuilder.registerTypeAdapter(Assignment.class, new AssignmentDeserializer());
            Gson gson = gsonBuilder.create();
            
            // Read in JSON data from file
            try(Reader reader = new InputStreamReader(new FileInputStream("Files\\group_in.json"), "UTF-8")) {
                final Group json_group = gson.fromJson(reader, Group.class);
                System.out.println(json_group.toString());
                
                // Ouptut a new file                                            
                try (FileWriter gson_fout = new FileWriter("Files\\group_out.json")) {
                    String json_assignments = new Gson().toJson(json_group.getAssignments());
                    String json_students = new Gson().toJson(json_group.getStudents());
                    gson_fout.write("{'assignments': " + json_assignments + ", 'students': " + json_students + "}");
                    System.out.println(json_assignments + ',' + json_students);
                    gson_fout.close();
                } 
               
            } catch (Exception e) {
                System.out.println("Exception class: " + e.getClass() + " - " + e.getMessage());
            }            
            
        } catch (JSONException e) { 
                // TODO Auto-generated catch block
                e.printStackTrace();
        } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

    }
    
}
