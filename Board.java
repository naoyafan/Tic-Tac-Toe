
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
    
    /**
     * Checks board for any three strikes
     * @return "X" or "0" if someone wins, null if not
     */
    public String determineWinner() {
        //checks all rows
        for (int r = 0; r < SIZE; r++) {
            //make sure computer doesn't think 3 nulls means a winner
            //if a = b and b = c then all spots are equal
            if (board[r][0] != null && board[r][0].equals(board[r][1]) && board[r][1].equals(board[r][2])) {
                return board[r][0]; //returns x or 0
            }
        }
        
        //checks all columns
        for (int c = 0; c < SIZE; c++) {
            if (board[0][c] != null && board[0][c].equals(board[1][c]) && board[1][c].equals(board[2][c])) {
                return board[0][c]; //returns x or 0
            }
        }
        
        //checks diagnol from top left 
        if (board[0][0] != null && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0];
        }
        
        //checks diagnol from top right
        if (board[0][2] != null && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return board[0][2];
        }
        
        //If nothing is found
        return null;
    }
    
    /**
     * Will check if certain spot on board is already taken
     * @param move The 1-9 position to check
     * @return true If spot isn't null and false if else
     */
    private boolean isSpotTaken(int move) {
         //turns 1-9 into 0-2 numerals
        int row = (move - 1) / SIZE;
        int col = (move - 1) % SIZE;
        //if spot isn't null means a symbol is already there
        return board[row][col] != null;
    }
    
    /**
     * Determines if a move is within boundry and not taken
     * @param move The one position to validate
     * @return true If move is 1-9 with an empty spot else false
     */
    public boolean isValidMove(int move) {
        int maxSpaces = SIZE * SIZE;
                
        if (move >= 1 && move <= maxSpaces) { //checks if number is on the board
            return !isSpotTaken(move); //want true if spots not taken
        }
        return false; //number either <1 or >9
    }
}
