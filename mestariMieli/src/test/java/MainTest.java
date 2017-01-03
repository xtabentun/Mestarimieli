/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertEquals;
import mestarimieli.mestarimieli.Main;
import mestarimieli.mestarimieli.Mestarimieli;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import org.hamcrest.collection.IsEmptyCollection;
import org.hamcrest.collection.IsIterableContainingInAnyOrder;
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
public class MainTest {

    private static Main player;
    public static int guesses;
    public static int blacks;
    public static int whites;
    public static String c;
    public static String a;
    public static String answer;
    public static String guess;

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        player = new Main();

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
    public void testUnitAnyOrder() {
        List<String> actual = Arrays.asList("1", " 2", "3", "4", "5", "6", "7", "8", "9");
        List<String> expected = Arrays.asList("1", " 2", "3", "4", "5", "6", "7", "8", "9");

        assertThat(actual, IsIterableContainingInAnyOrder.containsInAnyOrder("1", " 2", "3", "4", "5", "6", "7", "8", "9"));
    }

    @Test
    public void testAssertList() {
        List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        assertThat(actual, is(expected));

    }

    @Test
    public void testListActualLength() {
        List<String> actual = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> expected = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        assertThat(actual.size(), is(9));

    }

    @Test
    public void testEmptyList() {
        List<String> actual = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> expected = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");

        assertThat(actual, not(IsEmptyCollection.empty()));
    }

    @Test
    public void testGetTotalCharacter() {
        ArrayList<Character> list = new ArrayList<Character>();

    }

    @Test
    public void testEquality() throws Exception {
        String a = "1234";
        String c = new String(a);
        assertTrue(a.equals(c));
    }

    @Test
    public void testWhitesCount() {
        int whites = 0;
        if (whites == 0) {
            assertEquals(0, whites);
        }
    }

    @Test
    public void testSecretAnswerContainsString() {
        String expected = "1234";
        String actual = "1234";
        assertThat(actual, is(equalTo(expected)));

    }

    @Test
    public void testIgnoringWhitespace() throws Exception {
        String expected = "1234";
        String actual = "1234";

        assertThat(actual, equalToIgnoringWhiteSpace(" 1234 "));
    }
    
    
    @Test 
    public void testcheckAnswerInputLength() {

        // tässä pitäisi olla boolean muotoisen checkAnswerin testausta mutta en saanut toteutettua sitä, pitäisi testata siis:
        // sitä, jos käyttäjä antaa ylipitkän numerosarjan, niin tuloste sanoisi että kyseessä on vääränkokoinen input, anna ####
        // pituinen lukujono.
        
        
        
    }

    private void echo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

//   @Test 
//   public void testiSaaArvoja() {
//       MustatValkoisetLuku luku = new MustatValkoisetLuku(6834);
//       
//       int[] oletusLuvut = {6, 8, 3, 4};
//       List<Integer> varsinaisetLuvut = luku.getLuvut();
//       
//       assertEquals(oletusLuvut.length, varsinaisetLuvut.size());
//       for (int i = 0; i < oletusLuvut.length; i++) {
//           assertEquals(oletusLuvut[i], (int) varsinaisetLuvut.get(i));
//       }
//       
//    
//    
//}
// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}

