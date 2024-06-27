/*Torus.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Torus class that is a subclass of the JComponent class. 
  The Torus class defines a major and minor radius and loads an image component of a torus in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Torus extends JPanel {    //extends the JComponent class
    
    public int majorR;  //Variable to hold the major radius of the torus
    public int minorR;  //Variable to hold the minor radius of the torus

    public Torus(int r1, int r2) {    //Constructor for Torus; Sets the major and minor radius to the arguments r1 and r2.
        majorR = r1;
        minorR = r2;
    }

    //Overrides the paintComponent method to find torus image and draw it in it's own panel
    @Override
    public void paintComponent(Graphics g) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\jaden\\OneDrive\\Documents\\NetBeansProjects\\Project 2 - Jaden Russell\\src\\project\\pkg2\\jaden\\russell\\Torus.jpg"));
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
