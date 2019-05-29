/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Bryce Blauser
 */
public class Threading_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleTestAtomicInteger inc = new SimpleTestAtomicInteger();
        
        // Creating individual threads
        SimpleTestThread testThread = new SimpleTestThread("Individual thread");
        // 5 times 5 = 25.. AV = Atomic Value
        Thread thread1 = new Thread(testThread);
        thread1.start();
        Thread thread2 = new Thread(testThread);
        thread2.start();
        Thread thread3 = new Thread(testThread);
        thread3.start();
        Thread thread4 = new Thread(testThread);
        thread4.start();
        Thread thread5 = new Thread(testThread);
        thread5.start();

        // Using Executor service to use thread pools 3 at a time
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // 5 times 5 = 25
        for (int i = 0; i < 5; i++) {
            Runnable runnable = new SimpleTestThread("Command " + i);
            executor.execute(runnable);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {}
        // AtomicInteger AV should = 50 when finished
        System.out.println("Processing complete.  AV = " + inc.getValue());
    }
    
}
