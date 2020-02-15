/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author mortera.mattjairoort
 */

public class SpaceInvaders extends JFrame {
    // Lo spazio immenso (il Canvas incui dipingere la scena del gioco
    private Space space = new Space();

    //private Graphics graphics;

    public SpaceInvaders() throws InterruptedException {
        super("Space Invaders"); //diamo un titolo alla finestra di gioco
        // quando premo la X della finestra voglio terminare il gioco/programma
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        // aggiungo lo spazio profondo alla finestra di gioco
        this.setResizable(false);
        setIgnoreRepaint(true);

        
        // avvia l'introduzione
        Intro intro = new Intro();
        this.add(intro);
        // impacchetto il tutto e rendi visibile
        this.pack();
        this.setVisible(true);


        intro.run();
//        this.remove(intro);
//        this.add(space);
        
    }
    public static void main(String[] args) throws InterruptedException {
       new SpaceInvaders();
    }
    
}
