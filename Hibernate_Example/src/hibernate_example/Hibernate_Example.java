/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_example;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Bryce Blauser
 */
public class Hibernate_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Assignments.class)
        .buildSessionFactory();
                    
        try {
            Session session = factory.getCurrentSession();

            try {
                session.beginTransaction();

                // Create a new test assignment
                Assignments assignment = new Assignments(15, "Test Assignment", 1);
                session.save(assignment);

                // List all assignments assigned to ID 1 (Bryce Blauser)
                @SuppressWarnings("unchecked")
                List<Assignments> matches;
                matches = session
                        .createQuery("from Assignments a where a.AssignedTo=1")
                        .getResultList();

                // Print out the list
                matches.forEach((a) -> {
                    System.out.println(a.toString());
                });

                // Delete the newly added test assignment
                matches = session
                        .createQuery("from Assignments a where a.idassignments=15")
                        .getResultList();
                matches.forEach((a) -> {
                    session.delete(a);
                });
                
                // Commit the transactions
                session.getTransaction().commit();

            } finally { factory.close(); }
        } catch (HibernateException e) {
            if (factory != null) {
                factory.close();
            }
            e.printStackTrace();
        }
        
    }
    
}
