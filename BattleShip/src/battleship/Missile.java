package battleship;

import java.awt.*;

public class Missile {
    private Color color;
  
  Missile(Color _color)
    {
        color = _color;
    }
    public Color getColor()
    {
        return (color);
    }

    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        g.setColor(color);
        g.fillOval(Window.getX(column*xdelta), Window.getY(row*ydelta), xdelta, ydelta);
    }
    
}
 
