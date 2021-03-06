/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author araderma
 */
public class GameFrame extends JFrame
{
    private GamePanel       game;
    
    public GameFrame()
    {
        // Add text to title bar 
        super("Space Invaders IV: The Battle Continues");
        
        // Make sure the program exits when the close button is clicked
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        // Create an instance of the Game class and turn on double buffering
        //  to ensure smooth animation
        game = new GamePanel(this); 
        game.setDoubleBuffered(true);
        
        // Add the Breakout instance to this frame's content pane to display it
        this.getContentPane().add(game); 
        this.pack();
        
        // Start the game
        game.start();
        
    }
    
    //added to create a way to delete GameFrame after each game
    public void hook()
    {
        this.dispose();
    }

   
    public static void main(String[] args) 
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
//                new GameFrame().setVisible(true);

                StartScreen newScreen = new StartScreen();
                        
                newScreen.setVisible(true);

                
            }
        });
        
    }
}
