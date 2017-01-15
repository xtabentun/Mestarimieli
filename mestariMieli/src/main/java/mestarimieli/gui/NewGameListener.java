/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mestarimieli.mestarimieli.Main;

/**
 *
 * @author lea
 */
public class NewGameListener implements ActionListener {

    public NewGameListener() {
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {    
        Main.start();
        GUI.frame.dispose();
}
    
}
