// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the IsoscelesTriangle class to define the dimensions and color of an isosceles triangle

package jaden_russell_project1;
import java.awt.*;

// Class that defines a solid isosceles triangle

public class IsoscelesTriangle extends SolidPolygon{
    
    // Constructor that initializes the vertices of the isosceles triangle

    public IsoscelesTriangle(Color color, Point top, int height, int width) {
        super(color, 3);
        int[] x_points = {top.x, top.x + (width/2), top.x - (width/2)};
        int[] y_points = {top.y, top.y + height, top.y + height};
        createPolygon(x_points, y_points);
    }
}
