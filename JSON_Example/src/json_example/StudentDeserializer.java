/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

import java.lang.reflect.Type;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

/**
 *
 * @author Bryce Blauser
 */

public class StudentDeserializer implements JsonDeserializer<Student> {

  @Override
  public Student deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {
  
    //deserialisation code 
    final JsonObject jsonObject = json.getAsJsonObject();

    final Assignment[] assignments = context.deserialize(jsonObject.get("assignments"), Assignment[].class);
        
    final Student student = new Student();
    student.setFirstName(jsonObject.get("firstname").getAsString());
    student.setLastName(jsonObject.get("lastname").getAsString());
    student.setAssignments(assignments);
    
    return student;
  }
}
