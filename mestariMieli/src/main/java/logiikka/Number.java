/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author lea
 */
public class Number {
    
     private String answer;
    
    public Number() {
         answer = generate(shuffle("123456789"));
    }
    
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String num) {
        this.answer = num;
    }

    private String generate(String sh) {
        StringBuilder answ = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            answ.append(sh.charAt(i));
        }
        return answ.toString();

    }

    private String shuffle(String input) {
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

    public String checkAnswer(String guess) {

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
                return "You win teh game!";
            } else {
                return ("Blacks " + blacks + " Whites " + whites + "\n");
            }
//            echo("Bulls "+  bulls + " Cows " + cows + "\n");

        }
        return "Wrong length\n";

    }

}
