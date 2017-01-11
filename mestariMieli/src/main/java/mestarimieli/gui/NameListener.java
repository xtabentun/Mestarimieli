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
import mestarimieli.logiikka.Player;

/**
 * @author lea
 */
class NameListener implements ActionListener {
    private final JTextField name;
    private final Player player;
    JPanel gamefield;
    GUI frame;

    public NameListener(JTextField name, Player player, GUI frame) {
        this.name = name;
        this.player = player;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.setName(name.getText());
        frame.setNewPane(frame.setNumber());
    }
}
