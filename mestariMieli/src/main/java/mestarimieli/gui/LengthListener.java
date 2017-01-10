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

    public LengthListener(JTextField length, Number number) {
        this.length = length;
       this.number = number;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        number = new Number(Integer.parseInt(length.getText()));
    }

}
