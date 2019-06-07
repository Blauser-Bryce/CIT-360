/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_example;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Bryce Blauser
 */
public class JUnit_ExampleTest {
    
    public JUnit_ExampleTest() {
    }

    /**
     * assertArrayEquals example
     * Test of getTestStrArr method, of class JUnit_Example.
     */
    @Test
    public void testAssertArrayEquals() {
        System.out.println("assertArrayEquals example");
        JUnit_Example instance = new JUnit_Example();
        String[] expResult = {"one","two","three","four","five"};
        String[] result = instance.getTestStrArr();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * assertEquals example
     * Test of addInts method, of class JUnit_Example.
     */
    @Test
    public void testAssertEquals() {
        System.out.println("assertEquals example");
        JUnit_Example instance = new JUnit_Example();
        Integer expResult = 15;
        Integer result = instance.addInts();
        assertEquals(expResult, result);
    }

    /**
     * assertFalse example
     * Test of getTestBoolf method, of class JUnit_Example.
     */
    @Test
    public void testAssertFalse() {
        System.out.println("assertFalse example");
        JUnit_Example instance = new JUnit_Example();
        Boolean result = instance.getTestBoolf();
        assertFalse(result);
    }
    
    /**
     * assertTrue example
     * Test of getTestBoolf method, of class JUnit_Example.
     */
    @Test
    public void testAssertTrue() {
        System.out.println("assertTrue example");
        JUnit_Example instance = new JUnit_Example();
        Boolean result = instance.getTestBoolt();
        assertTrue(result);
    }    
    
    /**
     * assertNotNull example
     * Test of getTestString method, of class JUnit_Example.
     */
    @Test
    public void testAssertNotNull() {
        System.out.println("assertNotNull example");
        JUnit_Example instance = new JUnit_Example();
        String result = instance.getTestString();
        assertNotNull(result);
    }

    /**
     * assertNotSame example
     * Test of getTestMap method, of class JUnit_Example.
     */
    @Test
    public void testAssertNotSame() {
        System.out.println("assertNotSame example");
        JUnit_Example instance = new JUnit_Example();
        // Create a map and add expected results
        // It doesn't really matter what it contains, as long as the objects are not the same
        Map<Integer, String> expResult = new HashMap<>();
        expResult.put(1, "One");
        expResult.put(2, "Two");
        expResult.put(3, "Three");
        expResult.put(4, "Four");
        expResult.put(5, "Five");
        Map<Integer, String> result = instance.getTestMap();
        assertNotSame(expResult, result);
    }
    
    /**
     * assertSame example
     * Test of getTestMap method, of class JUnit_Example.
     */
    @Test
    public void testAssertSame() {
        System.out.println("assertSame example");
        JUnit_Example instance = new JUnit_Example();
        // Create another instance of the same map
        Map<Integer, String> expResult = instance.getTestMap();
        Map<Integer, String> result = instance.getTestMap();
        assertSame(expResult, result);
    }
    
    /**
     * assertNull example
     * Test of getTestString method, of class JUnit_Example.
     */
    @Test
    public void testAssertNull() {
        System.out.println("assertNull example");
        JUnit_Example instance = new JUnit_Example();
        String result = instance.getTestNull();
        assertNull(result);
    }
    
   /**
     * assertThat example
     */
    @Test
    public void testAssertThat() {
        System.out.println("assertThat example");
        JUnit_Example instance = new JUnit_Example();
        
        String resultNull = instance.getTestNull();
        String resultString = instance.getTestString();
        Map<Integer, String> resultMap = instance.getTestMap();
        String[] resultArray = instance.getTestStrArr();
        
        assertThat(resultString, isA(String.class));
        assertThat(resultMap.get(2), is("Two"));
        assertThat(resultNull, is(nullValue()));
        assertThat(resultString, notNullValue());
        assertThat(resultMap.get(3), sameInstance("Three"));
        assertThat(resultArray[2], is(anyOf(instanceOf(String.class), notNullValue(), is("five"))));
    } 
    
    


    
}
