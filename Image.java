/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the abstract Image class

package jaden_russell_project1;
import java.awt.*;

// Abstract base class that defines all image objects

abstract class Image {

    private Color color;

    // Constructor that can only be called by the subclasses to initialize the color

    public Image(Color color) {
        this.color = color;
    }

    // Sets the color of the image to be drawn. Must be called first by the draw function of the subclasses

    public void colorDrawing(Graphics graphics) {
        graphics.setColor(color);
    }

    abstract void draw(Graphics graphics);
}


