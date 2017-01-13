/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import java.awt.GridLayout;
import java.util.List;

import java.awt.Font;
import java.util.ArrayList;
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
 * Graafinen käyttöliittymä joka luo uuden ikkunan peliä varten. Käyttäjä voi
 * näin pelata graafisessa ikkunassa.
 *
 * @author lzkosone
 */
public class GUI implements Runnable {

    private JFrame frame;
    private final Player player;
    public Number number;
    private final int stage;
    public boolean won;

    public ArrayList<String> userInput;


    /**
     * Luokan konstruktori.
     *
     */
    public GUI() {
        player = new Player();
        stage = 0;
        won = false;
        number = new Number();
        this.userInput = player.getGuessList();
    }

    @Override
    public void run() {
        frame = new JFrame("Mestarimieli-peli");
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setBackground(Color.black);     
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
//        frame.setContentPane();
//        frame.setContentPane(setPlayerName());
        frame.revalidate();
        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.LINE_AXIS);
        container.setLayout(layout);
        container.add(guessArea());
        container.add(historyArea());      
        container.add(setPlayerName());
    }

    /**
     * Metodilla voi asettaa mikä paneeli näkyy käyttäjälle instanssin
     * ulkopuolelta.
     *
     * @param p parametripaneeli.
     */
    public void setNewPane(JPanel p) {
        frame.setContentPane(p);
        frame.revalidate();
        frame.pack();
    }

    private JMenuBar menuBar() {
        JMenuBar menuBar = null;
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
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 8));
        gamefield.add(Box.createHorizontalGlue());
        gamefield.setBackground(Color.black);
        
        JLabel question = new JLabel("Type number: ");
        question.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        JTextField guess = new JTextField();
        guess.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        JLabel hint = new JLabel("Ganbatte!");
        hint.setFont(new Font("Comic Sans MS", Font.BOLD, 26));

        JTextArea history = new JTextArea();
        history.setBackground(Color.WHITE); 
//        createComponents(frame.getContentPane());
        gamefield.add(question);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
      
//        gamefield.add(history);
//        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(guess);
        gamefield.add(Box.createRigidArea(new Dimension(100, 20)));
        gamefield.add(submit);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(hint);
        gamefield.add(Box.createRigidArea(new Dimension(100, 100)));
        gamefield.add(guessArea());
        submit.addActionListener(new GuessListener(guess, number, this, player, hint, history));
        return gamefield;
    }
    
    public JPanel setPlayerName() {
        

        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.magenta, 2));
        gamefield.add(Box.createHorizontalGlue());
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
     *
     * @return palauttaa gamefieldin.
     */
    public JPanel setNumber() {
        JPanel gamefield = new JPanel();
        gamefield.setLayout(new BoxLayout(gamefield, BoxLayout.PAGE_AXIS));
        gamefield.setBorder(BorderFactory.createLineBorder(Color.magenta, 2));
        gamefield.add(Box.createHorizontalGlue());
        gamefield.setBackground(Color.black);
       
  
        JTextArea textbox = new JTextArea();
        gamefield.setLayout(new GridLayout(2, 1));
        JLabel question = new JLabel(player.getName() + ", how long will be your quest? ");
        question.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
        JTextField length = new JTextField();
        length.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        gamefield.add(length);
        JButton submit = new JButton("Submit");
        submit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        submit.addActionListener(new LengthListener(length, this, number));
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


    public JPanel guessArea() {
       JPanel guessArea = new JPanel();
        guessArea.setLayout(new BoxLayout(guessArea, BoxLayout.PAGE_AXIS));
        
        for ( String i : userInput) {
            JLabel yx = new JLabel(i);
           guessArea.add(yx);
           guessArea.add(Box.createRigidArea(new Dimension(100, 100)));
            
        }
     
//        userInput.add(guess.getText());
//        history.setText(userInput.toString());
        
        return guessArea;
    }

    private JPanel historyArea() {
                
        JPanel historyArea = new JPanel();
        historyArea.setLayout(new BoxLayout(historyArea, BoxLayout.PAGE_AXIS));
        return historyArea;

    }

    
    
    /**
     * Metodi tulee tuottamaan kentän, jossa käyttäjä näkee syötehistoriansa ja
     * voi arvioida koodia tämän perusteella.
     *
     * @return palauttaa JPanel everythingin.
     */
//    public JPanel historyArea() {
//        JPanel everything = new JPanel();
//        everything.setLayout(new BoxLayout(everything, BoxLayout.PAGE_AXIS));
//        JLabel teksti = new JLabel("Pelin_kenttä");
//        JButton nappi = new JButton("Click!");
//        JTextArea textAreaVasen = new JTextArea("Le Kopioija");
//        everything.add(teksti);
//        everything.add(nappi);
//        return everything;
//    }
}
