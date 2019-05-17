/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json_example;

/**
 *
 * @author Bryce Blauser
 */
public class Student {
    
    private Assignment[] assignments;
    private String firstName;
    private String lastName;
    
    public Assignment[] getAssignments() {
        return assignments;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAssignments(final Assignment[] assignments) {
        this.assignments = assignments;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }
    
    @Override
    public String toString() {
      final StringBuilder formatted = new StringBuilder();
      formatted.append(firstName);
      formatted.append(" ").append(lastName).append("\nAssignments:");
      for (final Assignment assignment : assignments) {
        formatted.append("\n  >> ").append(assignment);
      }
      return formatted.toString();
    }   
}
