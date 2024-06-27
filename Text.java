// Jaden Russell
// 6/12/2023
// Project 1
// Creates and defines the Text class to define the color, location, and string to display

package jaden_russell_project1;
import java.awt.*;


public class Text extends Image{
    
    private String str;
    private int x;
    private int y;
    
    public Text(Color color, Point loc, String t){
        super(color);
        str = t;
        x = loc.x;
        y = loc.y;
    }
    
    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(str, x, y);
    }
    
}
