package mestarimieli.logiikka;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import logiikka.Number;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

/**
 *
 * @author lea
 */
public class NumberTest {
    Number n = new Number(4);
    String answer;

  
    
    
    public NumberTest() {
        n.setAnswer("1234");
        
        answer = n.getAnswer();
        
    }
    
@Test
public void testCreate() {
    assertEquals(n.getAnswer(), "1234");
    assertNotEquals(n.getAnswer(), "4567");
    
}

  @Test
public void testConstructor() {
   Assert.assertEquals(n.getAnswer().length(), 4);
   Assert.assertNotEquals(n.getAnswer().length(), 3);
}
    
    
    
}
