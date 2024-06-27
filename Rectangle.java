// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the Rectangle class to define the dimensions and color of a rectangle

package jaden_russell_project1;
import java.awt.*;

// Class that defines a hollow rectangle object

class Rectangle extends HollowPolygon {

    // Constructor that initializes the vertices of the rectangle

    public Rectangle(Color color, Point upperLeft, int height, int width) {
        super(color, 4);
        int[] x_points = {upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x};
        int[] y_points = {upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
