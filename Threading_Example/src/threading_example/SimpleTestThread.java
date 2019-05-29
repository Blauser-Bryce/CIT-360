/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_example;

/**
 *
 * @author Bryce Blauser
 */
public class SimpleTestThread implements Runnable {
    
    private String command;
    private SimpleTestAtomicInteger inc = new SimpleTestAtomicInteger();
    
    public SimpleTestThread(String s) {
        this.command = s;
    }

    SimpleTestThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + command + " has started. ");
        processCommand();
    }
    
    private void processCommand() {
        try {
            for (int i = 1; i <= 5; i++){
                Thread.sleep(1000);
                inc.increment(); // Increment the Atomic Integer AV
                System.out.println(Thread.currentThread().getName() + ": " + command + " running " + i + " time(s).  AV = " + inc.getValue());
            }
            
            System.out.println(Thread.currentThread().getName() + ": " + command + " has ended.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return this.command;
    }
}
