/*Sphere.java
 *11/11/2023
 *Jaden Russell
 *This file creates a Sphere class that is a subclass of the JComponent class. 
  The Sphere class defines a radius and loads an image component of a sphere in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Sphere extends JPanel {    //extends the JComponent class

    public int radius;  //Variable to hold the radius of the sphere

    public Sphere(int r) {    //Constructor for Sphere; Sets the radius to the argument r.
        radius = r;
    }

    //Overrides the paintComponent method to find sphere image and draw it in it's own panel
    @Override
    public void paintComponent(Graphics g) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\jaden\\OneDrive\\Documents\\NetBeansProjects\\Project 2 - Jaden Russell\\src\\project\\pkg2\\jaden\\russell\\Sphere.jpg"));
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
