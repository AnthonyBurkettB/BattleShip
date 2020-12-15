package battleship;
import java.awt.*;

public class Ship {
    public enum shipType {SHIP1,SHIP2,SHIP3,SHIP4,SHIP5};
    private shipType type;
    private static Image shipImage1;
    private static Image shipImage2;
    private static Image shipImage3;
    private static Image shipImage4;
    private static Image shipImage5;

    public static void Reset(Battleship _mainclass) {
        shipImage1 = Toolkit.getDefaultToolkit().getImage("./Ship1.png");
        shipImage2 = Toolkit.getDefaultToolkit().getImage("./Ship2.png");
        shipImage3 = Toolkit.getDefaultToolkit().getImage("./Ship3.png");
        shipImage4 = Toolkit.getDefaultToolkit().getImage("./Ship4.png");
        shipImage5 = Toolkit.getDefaultToolkit().getImage("./Ship5.png");
    }

    Ship(shipType _type)
    {
        type = _type;        
        int randomVal = (int)(Math.random() * 5);
        if (randomVal == 0) 
            type == shipType.SHIP1;
        if (randomVal == 1) 
            type == shipType.SHIP2;
        if (randomVal == 2) 
            type == shipType.SHIP3;
        if (randomVal == 3) 
            type == shipType.SHIP4;
        if (randomVal == 4) 
            type == shipType.SHIP5;
    }

    public shipType getType() {
        return(type);
    }

    public void draw(Graphics2D g,int row,int column,int xdelta,int ydelta) {
        //change values depending on board
        if (type == shipType.SHIP1)
            Drawing.drawImage(shipImage1,Window.getX(0),Window.getYNormal(0),0.0,2.0,2.0 );
        else if (type == shipType.SHIP2)
            Drawing.drawImage(shipImage2,Window.getX(0),Window.getYNormal(0),0.0,2.0,2.0 );
        else if (type == shipType.SHIP3)
            Drawing.drawImage(shipImage3,Window.getX(0),Window.getYNormal(0),0.0,2.0,2.0 );
        else if (type == shipType.SHIP4)
            Drawing.drawImage(shipImage4,Window.getX(0),Window.getYNormal(0),0.0,2.0,2.0 );
        else if (type == shipType.SHIP5)
            Drawing.drawImage(shipImage5,Window.getX(0),Window.getYNormal(0),0.0,2.0,2.0 );
    }    
    
}
