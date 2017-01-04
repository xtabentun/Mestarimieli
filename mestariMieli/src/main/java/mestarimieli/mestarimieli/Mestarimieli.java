/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package mestarimieli.mestarimieli;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/** Luokan metodit tuottavat pelin salatun, nelinumeroisen lukuarvon jota käyttäjä arvaa syötteellään. 
 * Luokan metodit arvioivat sen jälkeen kuinka osuva syöte on, tuottaen valkoisten ja mustien lukumäärät käyttäjälle.
 * Kun käyttäjä arvaa täsmälleen oikean lukuarvon, luokan metodit kertovat myös sen käyttäjälle.
 * 
 * @author lea
 */

public class Mestarimieli {

    String answer;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws Exception {
        answer = generate(shuffle("123456789"));

        int guesses = 0;
        String guess;

        while (true) {
            guesses++;
            echo(answer + "Type number: ");
            guess = input.readLine();

            checkAnswer(guesses, guess);
        }
    }

    /**
     * checkAnswer metodi ottaa parametreikseen guesses'n ja guess'n.
     * Metodi siis katsoo käyttäjän syöttämän veikkauksen numeroita ja lisää sen mukaan mustan jos oikea numero sijaitsee oikealla paikalla
     * ja valkoisen, jos oikea numero sijaitsee väärällä paikalla .
     *
     * @param guesses
     * @param guess
     * @return
     */
    public boolean checkAnswer(int guesses, String guess) {

        int blacks = 0, whites = 0;

        if (guess.length() == 4) {
            for (int i = 0; i <= 3; i++) {
                if (guess.charAt(i) == answer.charAt(i)) {
                    blacks++;
                } else if (answer.contains(guess.charAt(i) + "")) {
                    whites++;
                }
            }

            if (blacks == 4) {
                return true;
            } else {

                echo("Blacks " + blacks + " Whites " + whites + "\n");
            }
//            echo("Bulls "+  bulls + " Cows " + cows + "\n");

        }
        return false;

    }

    /** Metodi ottaa parametrikseen Stringin ja printtaa saman.
     * 
     * @param text 
     */
 
    
    public void echo(String text) {
        System.out.print(text);
    }
    
    /** Metodi kasvattaa vastausta nelinumeroiseksi asti ja palauttaa toStringin.
     * 
     * @param sh
     * @return 
     */
    

    public String generate(String sh) {
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            answ.append(sh.charAt(i));
        }
        return answ.toString();

    }
    
    /** Metodi tuottaa salatun lukuarvon, satunnaisen listan numeroista, siinä ei kuitenkaan toistu sama numero kahteen kertaan. 
     * 
     * @param input
     * @return 
     */

    public String shuffle(String input) {
        List<Character> characters = new ArrayList<Character>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while (characters.size() != 0) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();

    }

}
