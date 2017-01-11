/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import mestarimieli.logiikka.Number;

/**
 *
 * @author lea
 */
class LengthListener implements ActionListener {

    private final JTextField length;
    private Number number;
    private final GUI gui;

    public LengthListener(JTextField length, GUI gui, Number number) {
        this.length = length;
       this.number = number;
       this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.number.setAnswerLength(Integer.parseInt(length.getText()));
        number.generateAnswer();
         gui.setNewPane(gui.setGameArea());
    }

}
