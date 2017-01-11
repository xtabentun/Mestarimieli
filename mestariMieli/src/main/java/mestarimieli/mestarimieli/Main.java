/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.mestarimieli;

import mestarimieli.gui.GUI;
import ui.UI;
import javax.swing.SwingUtilities;

/*Mestarimieli-peli, jonka toteutus toimii numeropohjaisena: käyttäjä arvaa
nelikirjaimisen jonon, joka muodostuu numeroista 123456789, 0 ei ole käytössä. Koodipalloja ovat tässä siis numerot 1-9 ja avainpalloja mustat ja valkoiset: e.g. blacks ja whites. 

 */
/** Luokka mahdollistaa Mestarimieli-luokan toiminnan run metodin kautta.
 *
 * @author lzkosone
 */
public class Main {
    
    /** metodi luo uuden m-nimisen Mestarimielen, jonka metodi pistää "pyörimään".
     * 
     * @param args tyypillinen String muotoinen parametri kyseiselle staattiselle metodille.
     * @throws Exception Mahdollistaa toiminnan.
     */
    
    public static void main(String[] args) throws Exception {
        GUI g = new GUI();
        SwingUtilities.invokeLater(g);
            
        UI m = new UI();
        m.run();
    }
    
    //tänne {while(1);}
    
}
