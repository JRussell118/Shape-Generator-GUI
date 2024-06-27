/*Main.java
 *11/10/2023
 *Jaden Russell
 *This file creates a GUI to allow the user to choose an available shape, enter the required
  dimensions to create the shape, and displays the shape in an image to the user with their
  entered dimensions.
 */
package project.pkg2.jaden.russell;

import javax.swing.*;

import java.awt.event.ActionEvent;

public class Main {

    public static void main(String[] args) {
        //Creates the frame of the GUI named "Shape Builder"
        JFrame f = new JFrame("Shape Builder");
        JPanel p = new JPanel();
        JLabel l1 = new JLabel("Choose a shape from the available list:");
        JLabel l2 = new JLabel();
        JTextField t = new JTextField(15);
        JButton b = new JButton("Draw");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creates a list of strings to use in ComboBox to create a dropdown menu
        String[] shapes = {"Circle", "Square", "Triangle", "Rectangle", "Sphere", "Cube", "Cone",
            "Cylinder", "Torus"};

        JComboBox<String> list = new JComboBox<String>(shapes);
        f.add(p);
        p.add(l1);
        p.add(list);
        p.add(l2);

        f.setSize(450, 150);
        f.setVisible(true);

        //Adds an actionlistener to the list of shapes to store the value of the selected shape
        //and adds a textbox to input the dimensions of the shape
        list.addActionListener((ActionEvent e) -> {
            String s = "" + list.getSelectedItem();

            //Switch statment changes the message and resets the textbox when another shape is selected
            switch (s) {
                case "Circle":
                    l2.setText("Enter the radius of your circle:");
                    break;
                case "Square":
                    l2.setText("Enter the side length of your square:");
                    break;
                case "Triangle":
                    l2.setText("Enter the length of each side of your triangle: (separate with commas)");
                    break;
                case "Rectangle":
                    l2.setText("Enter the length and width of your rectangle (separate with commas):");
                    break;
                case "Sphere":
                    l2.setText("Enter the radius of your sphere:");
                    break;
                case "Cube":
                    l2.setText("Enter the edge length of your cube:");
                    break;
                case "Cone":
                    l2.setText("Enter the radius and height of your cone (separate with commas):");
                    break;
                case "Cylinder":
                    l2.setText("Enter the radius and height of your cylinder (separate with commas):");
                    break;
                case "Torus":
                    l2.setText("Enter the major and minor radius of your torus (separate with commas):");
                    break;
            }

            //adds the label and textbox when a shape is selected
            p.add(t);
            t.setText("");
            p.add(b);
        });

        //Adds an actionlistener when the "Draw button is pressed"
        b.addActionListener((ActionEvent e) -> {
            JFrame sFrame;
            JLabel l3 = new JLabel();
            JLabel l4 = new JLabel();
            String s = "" + list.getSelectedItem();
            
            //Switch statment draws the shape chosen in the menu when the button is clicked
            switch (s) {
                case "Circle":
                    //Try-catch to catch any execptions in creating a circle
                    try {
                        //Creates a circle with the user's input radius
                        Circle c = new Circle(Integer.parseInt(t.getText()));
                        
                        //Creates a separate frame for the circle drawing
                        sFrame = new JFrame("Circle Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(c);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The radius you have entered is invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                break;

                case "Square":
                    //Try-catch to catch any execptions in creating a square
                    try {
                        //Creates a square with the user's input radius
                        Square sq = new Square(Integer.parseInt(t.getText()));
                        
                        //Creates a separate frame for the circle drawing
                        sFrame = new JFrame("Square Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(sq);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The side length you have entered is invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "Triangle":
                    //Try-catch to catch any execptions in creating a triangle
                    try {
                        String[] tSides = t.getText().split(", ");
                        
                        //Creates a triangle with the user's input sides
                        Triangle tri = new Triangle(Integer.parseInt(tSides[0]), Integer.parseInt(tSides[1]), Integer.parseInt(tSides[2]));
                        
                        //Creates a separate frame for the triangle drawing
                        sFrame = new JFrame("Triangle Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(tri);
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The side lengths you have entered are invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Rectangle":
                    //Try-catch to catch any execptions in creating a rectangle
                    try {
                        //splits the string int the text box to get individual values
                        String[] rSides = t.getText().split(", ");
                        
                        //Creates a square with the user's input length and width
                        Rectangle r = new Rectangle(Integer.parseInt(rSides[0]), Integer.parseInt(rSides[1]));
                        
                        //Creates a separate frame for the rectangle drawing
                        sFrame = new JFrame("Rectangle Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(r);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The values you have entered are invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case "Sphere":
                    //Try-catch to catch any execptions in creating a sphere
                    try {
                        //Creates a sphere with the user's input radius
                        Sphere sp = new Sphere(Integer.parseInt(t.getText()));
                        
                        //Creates a separate frame for the sphere drawing
                        sFrame = new JFrame("Sphere Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(sp);
                        
                        //Sets a label for the input radius of the sphere and adds it to the panel
                        l3.setText("Radius: " + t.getText());
                        sp.add(l3);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The radius you have entered is invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case "Cube":
                    //Try-catch to catch any execptions in creating a cube
                    try {
                        //Creates a cube with the user's input edge length
                        Cube cu = new Cube(Integer.parseInt(t.getText()));
                        
                        //Creates a separate frame for the cube drawing
                        sFrame = new JFrame("Cube Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(cu);
                        
                        //Sets a label for the input edge length of the cube and adds it to the panel
                        l3.setText("Edge length: " + t.getText());
                        cu.add(l3);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The edge length you have entered is invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Cone":
                    //Try-catch to catch any execptions in creating a cone
                    try {
                        String[] values = t.getText().split(", ");
                        
                        //Creates a cone with the user's input radius and height
                        Cone co = new Cone(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        
                        //Creates a separate frame for the cone drawing
                        sFrame = new JFrame("Cone Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(co);
                        
                        //Sets a label for the input edge length of the cone and adds it to the panel
                        l3.setText("Radius: " + values[0]);
                        l4.setText("Height: " + values[1]);
                        co.add(l3);
                        co.add(l4);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The values you have entered are invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Cylinder":
                    //Try-catch to catch any execptions in creating a cylinder
                    try {
                        String[] values = t.getText().split(", ");
                        
                        //Creates a cylinder with the user's input radius and height
                        Cylinder cy = new Cylinder(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        
                        //Creates a separate frame for the cylinder drawing
                        sFrame = new JFrame("Cylinder Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(cy);
                        
                        //Sets a label for the input radius and height of the cylinder and adds it to the panel
                        l3.setText("Radius: " + values[0]);
                        l4.setText("Height: " + values[1]);
                        cy.add(l3);
                        cy.add(l4);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The values you have entered are invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Torus":
                    //Try-catch to catch any execptions in creating a torus
                    try {
                        String[] values = t.getText().split(", ");
                        
                        //Creates a torus with the user's input radius'
                        Torus to = new Torus(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
                        
                        //Creates a separate frame for the torus drawing
                        sFrame = new JFrame("Torus Drawing");
                        sFrame.setSize(300, 300);
                        sFrame.setVisible(true);
                        sFrame.add(to);
                        
                        //Sets a label for the input radius' of the torus and adds it to the panel
                        l3.setText("Major Radius: " + values[0]);
                        l4.setText("Minor Radius: " + values[1]);
                        to.add(l3);
                        to.add(l4);
                        
                    //Displays an error message if the input value is invalid
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "The values you have entered are invalid.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
            }
        });
    }

}
