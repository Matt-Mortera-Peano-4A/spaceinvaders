/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author mortera.mattjairoort
 */
public class Intro extends Space{
     private int i = 0;
    private BufferStrategy strategy;
        
    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        for(i=100;i>=0;i-=1) {
            System.out.println("i: " + i);
            disegna();
            Thread.sleep(10);
        }
        //Thread.sleep(100);
        for(i=0;i<10;i+=1) {
            System.out.println("i: " + i);
            disegna();
            //Thread.sleep(10);
        }
    }
    

        
   

    private void disegna() {
         Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
         g.setColor(Color.red);
            // Seleziona i Font della scritta (Bold) e la dimensione dei caratteri (40)
            g.setFont(new Font("Bold", Font.PLAIN, 40));
            // Scrivi partendo dalla posizione x=100 e y=100
            g.drawString("Space Invaders", 100, 100);
            g.setFont(new Font("Bold", Font.PLAIN, 10));
            g.drawString("          by Mortera Matt", 110, 110);     
    }
}
