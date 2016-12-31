/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.mestarimieli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*Mestarimieli-peli, jonka toteutus toimii numeropohjaisena: käyttäjä arvaa
nelikirjaimisen jonon, joka muodostuu numeroista 123456789, 0 ei ole käytössä. Koodipalloja ovat tässä siis numerot 1-9 ja avainpalloja mustat ja valkoiset: e.g. blacks ja whites. 

 */
/**
 *
 * @author lzkosone
 */
public class Main {

//    static int blacks, whites, guesses;
//    static String answer, guess;
//    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        
        Mestarimieli m = new  Mestarimieli();
        
        m.run();
        
    }
//        answer = generate(shuffle("123456789"));
//        while (true) {
//
//            guesses++;
//            echo(answer + "Type number: ");
//            guess = input.readLine();
//
//            if (guess.length() == 4) {
//                for (int i = 0; i <= 3; i++) {
//                    if (guess.charAt(i) == answer.charAt(i)) {
//                        blacks++;
//                    } else if (answer.contains(guess.charAt(i) + "")) {
//                        whites++;
//                    }
//                }
//
//                if (blacks == 4) {
//                    echo("You win in " + guesses + " attempts" + "\n");
//                } else {
//                    echo("Blacks " + blacks + " Whites " + whites + "\n");
//                }
////            echo("Bulls "+  bulls + " Cows " + cows + "\n");
//                blacks = 0;
//                whites = 0;
//            } else {
//                echo("#### number format!");
//            }
//        }
//    }

//    public static void echo(String text) {
//        System.out.print(text);
//    }
//
//    public static String generate(String sh) {
//        StringBuilder answ = new StringBuilder();
//        for (int i = 0; i <= 3; i++) {
//            answ.append(sh.charAt(i));
//        }
//        return answ.toString();
//
//    }
//
//    public static String shuffle(String input) {
//        List<Character> characters = new ArrayList<Character>();
//        for (char c : input.toCharArray()) {
//            characters.add(c);
//        }
//        StringBuilder output = new StringBuilder(input.length());
//        while (characters.size() != 0) {
//            int randPicker = (int) (Math.random() * characters.size());
//            output.append(characters.remove(randPicker));
//        }
//        return output.toString();
//
//    }

}
