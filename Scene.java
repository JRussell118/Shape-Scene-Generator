/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the Scene class to create a space for all images written in scene

package jaden_russell_project1;
import javax.swing.*;

// Class that defines a scene

class Scene {

    private JFrame window;
    private DrawingPanel drawing;

    // Constructor that must be supplied the height and width of the drawing window for the scene

    public Scene(String name, int height, int width) {
        window = new JFrame(name);
        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawing = new DrawingPanel();
        window.add(drawing);
    }

    // Adds a graphic object to the scene's drawing panel

    public void addImage(Image image) {
        drawing.addImage(image);
    }

    // Causes the drawing panel to be repainted

    public void draw() {
        window.setVisible(true);
        drawing.repaint();
    }
}