package battleship;


import java.awt.Color;

public class Player {
    
    private static Player currentTurn;
    private static Player players[] = new Player[2];
    private int board;

    public static void Reset()
    {
        players[0] = new Player();
        players[1] = new Player();
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
    
}
