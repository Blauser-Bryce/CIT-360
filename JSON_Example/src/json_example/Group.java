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
public class Group {
    
    private Student[] students;
    private Assignment[] assignments;

    public Student[] getStudents() {
        return students;
    }

    public Assignment[] getAssignments() {
        return assignments;
    }
    
    @Override
    public String toString() {
      final StringBuilder formatted = new StringBuilder();
      formatted.append("Assignments: ");
      for (final Assignment assignment : assignments) {
        formatted.append("\n").append(assignment);
      }

      formatted.append("\n\nStudents");
      for (final Student student : students) {
        formatted.append("\n").append(student);
      }
      return formatted.toString();
    }
    
}
