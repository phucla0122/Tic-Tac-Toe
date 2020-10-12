import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A class modelling a tic-tac-toe (noughts and crosses, Xs and Os) game in a very
 * simple GUI window.
 * 
 * @author Lynn Marshall
 * @version November 8, 2012
 * 
 * @author Phuc La 
 * @version November 19, 2019
 */

public class TicTacToeFrame extends TicTacToe 
{ 
   private JTextArea status; // text area to print game status
   
   /** 
    * Constructs a new Tic-Tac-Toe board and sets up the basic
    * JFrame containing a JTextArea in a JScrollPane GUI.
    * The constructor initailize JTextArea, JFrame
    * create local container and add JScrollPane to it.
    * Start the game after all the initailization is completed.
    */
   public TicTacToeFrame()
   { 
       // add the necessary code here
       status = new JTextArea();
       JFrame a = new JFrame();
       a.setVisible(true);
       Container content = a.getContentPane();
       JScrollPane b = new JScrollPane(status);
       content.add(b);
       super.playGame();
   }
   
   /**
    * Prints the board to the GUI using toString().
    * Update the game progress using the JTextArea.
    */
    public void print() 
    {  
        status.append(toString()+"\n" +"\n");
        
    }

}