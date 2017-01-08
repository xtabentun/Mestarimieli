/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.logiikka;

/**
 *
 * @author lea
 */
public class Player {

    private final String name;
    private int guesses ;

    public Player(String name) {
        this.name = name;
        guesses=0;
    }

    public int getGuesses() {
        return guesses;
    }

//    public void setGuesses(int guesses) {
//        this.guesses = guesses;
//        
//    }
    
    public void guessesGrow() {
       guesses+=1;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

}
