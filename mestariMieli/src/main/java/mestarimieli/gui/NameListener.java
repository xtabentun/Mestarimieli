/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mestarimieli.logiikka.Number;
import mestarimieli.logiikka.Player;


 /**
 * @author lea
 */
class NameListener implements ActionListener {

    private JTextField name;
    private Player player1;
    JPanel gamefield;
   

    public NameListener(JTextField name, Player player1, JPanel gamefield) {
        this.name = name;
        this.player1 = player1;
        this.gamefield = gamefield;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player1.setName(name.getText());
        
    }

}
