/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.List;

/**
 * Luokan metodit tuottavat pelin salatun, nelinumeroisen lukuarvon jota
 * käyttäjä arvaa syötteellään. Luokan metodit arvioivat sen jälkeen kuinka
 * osuva syöte on, tuottaen valkoisten ja mustien lukumäärät käyttäjälle. Kun
 * käyttäjä arvaa täsmälleen oikean lukuarvon, luokan metodit kertovat myös sen
 * käyttäjälle.
 *
 * @author lea
 */
public class Mestarimieli {

    String answer;
//    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//    int guesses = 0;
//
//    public void run() throws Exception {
//
//        String guess;
//        String retval;
//
//        while (true) {
//            guesses++;
//            echo(answer + "Type number: ");
//            echo( guesses + ": ");
//            guess = input.readLine();
//
//            retval = checkAnswer( guess);
//            echo(retval);
//            if ("You win teh game!".equals(retval)) {
//                exit(0);
//            }
//        }
//    }

    
    
    /**
     * checkAnswer metodi ottaa parametreikseen guesses'n ja guess'n. Metodi
     * siis katsoo käyttäjän syöttämän veikkauksen numeroita ja lisää sen mukaan
     * mustan jos oikea numero sijaitsee oikealla paikalla ja valkoisen, jos
     * oikea numero sijaitsee väärällä paikalla .
     *
     * @param guesses int muotoinen parametri
     * @param guess String muotoinen parametri 
     * @return Palauttaa lukijalle viestin hänen arvatessaan koodin oikein tai ilmoittaa väärästä pituudesta mikäli antaa väärän pituisen merkkijonon.
     */
//    public String checkAnswer( String guess) {
//
//        int blacks = 0, whites = 0;
//
//        if (guess.length() == 4) {
//            for (int i = 0; i <= 3; i++) {
//                if (guess.charAt(i) == answer.charAt(i)) {
//                    blacks++;
//                } else if (answer.contains(guess.charAt(i) + "")) {
//                    whites++;
//                }
//            }
//
//            if (blacks == 4) {
//                return "You win teh game!";
//            } else {
//                return ("Blacks " + blacks + " Whites " + whites + "\n");
//            }
////            echo("Bulls "+  bulls + " Cows " + cows + "\n");
//
//        }
//        return "Wrong length\n";
//
//    }

    /**
     * Metodi ottaa parametrikseen Stringin ja printtaa saman.
     *
     * @param text String muotoinen parametri echo-metodille, joka printtaa kyseisen parametrin.
     */
//    public void echo(String text) {
//        System.out.print(text);
//    }

    /**
     * Metodi kasvattaa vastausta nelinumeroiseksi asti ja palauttaa toStringin.
     *
     * @param sh parametri, jota käytetään hyödyksi luotaessa answ-nimistä StringBuilderia.
     * @return palauttaa toStringinä answ-StringBuilderin.
     */
//    public String generate(String sh) {
//        StringBuilder answ = new StringBuilder();
//        for (int i = 0; i <= 3; i++) {
//            answ.append(sh.charAt(i));
//        }
//        return answ.toString();
//
//    }

    /**
     * Metodi tuottaa salatun lukuarvon, satunnaisen listan numeroista, siinä ei
     * kuitenkaan toistu sama numero kahteen kertaan.
     *
     * @param input parametria käytetään characters nimisen listan luontiin.
     * @return Palauttaa outputin toStringninä.
     */
//    public String shuffle(String input) {
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
