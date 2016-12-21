/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mestarimieli.mestarimieli;

import java.util.Scanner;

/**
 *
 * @author lzkosone
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Anna ensimmäinen luku: ");
        int luku1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Anna toinen luku: ");
        int luku2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Summa on: " + (luku1+luku2));
    }
    
    public static int summa(int eka, int toka) {
        
        return eka + toka;
    }    
    
    
}
