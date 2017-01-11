/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.Graphics;

/**
 *
 * @author lea Hahmoluokka mahdollista X ja O vihjeiden graafisempaa ilmaisua varten. 
 */
public class Figure {

    private int x;
    private int y;
    
    /**
     * Konstruktori, jolle annetaan parametreiksi integerit x ja y
     * @param x integer x.
     * @param y integer y.
     */
    
    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
   /**
    * move metodi ottaa parametreikseen integerit dx ja dy jotka kertovat kuvion siirtymän muutoksesta.
    * @param dx leveys.
    * @param dy pituus.
    */
   public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
     
   /**
    * metodi draw piirtää kuvion ympyränä.
    * @param graphics apuna ympyränpiirrossa.
    */
public void draw(Graphics graphics) {
    graphics.fillOval(x, y, 10, 10);
}     

}
