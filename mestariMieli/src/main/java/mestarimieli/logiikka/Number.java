/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

import java.util.ArrayList;
import java.util.List;

/**
 * Luokka toteuttaa pelin oikean koodin generoinnin ja tarkistaa, onko käyttäjän
 * antama arvaus sama kuin oikea koodi.
 *
 * @author lea
 */
public class Number {

    private String answer;
    private int answerLength;

    /**
     * metodi generoi koodin luvut numeroiden 1 ja 9 väliltä.
     *
     * @param answerLength parametri on koodin pituuden lukuarvo.
     */
    public Number() {
        this.answerLength = 0;
        this.answer = null;
    }
    
    public Number(int n) {
        this.answerLength = n;
        this.answer = null;
    }
    
    public void setAnswerLength(int length) {
      this.answerLength = length;
    }
    
    public void generateAnswer() {
               answer = generate(this.answerLength, shuffle("123456789"));
               
    }

    public int getAnswerLength() {
        return answerLength;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String num) {
        this.answer = num;
    }

    /**
     *
     * @param answerLength kuvaa koodin pituutta.
     * @param sh apuparametri tuottaa uuden numeron koodiin siihen asti kunnes
     * koodi on answerLengthin pituinen.
     * @return palauttaa answ.toStringin.
     */
    private String generate(int answerLength, String sh) {
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i <= answerLength - 1; i++) {
            answ.append(sh.charAt(i));
        }
        return answ.toString();

    }

    /**
     * Metodi ottaa parametrikseen String muotoisen inputin, ja lisää sellaisen
     * characters listaan.
     *
     * @param input parametri shuffle metodille
     * @return Palauttaa outputin toStringinä.
     */
    private String shuffle(String input) {
        List<Character> characters = new ArrayList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }

        StringBuilder output = new StringBuilder(input.length());
        while (!characters.isEmpty()) {
            int randPicker = (int) (Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();

    }

    /**
     * Metodi tarkistaa, kuinka monta täysin oikeaa (musta) ja melkein oikeaa
     * (valkoinen) numeroa käyttäjä syöttää koodiin.
     *
     * @param guess String muotoinen parametri on käyttäjän arvaus.
     * @return palauttaa int[] nimisen taulukon mustia ja valkoisia.
     */
    public int[] checkGuess(String guess) {
        int blacks = 0, whites = 0;

        for (int i = 0; i <= answerLength - 1; i++) {
            if (guess.charAt(i) == answer.charAt(i)) {
                blacks++;
            } else if (answer.contains(guess.charAt(i) + "")) {
                whites++;
            }
        }
        return new int[]{blacks, whites};
    }

    /**
     * Boolean metodi tarkistaa arvauksen pituuden.
     *
     * @param guess Käyttäjän arvaus parametrina.
     * @return palauttaa pituuden, mikäli se on yhtäsuuri arvauksen ja oikean
     * koodin välillä.
     */
    public boolean checkGuessLength(String guess) {
        return guess.length() == answerLength;
    }

}
