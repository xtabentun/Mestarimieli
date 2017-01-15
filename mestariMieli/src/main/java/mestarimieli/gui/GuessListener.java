/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mestarimieli.logiikka.Number;
import mestarimieli.logiikka.Player;

/**
 * Luokka implementoi ActionListener:n. Luokka havainnoi käyttäjän syötteitä
 * niin, että tulostaa tietyn määrän X ja O merkkejä, sekä voittotekstin ja
 * arvausten määrän jos käyttäjä arvaa oikein.
 *
 * @author lea
 */
class GuessListener implements ActionListener {

    private final JTextField guess;
    private final GUI gui;
    private final Number number;
    private final Player player;
    private final JLabel hint;
    private final String list;
    public GuessArea1 guessArea;

    /**
     * Luokan konstruktori.
     *
     * @param guess JTextField parametri.
     * @param number Number luokan parametri.
     * @param gui GUI luokan parametri.
     * @param player Player luokan parametri.
     * @param hint JLabel tyyppinen parametri.
     */
    public GuessListener(JTextField guess, Number number, GUI gui, Player player, JLabel hint) {
        this.guess = guess;
        this.gui = gui;
        this.number = number;
        this.player = player;
        this.hint = hint;
        this.list = gui.list;
        this.guessArea = gui.guessArea;   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[] retval = number.checkGuess(guess.getText());

        player.updateGuessCheckList(retval);
        player.updateGuessList(guess.getText());
        System.out.println(player.getGuessList());

        int blacks = retval[0];
        int whites = retval[1];
        player.guessesGrow();
        if (blacks == number.getAnswerLength()) {
            hint.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
            hint.setText("You win teh game! Number of guesses " + player.getGuesses() + "\n");
            gui.won = true;
        } else {
            hint.setText(printHint(blacks, whites));
        }
        gui.guessArea.addLabels(player);
    }

    /**
     * Metodi tuottaa käyttäjälle vihjeen siitä, kuinka lähellä arvaus on
     * oikeaa. Tulostaa X-merkkeinä valkoiset ja O-merkkeinä mustat.
     *
     * @param blacks integeri kuvaa oikealla paikalla olevien oikeiden
     * numeroiden määrää.
     * @param whites integeri kuvaa väärällä paikalla olevien oikeiden
     * numeroiden määrää.
     * @return palauttaa hint'n.
     */
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
