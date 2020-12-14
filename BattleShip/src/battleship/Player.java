/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;
import java.awt.Color;

public class Player {
    
    private static Player currentTurn;
    private static Player players[] = new Player[2];
  
    public static void Reset()
    {
        if (players[0] == null) {
            
        }
        currentTurn = players[0];
    }
   
    public static Player GetCurrentPlayer()
    {
        return(currentTurn);
    }

    public static void SwitchTurn()
    {
        if (currentTurn == players[0])
            currentTurn = players[1];
        else
            currentTurn = players[0];
    }    
    
   /* Player(Color _color)
    {
        color = _color;
    }
    public Color getColor()
    {
        return (color);
    }  */

        
}
