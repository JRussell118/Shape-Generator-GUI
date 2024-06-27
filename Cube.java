/*Cube.java
 *11/12/2023
 *Jaden Russell
 *This file creates a Cube class that is a subclass of the JComponent class. 
  The Cube class defines an edge length and loads an image component of a cube in
  JComponent's paintComponent method.*/
package project.pkg2.jaden.russell;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Cube extends JPanel {    //extends the JComponent class

    public int edgeLength;  //Variable to hold the edge length of the cube

    public Cube(int e) {    //Constructor for Cube; Sets the edge length to the argument e.
        edgeLength = e;
    }

    //Overrides the paintComponent method to find cube image and draw it in it's own panel
    @Override
    public void paintComponent(Graphics g) {
        try {
            BufferedImage image = ImageIO.read(new File("C:\\Users\\jaden\\OneDrive\\Documents\\NetBeansProjects\\Project 2 - Jaden Russell\\src\\project\\pkg2\\jaden\\russell\\Cube.jpg"));
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
