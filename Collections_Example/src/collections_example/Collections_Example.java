/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Bryce Blauser
 */
public class Collections_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Array List Example --------------------------------------------------
        System.out.println("-= Array List Example =-");
        List<String> assignmentList = new ArrayList<>();
        
        assignmentList.add(0,"Java Collections");
        assignmentList.add(1,"Threads, Executor, and Runnables");
        assignmentList.add(2,"MVC Architecture");
        assignmentList.add(3,"Application Controller Pattern");
        assignmentList.add(4,"Hibernate");
        assignmentList.add(5,"QCJSON / JSON");
        assignmentList.add(6,"Android HttpUrlConnection");
        assignmentList.add(7,"Servlets");
        assignmentList.add(8,"JUnit Tests");
        assignmentList.add(9,"System Level Tests");
        assignmentList.add(10,"Use Case Diagrams");
        assignmentList.add(11,"Use Case Documents");
        assignmentList.add(12,"State Diagrams");
        assignmentList.add(13,"Sequence Diagrams");
        
        System.out.println("All Assignments: " + assignmentList);
        
        System.out.println("Remove completed assignments");
        assignmentList.remove(0);
        assignmentList.remove(1);
        assignmentList.remove(2);
        assignmentList.remove(3);
        assignmentList.remove(4);
        assignmentList.remove(5);
        
        System.out.println("Remaining Assignments: " + assignmentList);
        
        // HashSet Example -----------------------------------------------------
        System.out.println("-= HashSet Example =-");
        Set<String> remainingHash = new HashSet<>();
        
        remainingHash.add("MVC Architecture");
        remainingHash.add("Android HttpUrlConnection");
        remainingHash.add("Servlets");
        remainingHash.add("JUnit Tests");
        remainingHash.add("System Level Tests");
        remainingHash.add("Use Case Diagrams");
        remainingHash.add("Use Case Documents");
        remainingHash.add("State Diagrams");
        remainingHash.add("Sequence Diagrams");
        
        System.out.println("Remaining Assignments: " + remainingHash);
        
        Set<String> completedHash = new HashSet<>();
        completedHash.add("Java Collections");
        completedHash.add("Threads, Executor, and Runnables");
        completedHash.add("Application Controller Pattern");
        completedHash.add("Hibernate");
        completedHash.add("QCJSON / JSON");
        
        System.out.println("Completed Assignments: " + completedHash);
        
        // Combining Hashes
        Set<String> assignmentHash = new HashSet<>(remainingHash);
        assignmentHash.addAll(completedHash);
        
        System.out.println("All Assignments: " + assignmentHash);
        
        Set<String> myAssignmentHash = new HashSet<>();
        myAssignmentHash.add("MVC Architecture");
        myAssignmentHash.add("QCJSON / JSON");
        
        System.out.println("My Assignments: " + myAssignmentHash);
        
        // Do I have any remaining assignments?
        Set<String> myRemainingHash = new HashSet<>(remainingHash);
        myRemainingHash.retainAll(myAssignmentHash);
        
        System.out.println("My Remaining Assignments: " + myRemainingHash);
        
        // Which have I completed?
        Set<String> myCompletedHash = new HashSet<>(completedHash);
        myCompletedHash.retainAll(myAssignmentHash);
        
        System.out.println("My Completed Assignments: " + myCompletedHash);
        
        // Map Example ---------------------------------------------------------
        System.out.println("-= Map Example =-");
        Map<Integer, String> assignmentMap = new HashMap<>();
        
        assignmentMap.put(1,"Java Collections");
        assignmentMap.put(2,"Threads, Executor, and Runnables");
        assignmentMap.put(3,"MVC Architecture");
        assignmentMap.put(4,"Application Controller Pattern");
        assignmentMap.put(5,"Hibernate");
        assignmentMap.put(6,"QCJSON / JSON");
        assignmentMap.put(7,"Android HttpUrlConnection");
        assignmentMap.put(8,"Servlets");
        assignmentMap.put(9,"JUnit Tests");
        assignmentMap.put(10,"System Level Tests");
        assignmentMap.put(11,"Use Case Diagrams");
        assignmentMap.put(12,"Use Case Documents");
        assignmentMap.put(13,"State Diagrams");
        assignmentMap.put(14,"Sequence Diagrams");
        
        // Print key and value pairs (loop through each pair)
        System.out.println("All Assignments (key | value): ");        
        assignmentMap.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        });
        
        // Remove completed assignments
        assignmentMap.remove(1);
        assignmentMap.remove(2);
        assignmentMap.remove(3);
        assignmentMap.remove(4);
        
        // Print remaining values (print entire list as string)
        System.out.println("Remaining Assignments (values): " + assignmentMap.values());
        
        // Queue Example -------------------------------------------------------
        System.out.println("-= Queue Example =-");
        Queue<String> assignmentQueue = new LinkedList<>();
        
        assignmentQueue.add("1. Java Collections");
        assignmentQueue.add("2. Threads, Executor, and Runnables");
        assignmentQueue.add("3. MVC Architecture");
        assignmentQueue.add("4. Application Controller Pattern");
        assignmentQueue.add("5. Hibernate");
        assignmentQueue.add("6. QCJSON / JSON");
        assignmentQueue.add("7. Android HttpUrlConnection");
        assignmentQueue.add("8. Servlets");
        assignmentQueue.add("9. JUnit Tests");
        assignmentQueue.add("10.System Level Tests");
        assignmentQueue.add("11.Use Case Diagrams");
        assignmentQueue.add("12.Use Case Documents");
        assignmentQueue.add("13.State Diagrams");
        assignmentQueue.add("14.Sequence Diagrams");       
        
        // Show first assignment
        System.out.println("First Assignment: " + assignmentQueue.peek());  
        
        // Show all assignments
        System.out.println("All Assignments (" + assignmentQueue.size() + "): " + assignmentQueue);      
        
        // Remove completed items from the queue (first in, first out)
        assignmentQueue.remove();
        assignmentQueue.remove();
        assignmentQueue.remove();
        assignmentQueue.remove();
        
        System.out.println("Remaining Assignments (" + assignmentQueue.size() + "): " + assignmentQueue); 
             
        // Add assignments back (to the end of the queue)
        assignmentQueue.add("1. Java Collections");
        assignmentQueue.add("2. Threads, Executor, and Runnables");
        assignmentQueue.add("3. MVC Architecture");
        assignmentQueue.add("4. Application Controller Pattern");
        
        // Show all assignments with new order
        System.out.println("All Assignments (" + assignmentQueue.size() + "): " + assignmentQueue); 
        
        // Tree Example --------------------------------------------------------
        System.out.println("-= Tree Example =-");
        TreeMap<Integer, String> assignmentTree = new TreeMap<>();
        
        // Put in random order - will always sort
        assignmentTree.put(12, "Use Case Documents");
        assignmentTree.put(13, "State Diagrams");
        assignmentTree.put(3, "MVC Architecture");
        assignmentTree.put(4, "Application Controller Pattern");
        assignmentTree.put(7, "Android HttpUrlConnection");
        assignmentTree.put(8, "Servlets");
        assignmentTree.put(1, "Java Collections");
        assignmentTree.put(2, "Threads, Executor, and Runnables");
        assignmentTree.put(9, "JUnit Tests");
        assignmentTree.put(10, "System Level Tests");
        assignmentTree.put(11, "Use Case Diagrams");
        assignmentTree.put(14, "Sequence Diagrams");  
        assignmentTree.put(5, "Hibernate");
        assignmentTree.put(6, "QCJSON / JSON");
        
        // Show first assignment
        System.out.println("First Assignment: " + assignmentTree.ceilingEntry(1)) ;  
        // Show last assignment
        System.out.println("Last Assignment: " + assignmentTree.ceilingEntry(assignmentTree.size())) ;  
        
        // Show assignments (in order)
        System.out.println("All Assignments (" + assignmentTree.size() + "): " + assignmentTree);  
        
        // Remove completed items from the tree (first 4 items)
        assignmentTree.remove(1);
        assignmentTree.remove(2);
        assignmentTree.remove(3);
        assignmentTree.remove(4);
        
        // Show assignments (in order)
        System.out.println("All Assignments (" + assignmentTree.size() + "): " + assignmentTree);  
        
        // Add completed assignments back at the end
        assignmentTree.put(15, "Java Collections");
        assignmentTree.put(16, "Threads, Executor, and Runnables");
        assignmentTree.put(17, "MVC Architecture");
        assignmentTree.put(18, "Application Controller Pattern");
        
        // Show assignments (in order)
        System.out.println("All Assignments (" + assignmentTree.size() + "): " + assignmentTree);  
        
    }
    
}
