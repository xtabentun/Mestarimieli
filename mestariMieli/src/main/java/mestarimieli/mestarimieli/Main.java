/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.mestarimieli;

import gui.GUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import mestarimieli.mestarimieli.Mestarimieli;
import javax.swing.SwingUtilities;

/*Mestarimieli-peli, jonka toteutus toimii numeropohjaisena: käyttäjä arvaa
nelikirjaimisen jonon, joka muodostuu numeroista 123456789, 0 ei ole käytössä. Koodipalloja ovat tässä siis numerot 1-9 ja avainpalloja mustat ja valkoiset: e.g. blacks ja whites. 

 */
/** Luokka mahdollistaa Mestarimieli-luokan toiminnan run metodin kautta.
 *
 * @author lzkosone
 */
public class Main {
    public static void main(String[] args) throws Exception {
        GUI g = new GUI();
        SwingUtilities.invokeLater(g);
   
        Mestarimieli m = new Mestarimieli();
        m.run(); 
    }
}
