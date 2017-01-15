/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lea
 */
class EndGameListener implements ActionListener {

    public EndGameListener() {
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        GUI.frame.dispose();
}
    
}
