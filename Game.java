
/**
 * Write a description of class Game here.
 * Puppeteers the game 
 * @author (Sterling)
 * @version (4/23/26)
 */
public class Game
{
    // instance variables 
    private Board gameBoard;
    private Player player1;
    private Player player2;
    
    /**
     * Makes new game sessions
     * sets the board up and gives player1 "X" and player2 "0"
     */
    public Game() {
        gameBoard = new Board();
        player1 = new Player("X");
        player2 = new Player ("0");
    }
    
    public void play () {
        //added so game can actually start
    }
}

