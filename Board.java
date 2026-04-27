
/**
 * Write a description of class Board here.
 * represents the board
 * @author (Sterling)
 * @version (4/23/26)
 */
public class Board
{
    //instance variables
    private String[][] board;
    private static final int SIZE = 3;
    
    /**
     * makes a new board going off the set SIZE
     */
    public Board() {
        board = new String[SIZE][SIZE];
    }
    
    /**
     * @return 2D array board
     */
    public String[][] getBoard() {
        return board;
    }
    
    /**
     * @return SIZE of the board
     */
    public int getSize() {
        return SIZE;
    }
    
    public void makeMove(int move, String symbol) {
    // TODO
    }
    
    public String determineWinner() {
    // TODO
    return null;
    }
    
    public boolean isBoardFull() {
    // TODO
    return false;
    }
}
