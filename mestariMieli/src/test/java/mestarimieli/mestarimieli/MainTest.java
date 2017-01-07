package mestarimieli.mestarimieli;



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
   public void testGenerateInput() {
       Mestarimieli n = new Mestarimieli();
       
       assertEquals(n.generate("1234"), "1234");
       
       
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

