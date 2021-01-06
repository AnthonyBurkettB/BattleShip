/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Graphics2D;
import java.awt.Image;

/**
 *
 * @author Gage
 */
public class Drawing {
    private static Graphics2D g;
    private static BattleShip mainClassInst;

    public static void setDrawingInfo(Graphics2D _g,BattleShip _mainClassInst) {
        g = _g;
        mainClassInst = _mainClassInst;
    }
    
    public static void drawImage(Image image,int xpos,int ypos,double rot,double xscale,
            double yscale) {
        int width = image.getWidth(mainClassInst);
        int height = image.getHeight(mainClassInst);
        g.translate(xpos,ypos);
        g.rotate(rot  * Math.PI/180.0);
        g.scale( xscale , yscale );

        g.drawImage(image,-width/2,-height/2,
        width,height,mainClassInst);

        g.scale( 1.0/xscale,1.0/yscale );
        g.rotate(-rot  * Math.PI/180.0);
        g.translate(-xpos,-ypos);
    }    
}
