package mestarimieli.mestarimieli;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static jdk.nashorn.tools.ShellFunctions.input;
import junit.framework.Assert;
import mestarimieli.mestarimieli.Mestarimieli;
import mestarimieli.mestarimieli.Mestarimieli;
import mestarimieli.mestarimieli.Mestarimieli;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.notification.Failure;

/**
 *
 * @author lea
 */
public class MestarimieliTest {

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
    public void testCheckAnswerInput() throws IOException {
        Mestarimieli n = new Mestarimieli();
        int guesses = 0;
        int blacks = 0;
        int whites = 0;

        assertTrue((n.checkAnswer(6, "123456")).equals("Wrong length\n"));
        int i;

    }

    @Test
    public void testIfEquality() throws Exception {
        String guess = "1234";
        String answer = "1234";
        int i=0;
       
       if (guess.charAt(i) == answer.charAt(i)) {
//        assertTrue(guess.equals(answer));
//        assertFalse(guess == answer);
        Assert.assertEquals(guess, answer);
        
       
        
    } 
    }     
//    public class StringEqualityTest extends TestCase {
//    public void testEquality() throws Exception {
//        String a = "abcde";
//        String b = new String(a);
//        assertTrue(a.equals(b));
//        assertFalse(a == b);
//        assertEquals(a, b);
//    }
/*}*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
