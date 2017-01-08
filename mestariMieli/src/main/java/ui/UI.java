/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.exit;
import mestarimieli.logiikka.Number;
import mestarimieli.logiikka.Player;

/**
 *
 * @author lea
 */
public class UI {

    public void echo(String text) {
        System.out.print(text);
    }

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private boolean won = false;

    public void run() throws Exception {

        echo("Who are you? ");
        String name = input.readLine();

        Player player = new Player(name);

        echo(name + ", how long will be your quest? ");
        String x = input.readLine();
        int answerLength = Integer.parseInt(x);

        Number number = new Number(answerLength) {
        };

        String answer = number.getAnswer();
        String guess;
        int[] retval;

        while (true) {

            if (won) {
                echo("Do you want to continue? ( y/n)\n");
                String cont = input.readLine();
                if (cont.equals("n")) {
                    exit(0);
                }
                if (!cont.equals("y")) {
                    echo("Not an answer!"); 
                    continue;
                } else { won = false;}
            }
            player.guessesGrow();
            echo(answer + "Type number: ");

            guess = input.readLine();

            if (!number.checkGuessLength(guess)) {
                echo("Wrong length\n");
                continue;
            }

            retval = number.checkGuess(guess);
            int blacks = retval[0];
            int whites = retval[1];
//            echo("Blacks " + blacks + " Whites " + whites + "\n");
            if (blacks == answerLength) {
                echo("You win teh game! Number of guesses " + player.getGuesses());
                won = true;
//                continue;
            } else {
                echo("Blacks " + blacks + " Whites " + whites + "\n");
            }
//            echo("Bulls "+  bulls + " Cows " + cows + "\n");

        }

    }

}
