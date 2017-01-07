package mestarimieli.mestarimieli;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import logiikka.Mestarimieli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lea
 */
public class MestarimieliTest {
    
      Mestarimieli m = new Mestarimieli();
      int vastaus = 
    
    public MestarimieliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
        @Test 
    public void testCheckAnswerInput() {
       Mestarimieli n = new Mestarimieli();
       
       assertTrue((n.checkAnswer(6, "123456")).equals("Wrong length\n"));
    }
    
    @Test
    public void testCheckFalse() {
        
        String a;
        String b;
        
        
       assertFalse((m.checkAnswer(3, "123")).equals("Wrong length\n"));
       
    }
    
    
    
    
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
