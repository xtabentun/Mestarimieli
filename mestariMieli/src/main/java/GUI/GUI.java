/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 *
 * @author lzkosone
 */
public class GUI implements Runnable {

    private JFrame frame;
    
    public GUI()  {
        
    }
    
    
    
    @Override
    public void run() {
        frame = new JFrame("Mestarimieli-peli");
        frame.setPreferredSize(new Dimension(200, 100));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE) ;
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
        
     
    }

    private void luoKomponentit(Container contentPane) {
     
    }
    
    public JFrame getFrame() {
        return frame;
    }
    
}