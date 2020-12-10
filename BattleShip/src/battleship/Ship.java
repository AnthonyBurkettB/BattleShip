package battleship;
import java.awt.*;

public class Ship {
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

}
