// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the RegularPolygon class to define the dimensions and color of a specifed sided polygon
package jaden_russell_project1;

import java.awt.*;

// Class that defines a solid regular polygon object
public class RegularPolygon extends SolidPolygon {

    // Constructor that initializes the vertices of the rectangle
    public RegularPolygon(Color color, Point center, int sides, int radius) {
        super(color, sides);
        int[] x_points = new int[sides];
        int[] y_points = new int[sides];
        double angle = 2 * Math.PI / sides;

        for (int i = 0; i < sides; i++) {
            double x = center.x + radius * Math.cos(i * angle) ;
            double y = center.y + radius * Math.sin(i * angle);
            x_points[i] = (int) x;
            y_points[i] = (int) y;
        }
        createPolygon(x_points, y_points);
    }
}
