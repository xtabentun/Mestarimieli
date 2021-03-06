/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mestarimieli.gui.GUI;
import mestarimieli.gui.GUI;
import mestarimieli.gui.GUI;
import mestarimieli.logiikka.Player;

/**
 * Luokka implementoi Actionlistener:n.
 * @author lea
 */
public class NameListener implements ActionListener {
    public final JTextField name;
    public final Player player;
    public  JPanel gamefield;
    GUI frame;

    /**
     * Luokan konstruktori.
     * @param name parametri nimen kirjoittamiskenttää varten.
     * @param player Player luokan parametri.
     * @param frame GUI luokan parametri.
     */
    
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
