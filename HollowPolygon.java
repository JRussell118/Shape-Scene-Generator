/// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the HollowPolygon class to draw hollow polygons

package jaden_russell_project1;
import java.awt.*;

// Class that defines all hollow polygons

class HollowPolygon extends Polygon_ {

    // Constructor that calls super constructor

    public HollowPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    // Draws hollow polygon

    @Override
    public void drawPolygon(Graphics graphics, Polygon polygon) {
        graphics.drawPolygon(polygon);
    }
}
