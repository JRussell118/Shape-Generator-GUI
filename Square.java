/*Square.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Square class that is a subclass of the JComponent class. 
  The Square class defines a sideLength and draws a square component using the sideLength in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;

public class Square extends JComponent{    //extends the JComponent class
    
    public int sideLength;  //Variables to hold the side length of the square.
    
    public Square(int s){    //Constructor for Square; Sets the side length to argument s.
        sideLength = s;
    }
    
    //Overrides the paintComponent method to draw a square using it's side length
    @Override
    public void paintComponent(Graphics g){
          g.fillRect(25, 25, sideLength, sideLength);
     }
}
