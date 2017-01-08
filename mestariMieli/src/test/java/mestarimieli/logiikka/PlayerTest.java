/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

//import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lea
 */
public class PlayerTest {
    
    Player testPlayer = new Player("Testaaja");
 
    
    public PlayerTest() {
    }
    
    @Test
    public void testConstructor() {
       Assert.assertEquals(testPlayer.getName(), "Testaaja");
    }
    
    @Test
    public void testGuesses() {
        testPlayer.guessesGrow();
        Assert.assertEquals(testPlayer.getGuesses(), 1);
    }
    
    @Test
    public void testGuessesFail() {
        testPlayer.guessesGrow();
        Assert.assertNotEquals(testPlayer.getGuesses(), 2);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
