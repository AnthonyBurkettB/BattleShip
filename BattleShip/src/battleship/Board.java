/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Board {
    private final static int NUM_CONNECT = 4;
    private final static int NUM_ROWS = 8;
    private final static int NUM_COLUMNS = 8;
    private final static int CordNUM_ROWS= 8;
    private final static int CordNUM_COLUMNS= 8;  
    private final static int P2NUM_ROWS= 8;  
    private final static int P2NUM_COLUMNS= 8;
    private final static int P2CordNUM_ROWS= 8;
    private final static int P2CordNUM_COLUMNS= 8;
    private static Ship board[][] = new Ship[NUM_ROWS][NUM_COLUMNS];
    private static Ship MBoard[][] = new Ship[CordNUM_ROWS][CordNUM_COLUMNS];
    private static Ship P2Board[][] = new Ship[P2NUM_ROWS][P2NUM_COLUMNS];
    private static Ship P2MBoard[][] = new Ship[P2CordNUM_ROWS][P2CordNUM_COLUMNS];
    boolean CordBoard = false;
    
    public static void Reset() {
//clear the board.
        for (int zrow=0;zrow<NUM_ROWS;zrow++)
            for (int zcol=0;zcol<NUM_COLUMNS;zcol++)
                board[zrow][zcol] = null;  
       // winner = WinState.NO_WIN;
   
    }
    
     public Player getcurrentPlayer() {
         Player currentTurn = new currentTurn();
         return(currentTurn);
     }
    
    public static void Draw(Graphics2D g) {
     //draw grid
     if (currentTurn == players[1]) {
       if (Cordboard == false) {
        int ydelta = Window.getHeight2()/NUM_ROWS;
        int xdelta = Window.getWidth2()/NUM_COLUMNS;
    //    System.out.println(xdelta + " " + ydelta);
 
        g.setColor(Color.black);
        for (int zi = 1;zi<NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<NUM_ROWS;zrow++)
        {
            for (int zcol=0;zcol<NUM_COLUMNS;zcol++)        
            {
                if (board[zrow][zcol] != null)
                    board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta);
            }
        }   
       }
        if (Cordboard == true) {
        int ydelta = Window.getHeight2()/CordNUM_ROWS;
        int xdelta = Window.getWidth2()/CordNUM_COLUMNS;
    //    System.out.println(xdelta + " " + ydelta);
 
        g.setColor(Color.black);
        for (int zi = 1;zi<CordNUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<CordNUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<CordNUM_ROWS;zrow++)
        {
            for (int zcol=0;zcol<CordNUM_COLUMNS;zcol++)        
            {
                if (Mboard[zrow][zcol] != null)
                    Mboard[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta);
            }
        }   
       }
     }
     
     if (currentTurn == players[2]) {
       if (Cordboard == false) {
        int ydelta = Window.getHeight2()/P2NUM_ROWS;
        int xdelta = Window.getWidth2()/P2NUM_COLUMNS;
    //    System.out.println(xdelta + " " + ydelta);
 
        g.setColor(Color.black);
        for (int zi = 1;zi<P2NUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<P2NUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<P2NUM_ROWS;zrow++)
        {
            for (int zcol=0;zcol<P2NUM_COLUMNS;zcol++)        
            {
                if (board[zrow][zcol] != null)
                    board[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta);
            }
        }   
       }
        if (Cordboard == true) {
        int ydelta = Window.getHeight2()/P2CordNUM_ROWS;
        int xdelta = Window.getWidth2()/P2CordNUM_COLUMNS;
    //    System.out.println(xdelta + " " + ydelta);
 
        g.setColor(Color.black);
        for (int zi = 1;zi<P2CordNUM_ROWS;zi++)
        {
            g.drawLine(Window.getX(0),Window.getY(zi*ydelta),
                    Window.getX(Window.getWidth2()),Window.getY(zi*ydelta));
        }
        
        for (int zi = 1;zi<P2CordNUM_COLUMNS;zi++)
        {
            g.drawLine(Window.getX(zi*xdelta),Window.getY(0),
                    Window.getX(zi*xdelta),Window.getY(Window.getHeight2()));
        }
        for (int zrow=0;zrow<P2CordNUM_ROWS;zrow++)
        {
            for (int zcol=0;zcol<P2CordNUM_COLUMNS;zcol++)        
            {
                if (Mboard[zrow][zcol] != null)
                    Mboard[zrow][zcol].draw(g, zrow, zcol,xdelta, ydelta);
            }
        }   
       }
     }
      /*  if (winner == WinState.WIN_P1) {
            g.setColor(Color.red);
            g.setFont(new Font("Arial",Font.PLAIN,50));
            g.drawString("Player 1 Has Won",60,250);                
        } else if (winner == WinState.WIN_P2) {
            g.setColor(Color.black);
            g.setFont(new Font("Arial",Font.PLAIN,50));
            g.drawString("Player 2 Has Won",60,250);                
        }  */
    }
    
}

