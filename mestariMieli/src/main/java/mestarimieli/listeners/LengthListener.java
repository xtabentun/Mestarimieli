/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mestarimieli.gui.GUI;
import mestarimieli.logiikka.Number;

/**
 * Luokka implementoi ActionListenerin.
 *
 * @author lea
 */
public class LengthListener implements ActionListener {

    private final JTextField length;
    private final Number number;
    private final GUI gui;
    private JLabel hint;

    /**
     * Luokan konstruktori.
     *
     * @param length JTextField tyyppinen parametri.
     * @param gui GUI luokan parametri.
     * @param number Number luokan parametri.
     * @param hint JLabel tyyppinen parametri, josta on apua X ja O vihjeiden tulostamisessa ja optimoimisessa.
     */
    public LengthListener(JTextField length, GUI gui, Number number, JLabel hint) {
        this.length = length;
        this.number = number;
        this.gui = gui;
        this.hint = hint;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.number.setAnswerLength(Integer.parseInt(length.getText()));
        int input = Integer.parseInt(length.getText());

        if (input < 1) {
            hint.setText("Teh number is too small, pick some integer between 1-9.");
        } else if (input > 9) {
            hint.setText("Teh number is too big, pick some integer between 1-9. ");
        } 
        number.generateAnswer();
        gui.setNewPane(gui.setGameArea());
    }
    
}
