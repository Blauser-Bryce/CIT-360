/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Bryce Blauser
 */

@Entity
@Table(name="assignments")
public class Assignments  {

    static Class Class;
    
    public Assignments() {
    
    }
    
    public Assignments(int idassignments, String AssignmentName, int AssignedTo)
    {
        super();
        this.idassignments = idassignments;
        this.AssignmentName = AssignmentName;
        this.AssignedTo = AssignedTo;
    }
    
    @Id
    @Column(name="idassignments")
    private int idassignments;

    @Column(name="AssignmentName")
    private String AssignmentName;
    
    @Column(name="AssignedTo")
    private int AssignedTo;
    
    public int getIdassignments() {
        return idassignments;
    }

    public void setIdassignments(int idassignments) {
        this.idassignments = idassignments;
    }

    public String getAssignmentName() {
        return AssignmentName;
    }

    public void setAssignmentName(String AssignmentName) {
        this.AssignmentName = AssignmentName;
    }

    public int getAssignedTo() {
        return AssignedTo;
    }

    public void setAssignedTo(int AssignedTo) {
        this.AssignedTo = AssignedTo;
    }
    
    @Override
    public String toString() {
        return "ID = " + idassignments + ", AssignmentName = " + AssignmentName + ", AssignedTo = " + AssignedTo;
    }
}
