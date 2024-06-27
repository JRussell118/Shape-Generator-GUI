/*Circle.java
 *11/11/2023
 *Jaden Russell
 *This file creates a Circle class that is a subclass of the JComponent class. 
  The Circle class defines a radius and draws a circle component using the radius in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;

public class Circle extends JComponent{    //extends the JComponent class
    
    public int radius;  //Variable to hold the radius of the circle
    
    public Circle(int r){    //Constructor for Circle; Sets the radius to the argument r.
        radius = r;
    }
    
    //Overrides the paintComponent method to draw a circle using it's radius
    @Override
    public void paintComponent(Graphics g){
          g.fillOval(25, 25, radius*2, radius*2);
     }
    
}