/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import mestarimieli.logiikka.Player;
import mestarimieli.logiikka.Number;

/**
 * Graafinen käyttöliittymä joka luo uuden ikkunan peliä varten.
 *
 * @author lzkosone
 */
public class GUI implements Runnable {

    private JFrame frame;

    private final Player player;
    public Number number;
    private int stage;

    /**
     * Luokka luo framen pelille.
     *
     */
    public GUI() {
        player = new Player();
        stage = 0;
    }

    @Override
    public void run() {
        frame = new JFrame("Mestarimieli-peli");
        frame.setPreferredSize(new Dimension(300, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        createComponents(frame.getContentPane());
        frame.getContentPane().add(guessArea());
        frame.setContentPane(setNumber());
        frame.revalidate(); // frame.pack() if you want to resize.
//         frame.getContentPane().add(setNumber());

        frame.pack();
        frame.setVisible(true);

    }

    private JMenuBar menuBar() {
        JMenuBar menuBar = null;

        return menuBar;
    }

    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.LINE_AXIS);
        container.setLayout(layout);

        container.add(guessArea());
//        container.add(setNumber());
        container.add(historyArea());

    }

    private JPanel guessArea() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        gamefield.add(Box.createHorizontalGlue());

//        
        JLabel question = new JLabel("Who are you?");

        JTextField name = new JTextField();
        gamefield.add(name);

        JButton submit = new JButton("Submit");

        submit.addActionListener(new NameListener(name, player, gamefield));

        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(name);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));

        return gamefield;
    }

    private JPanel setPlayerName() {

        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        gamefield.add(Box.createHorizontalGlue());
//        JLabel question = new JLabel("Who are you?");
//        
//        JTextField name = new JTextField();
//        gamefield.add(name);
//
//        JButton submit = new JButton("Submit");
//
//        submit.addActionListener(new NameListener(name, player, gamefield));
//
//        gamefield.add(question);
//        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
//        gamefield.add(name);
//        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
//        gamefield.add(submit);
//        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
//       
        return gamefield;

    }

    
    private JPanel setNumber() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.darkGray, 2));
        gamefield.add(Box.createHorizontalGlue());
        JLabel question = new JLabel(player.getName() + ", how long will be your quest? ");

        JTextField length = new JTextField();
        gamefield.add(length);

        JButton submit = new JButton("Submit");

        submit.addActionListener(new LengthListener(length, number));

        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(length);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));

        return gamefield;
    }

    public JFrame getFrame() {
        return frame;
    }
public JPanel historyArea() {
        JPanel everything = new JPanel();

        everything.setLayout(new BoxLayout(everything, BoxLayout.PAGE_AXIS));

        JLabel teksti = new JLabel("Pelin_kenttä");
        JButton nappi = new JButton("Click!");
        JTextArea textAreaVasen = new JTextArea("Le Kopioija");

        everything.add(teksti);
        everything.add(nappi);

        return everything;
    }
    
//    private Container getContentPane() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
