/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

/**
 *
 * @author Bryce Blauser
 */

public class AssignmentDeserializer implements JsonDeserializer<Assignment> {
     private final ThreadLocal<Map<Integer, Assignment>> cache = new ThreadLocal<Map<Integer, Assignment>>() {
    @Override
    protected Map<Integer, Assignment> initialValue() {
      return new HashMap<>();
    }
  };

  @Override
  public Assignment deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context)
      throws JsonParseException {

    // Only the ID is available
    if (json.isJsonPrimitive()) {
      final JsonPrimitive primitive = json.getAsJsonPrimitive();
      return getOrCreate(primitive.getAsInt());
    } 

    // The whole object is available
    if (json.isJsonObject()) {
      final JsonObject jsonObject = json.getAsJsonObject();

      final Assignment assignment = getOrCreate(jsonObject.get("id").getAsInt());
      assignment.setName(jsonObject.get("name").getAsString());
      return assignment;
    }

    throw new JsonParseException("Unexpected JSON type: " + json.getClass().getSimpleName());
  }

  private Assignment getOrCreate(final Integer id) {
    Assignment assignment = cache.get().get(id);
    if (assignment == null) {
      assignment = new Assignment();
      assignment.setId(id);
      cache.get().put(id, assignment);
    }
    return assignment;
  } 
}
