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

/**
 *
 * @author lea
 */
public class UI {
    
     public void echo(String text) {
        System.out.print(text);
    }
     
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int guesses = 0;

    public void run() throws Exception {
        
        Number number = new Number() {};
        
        String answer = number.getAnswer();

        String guess;
        String retval;

        while (true) {
            guesses++;
            echo(answer + "Type number: ");
            echo( guesses + ": ");
            guess = input.readLine();

            retval = number.checkAnswer( guess);
            echo(retval);
            if ("You win teh game!".equals(retval)) {
                exit(0);
            }
        }
    }
    
}
