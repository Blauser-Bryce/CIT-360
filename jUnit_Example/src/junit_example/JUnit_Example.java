/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_example;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bryce Blauser
 */
public class JUnit_Example {
    
    String testString = "This is a test string!";
    String testNull = null;
    String[] testStrArr = {"one","two","three","four","five"};
    Boolean testBoolf = false;
    Boolean testBoolt = true;
    Integer testInt1 = 5;
    Integer testInt2 = 10;
    Map<Integer, String> testMap = new HashMap<>();

    public static void main(String[] args) {
        
    }
    
    public Integer addInts() {
        return testInt1 + testInt2;
    }
    
    public String getTestString() {
        return testString;
    }

    public String getTestNull() {
        return testNull;
    }

    public String[] getTestStrArr() {
        return testStrArr;
    }

    public Boolean getTestBoolf() {
        return testBoolf;
    }

    public Boolean getTestBoolt() {
        return testBoolt;
    } 

    public Integer getTestInt1() {
        return testInt1;
    }

    public Integer getTestInt2() {
        return testInt2;
    }

    public Map<Integer, String> getTestMap() {
        testMap.put(1, "One");
        testMap.put(2, "Two");
        testMap.put(3, "Three");
        testMap.put(4, "Four");
        testMap.put(5, "Five");
        return testMap;
    }

}
