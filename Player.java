import java.util.Random;
/**
 * Write a description of class Player here.
 * represents the players
 * @author (Sterling)
 * @version (4/23/26)
 */
public class Player
{
   private String symbol;
   
   /**
    * makes player and gives it unique symbol
    * @param symbol The symbol for player
    */
   public Player(String symbol) {
       this.symbol = symbol;  //won't return null
   }
   
   /**
    * @return the players symbol
    */
   public String getSymbol() {
       return symbol;
   }
   
   /**
    * makes a random move from 1 and number of spaces
    * @param b Current board played on
    * @return Integer represents the move chosen from 1-maxSpaces
    */
   public int getMove(Board b) {
    Random rand = new Random();
    int maxSpaces = b.getSize() * b.getSize(); //3x3=9 
    int move = rand.nextInt(maxSpaces) + 1; //guess
    
    //If the guess isn't valid pick new ones till it is
    while (!b.isValidMove(move)) {  
        move = rand.nextInt(maxSpaces) + 1;
    }
    return move; //move is valid when the loop breaks
   }
}
