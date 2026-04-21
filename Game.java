
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables 

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
    }

    public void play() {
        System.out.println("Welcome to Tic-Tac-Toe!");

        displayBoard();
        System.out.println("\n\n\n");

        boolean gameOver = false;
        Player currentPlayer = player1;
        Player otherPlayer = player2;
        while (!gameOver) {
            // execute the current player's turn
            int move = currentPlayer.getMove(gameBoard);
            gameBoard.makeMove(move, currentPlayer.getSymbol());

            displayBoard();
            System.out.println("\n\n\n");

            gameOver = isGameOver();

            // swap players
            Player temp = currentPlayer;
            currentPlayer = otherPlayer;
            otherPlayer = temp;
        }
        System.out.println("Game over.");
        printWinner();
    }

    private void displayBoard() {
        String[][] board = gameBoard.getBoard();
        int size = gameBoard.getSize();
        String result = "";
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == null) {
                    result += "   ";
                } else { 
                    result += " " + board[row][col] + " ";
                }
                if (col < size-1) {
                    result += "|";
                }
            }
            if (row < size-1) {
                result += "\n-----------\n";
            }
        }
        System.out.println(result);
    }

    private boolean isGameOver() {
        // two scenarios: either someone gets 3 in a row or the board fills up
        boolean fullBoard = gameBoard.isBoardFull();
        String winner = gameBoard.determineWinner();

        if (fullBoard || winner != null) {
            return true;
        } else {
            return false;
        }
    }
    
    private void printWinner() {
        String winner = gameBoard.determineWinner();
        if (winner == player1.getSymbol()) {
            System.out.println("Player 1 (" + winner + ") won!");
        } else if (winner == player2.getSymbol()) {
            System.out.println("Player 2 (" + winner + ") won!");
        } else {
            System.out.println("Cat game.");
        }
    }
}
