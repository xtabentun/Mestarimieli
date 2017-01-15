/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

import java.util.ArrayList;
import java.util.List;

/**
 * Luokka huolehtii pelaajan nimestä ja ArrayList muotoisesta arvauslistasta.
 *
 * @author lea
 */
public class Player {

    private String name;
    private int guesses;
    private final ArrayList<String> guessList = new ArrayList();
    private final List<int[]> guessCheckList = new ArrayList();

    /**
     * Metodi vain palauttaa.
     *
     * @return Palauttaa guessCheckList-nimisen ArrayList listan.
     */
    public List<int[]> getGuessCheckList() {
        return guessCheckList;
    }

    /**
     * Metodi huolehtii käyttäjän nimestä ja arvausten lukumäärä on määritelty
     * myös täällä.
     *
     */
    public Player() {
        this.name = null;
        guesses = 0;
    }

    /**
     * Metodi lisää arvauksen listaan.
     *
     * @param guess Arvausten määrä.
     */
    public void updateGuessList(String guess) {
        guessList.add(guess);
    }

    /**
     * Metodi, joka on hyödyksi GUIta luodessa.
     *
     * @param guessCheck parametri on taulukko, joka lisätään listaan.
     */
    public void updateGuessCheckList(int[] guessCheck) {
        guessCheckList.add(guessCheck);
    }
    
    public ArrayList<String> getGuessList() {
        return guessList;
    }

    public int getGuesses() {
        return guesses;
    }

    /**
     * Metodi kasvattaa arvausten määrää yhdellä.
     */
    public void guessesGrow() {
        guesses += 1;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}
