/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import mestarimieli.logiikka.Player;

/**
 *
 * @author lea
 */
class GuessArea1 extends JPanel {

    public GuessArea1(Player player) {

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        addLabels(player);
        add(new JLabel("vittu"));
//        guessArea.add(new JLabel(list));

    }

    public void addLabels(Player player) {
        this.removeAll();
        for (String i : player.getGuessList()) {
            JLabel yx = new JLabel(i);
            add(yx);
//            guessArea.add(Box.createRigidArea(new Dimension(100, 100)));
        }
    }

}
