/*Cone.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Cone class that is a subclass of the JComponent class. 
  The Cone class defines a radius and height and loads an image component of a cube in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Cone extends JPanel {    //extends the JComponent class
    
    public int radius;  //Variable to hold the radius of the cone
    public int height;  //Variable to hold the height of the cone

    public Cone(int r, int h) {    //Constructor for Cone; Sets the radius and height to the arguments r and h.
        radius = r;
        height = h;
    }

    //Overrides the paintComponent method to find cone image and draw it in it's own panel
    @Override
    public void paintComponent(Graphics g) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\jaden\\OneDrive\\Documents\\NetBeansProjects\\Project 2 - Jaden Russell\\src\\project\\pkg2\\jaden\\russell\\Cone.jpg"));
            g.drawImage(image, 0, 0, null);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "The file could not be found.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "The file could not be read.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
