/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class Test1Test {
    private Collection c = new HashSet();
    /**
     * Test of main method, of class Test1.
     */
   
    
    @Test
    public void testColectionHashCodeContract() {
        Collection c1 = new ArrayList();        
        Collection c2 = new HashSet();
        
        
        Assume.assumeTrue(c1.equals(c2));
        Assert.assertTrue(c1.hashCode() == c2.hashCode());
        
    }

    @Test
    public void testAdd() {
        //GIVEN
        int initialSize = c.size();
        //WHEN
        c.add(new Object());
        //THEN
        Assert.assertThat(c.size(), is(initialSize + 1));
    }
    
    @Test
    public void testThatClearCollectionIsEmpty() {
        //WHEN
        c.clear();
        //THEN
        Assert.assertTrue(c.isEmpty());
    }
    
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfSize() {
        ArrayList a = new ArrayList();
        a.add(new Object());       
        a.get(5);
        
    }
    
    
    @Test
    public void testThatSumWorksForNegativeValues(){
        Calculator calc = new Calculator();
        int result = calc.sum(-2, -4);
        
        Assert.assertThat(result, is(-6));
    }
    
    @Test
    public void testThatSumWorksForPositiveValues(){
        Calculator calc = new Calculator();
        int result = calc.sum(2, 4);
        
        Assert.assertThat(result, is(6));
    }
}
