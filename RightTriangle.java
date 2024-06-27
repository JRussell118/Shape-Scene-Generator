// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the RightTriangle class to define the dimensions and color of a right triangle

package jaden_russell_project1;
import java.awt.*;

// Class that defines a hollow right triangle

class RightTriangle extends HollowPolygon {

    // Constructor that initializes the vertices of the right triangle

    public RightTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] x_points = {upperLeft.x, upperLeft.x, upperLeft.x + width};
        int[] y_points = {upperLeft.y, upperLeft.y + height, upperLeft.y + height};
        createPolygon(x_points, y_points);
    }
}
