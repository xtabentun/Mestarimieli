/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mestarimieli.logiikka.Number;
import mestarimieli.logiikka.Player;

/**
 *
 * @author lea
 */
class GuessListener implements ActionListener {
    private final JTextField guess;
    private final GUI gui;
    private final Number number;
    private final Player player;
    private final JLabel hint;

    public GuessListener(JTextField guess, Number number, GUI gui, Player player, JLabel hint) {
        this.guess = guess;
        this.gui = gui;
        this.number = number;
        this.player = player;
        this.hint = hint;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] retval = number.checkGuess(guess.getText());
        player.updateGuessCheckList(retval);
        player.updateGuessList(guess.getText());
        int blacks = retval[0];
        int whites = retval[1];
        player.guessesGrow();
        if (blacks == number.getAnswerLength()) {
            hint.setText("You win teh game! Number of guesses " + player.getGuesses() + "\n");
            gui.won = true;
        } else {
            hint.setText(printHint(blacks, whites) + " " + number.getAnswer());
        }
    }

    private String printHint(int blacks, int whites) {
        String hint = "";
        for (int i = 0; i < blacks; i++) {
            hint += "O";
        }
        for (int j = 0; j < whites; j++) {
            hint += "X";
        }
        return hint;
    }
}
