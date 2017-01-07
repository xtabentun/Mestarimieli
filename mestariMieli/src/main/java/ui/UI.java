/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import logiikka.Number;
import logiikka.Player;

/**
 *
 * @author lea
 */
public class UI {

    public void echo(String text) {
        System.out.print(text);
    }

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  

    public void run() throws Exception {

        echo("Who are you? ");
        String name = input.readLine();
        
        Player player = new Player(name);
        
        echo(name + ", how long will be your quest? ");
        String x =  input.readLine();
        int answerLength = Integer.parseInt(x);
        
        Number number = new Number(answerLength) {
        };

        String answer = number.getAnswer();
        String guess;
        int[] retval;

        while (true) {
            player.guessesGrow();
            echo(answer + "Type number: ");
            
            guess = input.readLine();

            if ( answerLength != guess.length()) {
                echo("Wrong length\n");
                continue;
            } 

            retval = number.checkAnswer(guess);
            int blacks = retval[0];
            int whites = retval[1];
//            echo("Blacks " + blacks + " Whites " + whites + "\n");
            if (blacks == answerLength) {
                echo("You win teh game! Number of guesses " + player.getGuesses());
                return;
            } else {
                echo("Blacks " + blacks + " Whites " + whites + "\n");
            }
//            echo("Bulls "+  bulls + " Cows " + cows + "\n");

        }

    }

}
