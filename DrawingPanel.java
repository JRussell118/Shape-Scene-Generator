/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the DrawingPanel class to draw all images

package jaden_russell_project1;
import java.awt.*;
import java.util.*;
import javax.swing.*;

// Class that defines the panel for drawing the images

class DrawingPanel extends JPanel {

    private ArrayList<Image> images = new ArrayList<>();

    // Adds a graphic object to the drawing panel

    public void addImage(Image image) {

        images.add(image);
      }

    // Draws all the images on the drawing panel

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        for (Image image : images)
            image.draw(graphics);
    }
}
