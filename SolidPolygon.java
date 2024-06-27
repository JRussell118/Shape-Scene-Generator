/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the HollowPolygon class to draw solid polygons

package jaden_russell_project1;
import java.awt.*;

// Class that defines all solid polygons

public class SolidPolygon extends Polygon_{
    // Constructor that calls super constructor

    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws solid polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
        graphics.fillPolygon(polygon);
    }
}
