/*Triangle.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Triangle class that is a subclass of the JComponent class. 
  The Triangle class defines three sides and draws a triangle component using the sides
  in JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JComponent{    //extends the JComponent class
    
    public int sideA;   //Variables to hold the length of the three sides and one angle of the triangle.
    public int sideB;
    public int sideC;
    public double angleA;
    
    //Constructor for Triangle; Sets the length of the three sides to the arguments a, b, and c
    //and calculates the angle of sideA.
    public Triangle(int a, int b, int c){  
        sideA = a;
        sideB = b;
        sideC = c;
        angleA = Math.acos(-(Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2)) / (2 * sideB * sideC));
    }
    
    //Overrides the paintComponent method to draw a triangle using it's sides and calculated angles
    @Override
    public void paintComponent(Graphics g){
        int[] xPoints = {0+25, sideB+25, (int) (Math.cos(angleA) * sideC)+25};
        int[] yPoints = {0+25, 0+25, (int) (Math.sin(angleA) * sideC)+25};
          g.fillPolygon(xPoints, yPoints, 3);
     }
}
