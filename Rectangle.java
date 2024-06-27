/*Rectangle.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Rectangle class that is a subclass of the JComponent class. 
  The Rectangle class defines a length and width and draws a rectangle component using the width
  and length in JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JComponent{    //extends the JComponent class
    
    public int length;  //Variables to hold length and width of the rectangle.
    public int width;
    
    public Rectangle(int w, int l){  //Constructor for Rectangle; Sets the length and width to arguments l and w.
        length = l;
        width = w;
    }
    
    //Overrides the paintComponent method to draw a rectangle using it's length and width
    @Override
    public void paintComponent(Graphics g){
          g.fillRect(25, 25, width, length);
     }
}
