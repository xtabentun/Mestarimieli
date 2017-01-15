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
/**
 * Luokan konstruktori
 * @param player ottaa parametrikseen PLayer luokan playerin.
 */
    public GuessArea1(Player player) {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        addLabels(player);
        add(new JLabel(" "));
    }

    /** 
     * Metodi poistaa käyttäjän syötteet syötehistoriasta ennenkuin lisää uuden JLabelin jokaista arvaushistorian alkiota varten.
     * @param player 
     */
    
    public void addLabels(Player player) {
        this.removeAll();
        for (String i : player.getGuessList()) {
            JLabel yx = new JLabel(i);
            add(yx);
        }
    }

}
