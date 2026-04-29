
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
    
    /**
     * puts the symbol on the board from the 1-9
     */
    public void makeMove(int move, String symbol) {
        //turns 1-9 into 0-2 numerals
        int row = (move - 1) / SIZE;
        int col = (move - 1) % SIZE;
        
        board[row][col] = symbol;
    }
    
    /**
     * sees if every spot on board is used
     * @return true if it doesn't return false it is full
     */
    public boolean isBoardFull() {
        //iterates through each row with nested for loop
        for (int row = 0; row < SIZE; row++) {
        for (int col =0; col < SIZE; col++) { //inner loop that iterates every column in said row
              if(board[row][col] == null) { //if one empty is found it means boards not full
                 return false;
                }
            }
        }
        return true;
    }
    
      public String determineWinner() {
    // TODO
    return null;
    }
}
