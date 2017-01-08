/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lea
 */
public class Number {

    private String answer;
    private final int answerLength;

    public Number(int answerLength) {
        this.answerLength = answerLength;
        answer = generate(this.answerLength, shuffle("123456789"));

    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String num) {
        this.answer = num;
    }

    private String generate(int answerLength, String sh) {
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i <= answerLength - 1; i++) {
            answ.append(sh.charAt(i));
        }
        return answ.toString();

    }

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

    public boolean checkGuessLength(String guess) {
        return guess.length() == answerLength;
    }

}
