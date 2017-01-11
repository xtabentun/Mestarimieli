/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

//import junit.framework.Assert;
import java.util.ArrayList;
import java.util.List;
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
    
    Player testPlayer = new Player();
    
 
    
    public PlayerTest() {
    }
    
    @Test
    public void testConstructor() {
        testPlayer.setName("Testaaja");
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
    
    @Test
    public void testGuessList() {
        String g1 = "6789";
        String g2 = "3456";
        String g3 = "1234";
        
        testPlayer.updateGuessList(g1);
        testPlayer.updateGuessList(g2);
        testPlayer.updateGuessList(g3);
        
        Assert.assertEquals(3, testPlayer.getGuessList().size());
        Assert.assertEquals(testPlayer.getGuessList().get(0), "6789");
        Assert.assertNotEquals(testPlayer.getGuessList().get(1), "3256");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
