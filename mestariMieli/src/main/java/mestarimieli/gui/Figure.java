/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.gui;

import java.awt.Graphics;

/**
 *
 * @author lea
 */
public class Figure {

    private int x;
    private int y;
    
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
    
   public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
     
public void draw(Graphics graphics) {
    graphics.fillOval(x, y, 10, 10);
}     

}
