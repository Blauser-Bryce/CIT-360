/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading_example;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Bryce Blauser
 */
class SimpleTestAtomicInteger {
    
    private static AtomicInteger testInt;
    
    public int getValue() {
        if (testInt == null) {
            testInt = new AtomicInteger(0);
        }
        return testInt.get();
    }
    
    public void increment() {
        while(true) {
            int currentVal = getValue();
            int newVal = currentVal + 1;
            if (testInt.compareAndSet(currentVal, newVal)) {
                return;
            }
        }
    }

}
