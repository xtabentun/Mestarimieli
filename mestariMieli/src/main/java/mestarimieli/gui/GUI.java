/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import mestarimieli.areas.GuessArea1;
import mestarimieli.listeners.GuessListener;
import mestarimieli.listeners.LengthListener;
import mestarimieli.listeners.NameListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import mestarimieli.logiikka.Player;
import mestarimieli.logiikka.Number;
/**
 * Graafinen käyttöliittymä joka luo uuden ikkunan peliä varten. Käyttäjä voi
 * näin pelata graafisessa ikkunassa.
 * @author lzkosone
 */
public class GUI implements Runnable {

    private JFrame frame;
    private final Player player;
    public Number number;
    private final int stage;
    public boolean won;
    public String list;
    public GuessArea1 guessArea;
    public ArrayList<String> userInput;
    /**
     * Luokan konstruktori.
     */
    public GUI() {
        player = new Player();
        stage = 0;
        won = false;
        number = new Number();
        this.userInput = player.getGuessList();
        this.list = "empty";
        this.guessArea = new GuessArea1(player);
    }
    
    @Override
    public void run() {
        frame = new JFrame("Mestarimieli-peli");
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setBackground(Color.black);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(setPlayerName());
        frame.setJMenuBar(menuBar());
        frame.revalidate();
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * Metodilla voi asettaa mikä paneeli näkyy käyttäjälle instanssin
     * ulkopuolelta.
     * @param p parametripaneeli.
     */
    public void setNewPane(JPanel p) {
        frame.setContentPane(p);
        frame.revalidate();
        frame.pack();
    }

    private JMenuBar menuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        final JMenu aboutMenu = new JMenu("About");
        final JMenu linkMenu = new JMenu("Links");
        return menuBar;
    }
    /**
     * Metodi luo uuden gamefield JPanelin, jolle asetetaan tietyt mitat ja
     * johon asetetaan komponentteja, kuten nappeja ja tekstikenttää. Pelaaja
     * siis käy tässä paneelissa peliä.
     *
     * @return metodi palauttaa JPanel gamefieldin.
     */
    public JPanel setGameArea() {
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.LINE_AXIS));
        JPanel gamefield = gameArea();
        JPanel checkArea = checkArea();
        main.add(gamefield);
        main.add(guessArea);
        main.add(checkArea);
        main.revalidate();
        return main;
    }

    private JPanel checkArea() {
        JPanel historyArea = new JPanel();
        historyArea.add(new JLabel("Check \nHistory"));
        historyArea.setLayout(new BoxLayout(historyArea, BoxLayout.PAGE_AXIS));
        historyArea.setPreferredSize(new Dimension(100, 600));
        historyArea.add(Box.createRigidArea(new Dimension(100, 600)));
        historyArea.setBackground(Color.black);
        historyArea.setBorder(BorderFactory.createLineBorder(Color.GREEN, 8));
        return historyArea;
    }

    private JPanel gameArea() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.GREEN, 8));
        gamefield.add(Box.createVerticalGlue());
        gamefield.setBackground(Color.black);
        JLabel question = new JLabel("Type number: ");
        question.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        JTextField guess = new JTextField();
        guess.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        JLabel hint = new JLabel("Ganbatte!");
        hint.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(guess);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(hint);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        submit.addActionListener(new GuessListener(guess, number, this, player, hint));
        return gamefield;
    }
    /**
     * Metodi tuottaa ensimmäisen kentän peliin elementteineen. Siinä kysytään
     * pelaajan nimeä.
     * @return Metodi palauttaa gamefieldin.
     */
    public JPanel setPlayerName() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.GREEN, 8));
        gamefield.add(Box.createHorizontalGlue());
        gamefield.setBackground(Color.black);
        JLabel question = new JLabel("Who are you?");
        question.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        JTextField name = new JTextField();
        name.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        submit.addActionListener(new NameListener(name, player, this));
        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(name);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        return gamefield;
    }
    /**
     * Metodi luo JPanel-näkymän käyttäjälle, jossa kysytään koodin pituutta.
     * @return palauttaa gamefieldin.
     */
    public JPanel setNumber() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.green, 8));
        gamefield.add(Box.createHorizontalGlue());
        gamefield.setBackground(Color.black);
        JTextArea textbox = new JTextArea();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        JLabel question = new JLabel(player.getName() + ", how long will be your quest? ");
        question.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        JTextField length = new JTextField();
        length.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        gamefield.add(length);
        JButton submit = new JButton("Submit");
        JLabel hint = new JLabel();
        submit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        submit.addActionListener(new LengthListener(length, this, number, hint));
        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(length);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(hint);
        return gamefield;
    }
    public JFrame getFrame() {
        return frame;
    }
}
