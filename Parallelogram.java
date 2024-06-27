// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the Parallelogram class to define the dimensions and color of a parallelogram

package jaden_russell_project1;
import java.awt.*;

// Class that defines a solid parallelogram object

public class Parallelogram extends SolidPolygon{
    // Constructor that initializes the vertices of the Parallelogram

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int offset) {
        super(color, 4);
        int[] x_points = {upperLeft.x,  upperLeft.x + (lowerRight.x - upperLeft.x) + offset, lowerRight.x, lowerRight.x - (lowerRight.x - upperLeft.x) - offset};
        int[] y_points = {upperLeft.y , upperLeft.y,lowerRight.y, lowerRight.y};
        createPolygon(x_points, y_points);
    }
}
