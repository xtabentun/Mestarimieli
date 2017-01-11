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
import static org.junit.Assert.*;;
import org.junit.Assert;

/**
 *
 * @author lea
 */
public class NumberTest {

    Number n = new Number();
    String answer;

    public NumberTest() {
        n.setAnswer("1234");
        n.setAnswerLength(4);
        answer = n.getAnswer();

    }

    @Test
    public void testCreate() {
        assertEquals(n.getAnswer(), "1234");
        assertNotEquals(n.getAnswer(), "4567");

    }

    @Test
    public void testConstructor() {
        Assert.assertEquals(n.getAnswerLength(), 4);
        Assert.assertNotEquals(n.getAnswer().length(), 3);
    }

    @Test
    public void testCheckAnswer1() {
        int[] eka = {4, 0};
        Assert.assertArrayEquals(n.checkGuess("1234"), eka);
    }

    @Test
    public void testCheckAnswer2() {
        int[] toka = {2, 2};
        Assert.assertArrayEquals(n.checkGuess("2134"), toka);
    }

    @Test
    public void testCheckAnswer3() {
        int[] kolmas = {0, 4};
        Assert.assertArrayEquals(n.checkGuess("4321"), kolmas);
    }

    @Test
    public void testCheckAnswer4() {
        int[] neljas = {1, 3};
        Assert.assertArrayEquals(n.checkGuess("1423"), neljas);
    }

    @Test
    public void testGuessLengthRight() {
        String guess = "6789";
        Assert.assertTrue(n.checkGuessLength(guess));
    }

    @Test
    public void testGuessLengthFalse() {
        String guess1 = "23";
        String guess2 = "123456";

        Assert.assertFalse(n.checkGuessLength(guess1));
        Assert.assertFalse(n.checkGuessLength(guess2));
    }

    
   @Test
   public void testGenerateNumber() {
       n.generateAnswer();
       
       Assert.assertEquals(n.getAnswer().length(), 4);
       Assert.assertNotEquals(n.getAnswer(), 5);
       Assert.assertNotEquals(n.getAnswer(), 3);
   }
   
   
//    @Test
//    public void testCheckAnswer5() {
//        int[] viides = {0,0}
//    }
}
